package br.edu.unicesumar.PA1B.repositories;

import br.edu.unicesumar.PA1B.models.ProfModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfRepository extends JpaRepository<ProfModel, Long> {
}
