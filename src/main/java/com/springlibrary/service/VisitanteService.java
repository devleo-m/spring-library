package com.springlibrary.service;

import com.springlibrary.entity.VisitanteEntity;

import java.util.List;

public interface VisitanteService {
    VisitanteEntity criarUsuario(VisitanteEntity visitante);

    VisitanteEntity buscarUsuarioPorId(Long id);

    VisitanteEntity atualizarUsuario(Long id, VisitanteEntity visitante);

    void excluirUsuario(Long id);

    List<VisitanteEntity> listarUsuarios();
}
