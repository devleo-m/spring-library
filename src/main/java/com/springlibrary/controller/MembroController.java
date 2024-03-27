package com.springlibrary.controller;

import com.springlibrary.entity.LivroEntity;
import com.springlibrary.entity.MembroEntity;
import com.springlibrary.service.MembroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/membros")
public class MembroController {
    private final MembroService membroService;
    public MembroController(MembroService membroService) {
        this.membroService = membroService;
    }

    @PostMapping()
    public MembroEntity criarMembro(@RequestBody MembroEntity membro){
        return membroService.criarMembro(membro);
    }
    @GetMapping()
    public List<MembroEntity> listarMembros(){
        return membroService.listarMembros();
    }
    @DeleteMapping("{id}")
    public void deletarMembro(@PathVariable Long id){
        membroService.excluirMembro(id);
    }
    @PutMapping("{id}")
    public MembroEntity mudarMembroPorId(@PathVariable Long id, @RequestBody MembroEntity membro){
        return membroService.atualizarMembro(id, membro);
    }
}
