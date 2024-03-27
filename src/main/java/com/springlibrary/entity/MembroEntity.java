package com.springlibrary.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "membro")
public class MembroEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_membro;
    private String nome_membro;
    private String endereco_membro;
    private String telefone_membro;


    @JsonIgnore //Arruma o bug do array infinito de livros com emprestimo
    @OneToMany(mappedBy = "id_membro", cascade = CascadeType.ALL, orphanRemoval = true) // Relacionamento com EmprestimoEntity
    private List<EmprestimoEntity> emprestimos = new ArrayList<>();
}
