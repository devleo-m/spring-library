package com.springlibrary.service;

import com.springlibrary.entity.BibliotecarioEntity;

import java.util.List;

public interface BibliotecarioService {
    BibliotecarioEntity criarBibliotecario(BibliotecarioEntity bibliotecario);

    BibliotecarioEntity buscarBibliotecarioPorId(Long id);

    BibliotecarioEntity atualizarBibliotecario(Long id, BibliotecarioEntity bibliotecario);

    void excluirBibliotecario(Long id);

    List<BibliotecarioEntity> listarBibliotecario();
}
