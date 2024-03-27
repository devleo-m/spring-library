package com.springlibrary.controller;

import com.springlibrary.entity.LivroEntity;
import com.springlibrary.service.LivroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping()
    public LivroEntity criarLivro(@RequestBody LivroEntity livro){
        return livroService.criarLivro(livro);
    }
}
