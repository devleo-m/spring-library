package com.springlibrary.service;

import com.springlibrary.entity.EmprestimoEntity;
import java.util.List;

public interface EmprestimoService {
    EmprestimoEntity criarEmprestimo(EmprestimoEntity emprestimo);

    List<EmprestimoEntity> listarEmprestimo();

    EmprestimoEntity buscarEmprestimoPorId(Long id);

    EmprestimoEntity atualizarEmprestimo(Long id, EmprestimoEntity emprestimo);

    void excluirEmprestimo(Long id);
}
