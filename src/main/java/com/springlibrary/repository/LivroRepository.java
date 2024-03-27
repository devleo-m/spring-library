package com.springlibrary.repository;

import com.springlibrary.entity.LivroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE LivroEntity l SET l.titulo_livro = :titulo, l.autor_livro = :autor, l.ano_publicacao = :ano WHERE l.id_livro = :id")
    void atualizarLivro(Long id, String titulo, String autor, Integer ano);

}
