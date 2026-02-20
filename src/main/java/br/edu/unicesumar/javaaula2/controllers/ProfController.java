package br.edu.unicesumar.javaaula2.controllers;

import br.edu.unicesumar.javaaula2.models.ProfModel;
import br.edu.unicesumar.javaaula2.services.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/prof")
public class ProfController {
    @Autowired
    private ProfService profService;

    @GetMapping
    public List<ProfModel> findAll() {
        return profService.findAll();
    }

}
