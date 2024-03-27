package com.springlibrary.service;
import com.springlibrary.entity.LivroEntity;
import java.util.List;

public interface LivroService {

    LivroEntity criarLivro(LivroEntity livro);

    List<LivroEntity> listarLivro();

    LivroEntity buscarLivroPorId(Long id);

    LivroEntity atualizarLivro(Long id, LivroEntity livro);

    void excluirLivro(Long id);
}
