package com.springlibrary.controller;

import com.springlibrary.entity.BibliotecarioEntity;
import com.springlibrary.service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/bibliotecarios")
public class BibliotecarioController {
    private final BibliotecarioService bibliotecarioService;
    public BibliotecarioController(BibliotecarioService bibliotecarioService) {
        this.bibliotecarioService = bibliotecarioService;
    }
    @PostMapping() //CARD 3
    public BibliotecarioEntity criarBibliotecario(@RequestBody BibliotecarioEntity bibliotecario){
        return bibliotecarioService.criarBibliotecario(bibliotecario);
    }
    @GetMapping()
    public List<BibliotecarioEntity> listarBibliotecarios(){
        return bibliotecarioService.listarBibliotecario();
    }
    @DeleteMapping("{id}")
    public void deletarBibliotecario(@PathVariable Long id){
        bibliotecarioService.excluirBibliotecario(id);
    }
    @PutMapping("{id}")
    public BibliotecarioEntity mudarBibliotecarioPorId(@PathVariable Long id, @RequestBody BibliotecarioEntity usuario){
        return bibliotecarioService.atualizarBibliotecario(id, usuario);
    }
}
