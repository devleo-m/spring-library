package com.springlibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "bibliotecarios")
public class BibliotecarioEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bibliotecario;
    private String nome_bibliotecario;
    private String email_bibliotecario;
    private String senha_bibliotecario;
}
