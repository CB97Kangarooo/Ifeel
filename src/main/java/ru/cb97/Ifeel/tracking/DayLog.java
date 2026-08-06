package ru.cb97.Ifeel.tracking;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DayLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    @Column(nullable = false)
    private LocalDate day;
    private int energy;
    @Enumerated(EnumType.STRING)
    private Mood mood;
    private String note;
    @OneToMany(mappedBy = "dayLog")
    private Set<SymptomRating> symptomRatings = new HashSet<>();
}
