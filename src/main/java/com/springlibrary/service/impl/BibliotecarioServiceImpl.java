package com.springlibrary.service.impl;

import com.springlibrary.entity.BibliotecarioEntity;
import com.springlibrary.repository.BibliotecarioRepository;
import com.springlibrary.service.BibliotecarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioServiceImpl implements BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioServiceImpl(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }

    @Override
    public BibliotecarioEntity criarBibliotecario(BibliotecarioEntity bibliotecario) {
        return bibliotecarioRepository.save(bibliotecario);
    }

    @Override
    public BibliotecarioEntity buscarBibliotecarioPorId(Long id) {
        return bibliotecarioRepository.findById(id).orElse(null);
    }

//    @Override
//    public BibliotecarioEntity atualizarBibliotecario(Long id, BibliotecarioEntity bibliotecario) {
//        if (bibliotecarioRepository.existsById(id)) {
//            bibliotecario.setId_bibliotecario(id);
//            return bibliotecarioRepository.save(bibliotecario);
//        }
//        return null;
//    }
    @Override
    public BibliotecarioEntity atualizarBibliotecario(Long id, BibliotecarioEntity bibliotecario) {
        // Verifica se o bibliotecário com o ID fornecido existe
        BibliotecarioEntity bibliotecarioExistente = bibliotecarioRepository.findById(id).orElse(null);
        // Se o bibliotecário existir, atualiza suas propriedades com os valores do bibliotecário fornecido
        if (bibliotecarioExistente != null) {
            bibliotecarioExistente.setNome_bibliotecario(bibliotecario.getNome_bibliotecario());
            bibliotecarioExistente.setEmail_bibliotecario(bibliotecario.getEmail_bibliotecario());
            bibliotecarioExistente.setSenha_bibliotecario(bibliotecario.getSenha_bibliotecario());
            // Salva as alterações no banco de dados
            return bibliotecarioRepository.save(bibliotecarioExistente);
        }
        return null; // Retorna null se o bibliotecário não for encontrado
    }
    @Override
    public void excluirBibliotecario(Long id) {
        bibliotecarioRepository.deleteById(id);
    }

    @Override
    public List<BibliotecarioEntity> listarBibliotecario() {
        return bibliotecarioRepository.findAll();
    }
}
