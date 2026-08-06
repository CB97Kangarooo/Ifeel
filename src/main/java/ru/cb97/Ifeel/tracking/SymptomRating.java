package ru.cb97.Ifeel.tracking;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SymptomRating {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(name = "day_log_id")
    private DayLog dayLog;
    @ManyToOne @JoinColumn(name = "symptom_id")
    private Symptom symptom;
    private int severity;
}
