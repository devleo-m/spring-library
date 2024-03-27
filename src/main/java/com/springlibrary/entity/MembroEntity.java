package com.springlibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

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
}
