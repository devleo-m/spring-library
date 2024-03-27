package com.springlibrary.service.impl;

import com.springlibrary.entity.LivroEntity;
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

//    @Override
//    public MembroEntity atualizarMembro(Long id, MembroEntity membro) {
//        if (membroRepository.existsById(id)){
//            membro.setId_membro(id);
//            return membroRepository.save(membro);
//        }
//        return null;
//    }
    @Override
    public MembroEntity atualizarMembro(Long id, MembroEntity membro) {
        // Verifica se o livro com o ID fornecido existe
        MembroEntity membroExistente = membroRepository.findById(id).orElse(null);
        // Se o livro existir, atualiza suas propriedades com os valores do livro fornecido
        if (membroExistente != null) {
            membroExistente.setNome_membro(membro.getNome_membro());
            membroExistente.setEndereco_membro(membro.getEndereco_membro());
            membroExistente.setTelefone_membro(membro.getTelefone_membro());
            // Salva as alterações no banco de dados
            membroRepository.save(membroExistente);
        }
        return membroExistente;
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
