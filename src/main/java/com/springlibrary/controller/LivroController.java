package com.springlibrary.controller;

import com.springlibrary.entity.EmprestimoEntity;
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
    @DeleteMapping("{id}")
    public void deletarLivro(@PathVariable Long id){
        livroService.excluirLivro(id);
    }
    @PutMapping("{id}")
    public LivroEntity mudarLivroPorId(@PathVariable Long id, @RequestBody LivroEntity livro){
        return livroService.atualizarLivro(id, livro);
    }
}
