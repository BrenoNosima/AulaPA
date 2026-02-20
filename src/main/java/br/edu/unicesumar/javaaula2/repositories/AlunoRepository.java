package br.edu.unicesumar.javaaula2.repositories;

import br.edu.unicesumar.javaaula2.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}
