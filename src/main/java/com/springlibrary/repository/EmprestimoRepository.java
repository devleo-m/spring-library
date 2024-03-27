package com.springlibrary.repository;

import com.springlibrary.entity.EmprestimoEntity;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE EmprestimoEntity e SET e.data_emprestimo = :emprestimo, e.data_devolucao = :devolucao WHERE e.id_emprestimo = :id")
    void atualizarEmprestimo(Long id, Date emprestimo, Date devolucao);

}
