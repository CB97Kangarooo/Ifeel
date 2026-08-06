package ru.cb97.Ifeel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cb97.Ifeel.tracking.SymptomRating;

public interface SymptomRatingRepository extends JpaRepository<SymptomRating, Long> {
}
