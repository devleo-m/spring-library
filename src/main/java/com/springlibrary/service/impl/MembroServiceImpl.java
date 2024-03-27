package com.springlibrary.service.impl;

import com.springlibrary.entity.MembroEntity;
import com.springlibrary.repository.MembroRepository;
import com.springlibrary.service.MembroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroServiceImpl implements MembroService {

    private final MembroRepository membroRepository;

    public MembroServiceImpl(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    @Override
    public MembroEntity criarMembro(MembroEntity membro) {
        return membroRepository.save(membro);
    }

    @Override
    public MembroEntity buscarMembroPorId(Long id) {
        return membroRepository.findById(id).orElse(null);
    }

    @Override
    public MembroEntity atualizarMembro(Long id, MembroEntity membro) {
        if (membroRepository.existsById(id)){
            membro.setId_membro(id);
            return membroRepository.save(membro);
        }
        return null;
    }

    @Override
    public void excluirMembro(Long id) {
        membroRepository.deleteById(id);
    }

    @Override
    public List<MembroEntity> listarMembros() {
        return membroRepository.findAll();
    }
}
