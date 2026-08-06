package ru.cb97.Ifeel.DTO;

import java.time.LocalDate;

public record PeriodDTO(Long userId, LocalDate startDate, LocalDate endDate) {}
