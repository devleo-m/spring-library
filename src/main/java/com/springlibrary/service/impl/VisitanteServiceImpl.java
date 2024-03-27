package com.springlibrary.service.impl;

import com.springlibrary.entity.VisitanteEntity;
import com.springlibrary.repository.VisitanteRepository;
import com.springlibrary.service.VisitanteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteServiceImpl implements VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public VisitanteServiceImpl(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }

    @Override
    public VisitanteEntity criarVisitante(VisitanteEntity visitante) {
        return visitanteRepository.save(visitante);
    }

    @Override
    public VisitanteEntity buscarVisitantePorId(Long id) {
        return visitanteRepository.findById(id).orElse(null);
    }

    @Override
    public VisitanteEntity atualizarVisitante(Long id, VisitanteEntity visitante) {
        if (visitanteRepository.existsById(id)){
            visitante.setId_visitante(id);
            return visitanteRepository.save(visitante);
        }
        return null;
    }

    @Override
    public void excluirVisitante(Long id) {
        visitanteRepository.deleteById(id);
    }

    @Override
    public List<VisitanteEntity> listarVisitantes() {
        return visitanteRepository.findAll();
    }
}
