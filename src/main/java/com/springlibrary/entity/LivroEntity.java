package com.springlibrary.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @JsonIgnore //Arruma o bug do array infinito de livros com emprestimo
    @OneToMany(mappedBy = "id_livro", cascade = CascadeType.ALL, orphanRemoval = true) // Relacionamento com EmprestimoEntity
    private List<EmprestimoEntity> emprestimos = new ArrayList<>();
}
