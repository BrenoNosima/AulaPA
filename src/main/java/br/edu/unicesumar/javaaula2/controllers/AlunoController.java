package br.edu.unicesumar.javaaula2.controllers;

import br.edu.unicesumar.javaaula2.models.AlunoModel;
import br.edu.unicesumar.javaaula2.repositories.AlunoRepository;
import br.edu.unicesumar.javaaula2.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/schools")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel> findAll()
    {
        return alunoService.findAll();
    }
}
