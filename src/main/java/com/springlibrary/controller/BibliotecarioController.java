package com.springlibrary.controller;

import com.springlibrary.entity.BibliotecarioEntity;
import com.springlibrary.service.BibliotecarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {
    private final BibliotecarioService bibliotecarioService;
    public BibliotecarioController(BibliotecarioService bibliotecarioService) {
        this.bibliotecarioService = bibliotecarioService;
    }

    @PostMapping()
    public BibliotecarioEntity criarBibliotecario(@RequestBody BibliotecarioEntity bibliotecario){
        return bibliotecarioService.criarBibliotecario(bibliotecario);
    }
}
