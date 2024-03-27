package com.springlibrary.service;

import com.springlibrary.entity.MembroEntity;

import java.util.List;

public interface MembroService {
    MembroEntity criarMembro(MembroEntity membro);

    MembroEntity buscarMembroPorId(Long id);

    MembroEntity atualizarMembro(Long id, MembroEntity membro);

    void excluirMembro(Long id);

    List<MembroEntity> listarMembros();
}
