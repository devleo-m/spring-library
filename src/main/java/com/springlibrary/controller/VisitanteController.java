package com.springlibrary.controller;

import com.springlibrary.entity.LivroEntity;
import com.springlibrary.entity.VisitanteEntity;
import com.springlibrary.service.VisitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitantes")
public class VisitanteController {
    private final VisitanteService visitanteService;
    public VisitanteController(VisitanteService visitanteService) {
        this.visitanteService = visitanteService;
    }
    @PostMapping()
    public VisitanteEntity criarVisitante(@RequestBody VisitanteEntity visitante){
        return visitanteService.criarVisitante(visitante);
    }
    @GetMapping()
    public List<VisitanteEntity> listarLivros(){
        return visitanteService.listarVisitantes();
    }
    @DeleteMapping("{id}")
    public void deletarVisitante(@PathVariable Long id){
        visitanteService.excluirVisitante(id);
    }
    @PutMapping("{id}")
    public VisitanteEntity mudarVisitantePorId(@PathVariable Long id, @RequestBody VisitanteEntity visitante){
        return visitanteService.atualizarVisitante(id, visitante);
    }
}
