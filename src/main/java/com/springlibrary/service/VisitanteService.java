package com.springlibrary.service;

import com.springlibrary.entity.VisitanteEntity;

import java.util.List;

public interface VisitanteService {
    VisitanteEntity criarVisitante(VisitanteEntity visitante);

    VisitanteEntity buscarVisitantePorId(Long id);

    VisitanteEntity atualizarVisitante(Long id, VisitanteEntity visitante);

    void excluirVisitante(Long id);

    List<VisitanteEntity> listarVisitantes();
}
