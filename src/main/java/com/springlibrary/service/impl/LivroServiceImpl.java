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
        // Verifica se o livro com o ID fornecido existe
        LivroEntity livroExistente = livroRepository.findById(id).orElse(null);
        // Se o livro existir, atualiza suas propriedades com os valores do livro fornecido
        if (livroExistente != null) {
            livroExistente.setTitulo_livro(livro.getTitulo_livro());
            livroExistente.setAutor_livro(livro.getAutor_livro());
            livroExistente.setAno_publicacao(livro.getAno_publicacao());
            // Salva as alterações no banco de dados
            livroRepository.save(livroExistente);
        }
        return livroExistente;
    }

    @Override
    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
