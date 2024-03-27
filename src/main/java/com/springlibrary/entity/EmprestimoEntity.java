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
    private Long id_livro;
    private Long id_membro;
    private Date data_emprestimo;
    private Date data_devolucao;

}
