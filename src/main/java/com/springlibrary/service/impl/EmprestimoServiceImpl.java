package com.springlibrary.service.impl;

import com.springlibrary.entity.EmprestimoEntity;
import com.springlibrary.repository.EmprestimoRepository;
import com.springlibrary.service.EmprestimoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmprestimoServiceImpl implements EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoServiceImpl(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }


    @Override
    public EmprestimoEntity criarEmprestimo(EmprestimoEntity emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    @Override
    public List<EmprestimoEntity> listarEmprestimo() {
        return emprestimoRepository.findAll();
    }

    @Override
    public EmprestimoEntity buscarEmprestimoPorId(Long id) {
        return emprestimoRepository.findById(id).orElse(null);
    }

    @Override
    public EmprestimoEntity atualizarEmprestimo(Long id, EmprestimoEntity emprestimo) {
        if (emprestimoRepository.existsById(id)) {
            emprestimo.setId_emprestimo(id);
            return emprestimoRepository.save(emprestimo);
        }
        return null;
    }

    @Override
    public void excluirEmprestimo(Long id) {
        emprestimoRepository.deleteById(id);
    }
}
