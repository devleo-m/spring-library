package com.springlibrary.service;
import com.springlibrary.entity.LivroEntity;
import java.util.List;

public interface LivroService {

    LivroService criarLivro(LivroEntity livro);

    List<LivroEntity> listarLivro();

    LivroService buscarLivroPorId(Long id);

    LivroService atualizarLivro(Long id, LivroEntity livro);

    void excluirLivro(Long id);
}
