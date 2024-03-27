package com.springlibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "livro")
public class LivroEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_livro;
    private String titulo_livro;
    private String autor_livro;
    private Integer ano_publicacao;
}
