package com.springlibrary.controller;

import com.springlibrary.entity.BibliotecarioEntity;
import com.springlibrary.entity.EmprestimoEntity;
import com.springlibrary.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {
    private final EmprestimoService emprestimoService;
    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }
    @PostMapping()
    public EmprestimoEntity criarEmprestimo(@RequestBody EmprestimoEntity emprestimo){
        return emprestimoService.criarEmprestimo(emprestimo);
    }
    @GetMapping()
    public List<EmprestimoEntity> listarEmprestimos(){
        return emprestimoService.listarEmprestimo();
    }
    @DeleteMapping("{id}")
    public void deletarEmprestimo(@PathVariable Long id){
        emprestimoService.excluirEmprestimo(id);
    }
    @PutMapping("{id}")
    public EmprestimoEntity mudarEmprestimoPorId(@PathVariable Long id, @RequestBody EmprestimoEntity emprestimo){
        return emprestimoService.atualizarEmprestimo(id, emprestimo);
    }
}
