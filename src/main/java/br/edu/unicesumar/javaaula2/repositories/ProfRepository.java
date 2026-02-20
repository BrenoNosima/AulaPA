package br.edu.unicesumar.javaaula2.repositories;

import br.edu.unicesumar.javaaula2.models.ProfModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfRepository extends JpaRepository<ProfModel, Long> {
}
