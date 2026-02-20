package br.edu.unicesumar.PA1B.services;

import br.edu.unicesumar.PA1B.models.ProfModel;
import br.edu.unicesumar.PA1B.repositories.ProfRepository;
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

    public ProfModel criar(ProfModel profModel) {
        return profRepository.save(profModel);
    }
}
