package ru.cb97.Ifeel.DTO;

import ru.cb97.Ifeel.tracking.Mood;
import java.time.LocalDate;
import java.util.Set;

public record DayLogAnswer(LocalDate day, int energy, Mood mood, String note, Set<SymptomRatingAnswer> symptomRatings) {
    public record SymptomRatingAnswer(String name, String description, int severity) {}
}
