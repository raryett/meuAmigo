package com.example.meuAmigo.service;

import com.example.meuAmigo.model.ViagensGrupo;

import java.util.List;

public interface ViagensGrupoService {

    //salvar Viagem em Grupo
    ViagensGrupo salvarViagensGrupo (ViagensGrupo viagensGrupo);

    //listar Viagens
    List<ViagensGrupo> buscarViagensGrupos ();




}
