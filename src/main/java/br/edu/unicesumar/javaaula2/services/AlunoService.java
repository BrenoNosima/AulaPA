package br.edu.unicesumar.javaaula2.services;

import br.edu.unicesumar.javaaula2.models.AlunoModel;
import br.edu.unicesumar.javaaula2.models.ProfModel;
import br.edu.unicesumar.javaaula2.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> findAll() {
        return alunoRepository.findAll();
    }
}
