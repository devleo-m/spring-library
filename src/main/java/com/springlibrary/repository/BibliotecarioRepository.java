package com.springlibrary.repository;

import com.springlibrary.entity.BibliotecarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE BibliotecarioEntity b SET b.nome_bibliotecario = :nome, b.email_bibliotecario = :email, b.senha_bibliotecario = :senha WHERE b.id_bibliotecario = :id")
    void atualizarBibliotecario(Long id, String nome, String email, String senha);
}
