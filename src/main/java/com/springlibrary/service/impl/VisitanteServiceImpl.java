package com.springlibrary.service.impl;

import com.springlibrary.entity.LivroEntity;
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

//    @Override
//    public VisitanteEntity atualizarVisitante(Long id, VisitanteEntity visitante) {
//        if (visitanteRepository.existsById(id)){
//            visitante.setId_visitante(id);
//            return visitanteRepository.save(visitante);
//        }
//        return null;
//    }
    @Override
    public VisitanteEntity atualizarVisitante(Long id, VisitanteEntity visitante) {
        // Verifica se o livro com o ID fornecido existe
        VisitanteEntity visitanteExistente = visitanteRepository.findById(id).orElse(null);
        // Se o livro existir, atualiza suas propriedades com os valores do livro fornecido
        if (visitanteExistente != null) {
            visitanteExistente.setNome_visitante(visitante.getNome_visitante());
            visitanteExistente.setTelefone_visitante(visitante.getTelefone_visitante());
            // Salva as alterações no banco de dados
            visitanteRepository.save(visitanteExistente);
        }
        return visitanteExistente;
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
