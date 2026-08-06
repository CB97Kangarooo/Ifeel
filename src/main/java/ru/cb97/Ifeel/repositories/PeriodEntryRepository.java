package ru.cb97.Ifeel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cb97.Ifeel.tracking.PeriodEntry;

public interface PeriodEntryRepository extends JpaRepository<PeriodEntry, Long> {

}
