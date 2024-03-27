package com.springlibrary.controller;

import com.springlibrary.entity.MembroEntity;
import com.springlibrary.service.MembroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membro")
public class MembroController {
    private final MembroService membroService;

    public MembroController(MembroService membroService) {
        this.membroService = membroService;
    }

    @PostMapping()
    public MembroEntity criarMembro(@RequestBody MembroEntity membro){
        return membroService.criarMembro(membro);
    }
}
