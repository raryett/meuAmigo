package com.example.meuAmigo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Getter
@Setter
public class ViagensGrupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViagemGrupo;
    @NotNull
    private String nomeGrupo;
    @NotNull
    private String destino;
    @NotNull
    private Date dataViagem;
    private String passagemAviao;
    @Column(columnDefinition = "TEXT")
    private String roteiro;
    @Column(columnDefinition = "TEXT")
    private String observacoes;

}
