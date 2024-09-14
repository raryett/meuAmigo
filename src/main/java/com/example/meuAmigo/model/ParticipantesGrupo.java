package com.example.meuAmigo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter

public class ParticipantesGrupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idParticipantes;
    //FK viagemGrupo
    @ManyToOne
    @JoinColumn (name = "idViagemGrupo", nullable=false)
    @JsonBackReference
    private ViagensGrupo viagensGrupo;
    private String nomeParticipante;
    private String contatoParticipante;


}
