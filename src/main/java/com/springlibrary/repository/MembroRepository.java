package com.springlibrary.repository;

import com.springlibrary.entity.MembroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE MembroEntity m SET m.nome_membro = :nome, m.endereco_membro = :endereco, m.telefone_membro = :telefone WHERE m.id_membro = :id")
    void atualizarMembro(Long id, String nome, String endereco, String telefone);

}
