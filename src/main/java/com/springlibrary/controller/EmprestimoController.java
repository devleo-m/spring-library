package com.springlibrary.controller;

import com.springlibrary.entity.EmprestimoEntity;
import com.springlibrary.service.EmprestimoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emprestimos")
public class EmprestimoController {
    private final EmprestimoService emprestimoService;
    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping()
    public EmprestimoEntity criarLivro(@RequestBody EmprestimoEntity emprestimo){
        return emprestimoService.criarEmprestimo(emprestimo);
    }

}
