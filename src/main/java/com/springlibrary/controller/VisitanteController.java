package com.springlibrary.controller;

import com.springlibrary.entity.VisitanteEntity;
import com.springlibrary.service.VisitanteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitante")
public class VisitanteController {
    private final VisitanteService visitanteService;
    public VisitanteController(VisitanteService visitanteService) {
        this.visitanteService = visitanteService;
    }

    @PostMapping()
    public VisitanteEntity criarVisitante(@RequestBody VisitanteEntity visitante){
        return visitanteService.criarVisitante(visitante);
    }
}
