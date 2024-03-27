package com.springlibrary.repository;

import com.springlibrary.entity.VisitanteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE VisitanteEntity v SET v.nome_visitante = :nome, v.telefone_visitante = :telefone WHERE v.id_visitante = :id")
    void atualizarVisitante(Long id, String nome, String telefone);

}
