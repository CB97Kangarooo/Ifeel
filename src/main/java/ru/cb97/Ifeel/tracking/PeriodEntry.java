package ru.cb97.Ifeel.tracking;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PeriodEntry {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    @Column(nullable = false)
    private LocalDate startDate;
    private LocalDate endDate;
}
