package com.springlibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "visitante")
public class VisitanteEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_visitante;
    private String nome_visitante;
    private String telefone_visitante;
}
