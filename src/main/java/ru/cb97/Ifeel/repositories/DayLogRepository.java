package ru.cb97.Ifeel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cb97.Ifeel.tracking.DayLog;

import java.time.LocalDate;
import java.util.List;

public interface DayLogRepository extends JpaRepository<DayLog, Long> {
    List<DayLog> findByDayBetween(LocalDate startDate, LocalDate endDate);
}
