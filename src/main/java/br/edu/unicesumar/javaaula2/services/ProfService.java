package br.edu.unicesumar.javaaula2.services;

import br.edu.unicesumar.javaaula2.models.ProfModel;
import br.edu.unicesumar.javaaula2.repositories.AlunoRepository;
import br.edu.unicesumar.javaaula2.repositories.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfService {

    @Autowired
    private ProfRepository profRepository;

    public List<ProfModel> findAll(){
        return profRepository.findAll();
    }
}
