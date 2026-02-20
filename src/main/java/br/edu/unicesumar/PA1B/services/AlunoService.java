package br.edu.unicesumar.PA1B.services;

import br.edu.unicesumar.PA1B.models.AlunoModel;
import br.edu.unicesumar.PA1B.repositories.AlunoRepository;
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

    public AlunoModel criar(AlunoModel alunoModel) {
        return alunoRepository.save(alunoModel);
    }
}
