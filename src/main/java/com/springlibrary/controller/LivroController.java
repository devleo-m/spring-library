package com.springlibrary.controller;

import com.springlibrary.entity.LivroEntity;
import com.springlibrary.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping()
    public LivroEntity criarLivro(@RequestBody LivroEntity livro){
        return livroService.criarLivro(livro);
    }

    @GetMapping()
    public List<LivroEntity> listarLivros(){
        return livroService.listarLivro();
    }
}
