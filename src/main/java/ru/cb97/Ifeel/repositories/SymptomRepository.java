package ru.cb97.Ifeel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cb97.Ifeel.tracking.Symptom;

public interface SymptomRepository extends JpaRepository<Symptom, Long> {
}
