package ru.cb97.Ifeel.DTO;

import ru.cb97.Ifeel.tracking.Mood;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public record DayLogDTO(Long userId, LocalDate day, int energy, Mood mood, String note, Set<SymptomRatingDTO> symptomRatings) {
    public record SymptomRatingDTO(Long symptomId, int severity) {}
    public DayLogDTO {
        if(symptomRatings == null){
            symptomRatings = new HashSet<>();
        }
    }
}
