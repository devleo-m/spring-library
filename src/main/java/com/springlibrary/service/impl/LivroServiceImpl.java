package com.springlibrary.service.impl;

import com.springlibrary.entity.LivroEntity;
import com.springlibrary.repository.LivroRepository;
import com.springlibrary.service.LivroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    private final LivroRepository livroRepository;

    public LivroServiceImpl(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    public LivroEntity criarLivro(LivroEntity livro) {
        return livroRepository.save(livro);
    }

    @Override
    public List<LivroEntity> listarLivro() {
        return livroRepository.findAll();
    }

    @Override
    public LivroEntity buscarLivroPorId(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    @Override
    public LivroEntity atualizarLivro(Long id, LivroEntity livro) {
        if (livroRepository.existsById(id)) {
            livro.setId_livro(id);
            return livroRepository.save(livro);
        }
        return null;
    }

    @Override
    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
