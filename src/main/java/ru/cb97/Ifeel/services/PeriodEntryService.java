package ru.cb97.Ifeel.services;

import org.springframework.stereotype.Service;
import ru.cb97.Ifeel.DTO.PeriodDTO;
import ru.cb97.Ifeel.repositories.PeriodEntryRepository;
import ru.cb97.Ifeel.tracking.PeriodEntry;

import java.util.List;

@Service
public class PeriodEntryService {
    private final PeriodEntryRepository repository;
    public PeriodEntryService(PeriodEntryRepository repository) {
        this.repository = repository;
    }
    public PeriodEntry createPeriodEntry(PeriodDTO info){
        PeriodEntry periodEntry = new PeriodEntry();
        periodEntry.setUserId(info.userId());
        periodEntry.setStartDate(info.startDate());
        periodEntry.setEndDate(info.endDate());
        return repository.save(periodEntry);
    }
    public List<PeriodEntry> getAllPeriods() {
        return repository.findAll();
    }
}
