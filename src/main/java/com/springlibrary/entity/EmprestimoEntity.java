package com.springlibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "emprestimos")
public class EmprestimoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_emprestimo;

    // Relacionamento com LivroEntity
    @ManyToOne
    @JoinColumn(name = "id_livro", referencedColumnName = "id_livro")
    private LivroEntity id_livro;

    // Relacionamento com MembroEntity
    @ManyToOne
    @JoinColumn(name = "id_membro", referencedColumnName = "id_membro")
    private MembroEntity id_membro;

    private Date data_emprestimo;
    private Date data_devolucao;

}
