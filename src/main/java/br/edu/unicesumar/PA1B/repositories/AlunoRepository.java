package br.edu.unicesumar.PA1B.repositories;

import br.edu.unicesumar.PA1B.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}
