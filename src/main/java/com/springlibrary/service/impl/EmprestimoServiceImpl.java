package com.springlibrary.service.impl;

import com.springlibrary.entity.EmprestimoEntity;
import com.springlibrary.entity.LivroEntity;
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

//    @Override
//    public EmprestimoEntity atualizarEmprestimo(Long id, EmprestimoEntity emprestimo) {
//        if (emprestimoRepository.existsById(id)) {
//            emprestimo.setId_emprestimo(id);
//            return emprestimoRepository.save(emprestimo);
//        }
//        return null;
//    }
    @Override
    public EmprestimoEntity atualizarEmprestimo(Long id, EmprestimoEntity emprestimo) {
        // Verifica se o livro com o ID fornecido existe
        EmprestimoEntity emprestimoExistente = emprestimoRepository.findById(id).orElse(null);
        // Se o livro existir, atualiza suas propriedades com os valores do livro fornecido
        if (emprestimoExistente != null) {
            emprestimoExistente.setData_emprestimo(emprestimo.getData_emprestimo());
            emprestimoExistente.setData_devolucao(emprestimo.getData_devolucao());
            // Salva as alterações no banco de dados
            emprestimoRepository.save(emprestimoExistente);
        }
        return emprestimoExistente;
    }


    @Override
    public void excluirEmprestimo(Long id) {
        emprestimoRepository.deleteById(id);
    }
}
