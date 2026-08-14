package ru.cb97.Ifeel.services;

import org.springframework.stereotype.Service;
import ru.cb97.Ifeel.DTO.DayLogAnswer;
import ru.cb97.Ifeel.DTO.DayLogDTO;
import ru.cb97.Ifeel.repositories.DayLogRepository;
import ru.cb97.Ifeel.repositories.SymptomRepository;
import ru.cb97.Ifeel.tracking.DayLog;
import ru.cb97.Ifeel.tracking.Symptom;
import ru.cb97.Ifeel.tracking.SymptomRating;

import java.util.HashSet;
import java.util.Set;

@Service
public class DayLogService {
    private final DayLogRepository dayLogRepository;
    private final SymptomRepository symptomRepository;
    public DayLogService(DayLogRepository dayLogRepository, SymptomRepository symptomRepository) {
        this.dayLogRepository = dayLogRepository;
        this.symptomRepository = symptomRepository;
    }
    public DayLogAnswer createDayLog(DayLogDTO info) {
        DayLog dayLog = new DayLog();
        dayLog.setUserId(info.userId());
        dayLog.setDay(info.day());
        dayLog.setEnergy(info.energy());
        dayLog.setMood(info.mood());
        dayLog.setNote(info.note());
        for(DayLogDTO.SymptomRatingDTO symptomRatingDTO : info.symptomRatings()){
            Symptom s = findSymptom(symptomRatingDTO.symptomId(), info.userId());
            SymptomRating rating = new SymptomRating();
            rating.setSymptom(s);
            rating.setSeverity(symptomRatingDTO.severity());
            rating.setDayLog(dayLog);
            dayLog.getSymptomRatings().add(rating);
        }
        dayLogRepository.save(dayLog);
        Set<DayLogAnswer.SymptomRatingAnswer> symptomsAnswerSet = new HashSet<>();
        for(SymptomRating symptomRating : dayLog.getSymptomRatings()){
            Symptom s = symptomRating.getSymptom();
            symptomsAnswerSet.add(new DayLogAnswer.SymptomRatingAnswer(s.getName(), s.getDescription(), symptomRating.getSeverity()));
        }
        return new DayLogAnswer(dayLog.getDay(), dayLog.getEnergy(), dayLog.getMood(), dayLog.getNote(), symptomsAnswerSet);
    }
    private Symptom findSymptom(Long id, Long userId) {
        Symptom symptom = symptomRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Этого симптома не существует на Вашем аккаунте"));
        if ((symptom.getCreatedByUserId() != null)&&(!symptom.getCreatedByUserId().equals(userId))){
            throw new IllegalArgumentException("Этого симптома не существует на Вашем аккаунте");
        }
        return symptom;
    }
}
