package com.example.meuAmigo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import jakarta.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViagem;

    // FK Usuario
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    @JsonBackReference
    private Usuario usuario;

    @NotNull
    private String nomeViagem;

    @NotNull
    private String destino;

    @NotNull
    private Date dataViagem;

    private String passagemAviao;

    private String hospedagem;

    @Column(columnDefinition = "TEXT")
    private String roteiro;

    @Column(columnDefinition = "TEXT")
    private String detalhes;





}
