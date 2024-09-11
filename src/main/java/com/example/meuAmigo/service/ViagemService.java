package com.example.meuAmigo.service;

import com.example.meuAmigo.model.Viagem;

import java.util.List;


public interface ViagemService {
    //salvar viagem
    Viagem salvarViagem (Viagem viagem);

    //buscar todas as viagens
    List<Viagem> buscarViagens ();

    //buscar por nomeDeViagem
    Viagem buscarPorNomeViagem (String nomeViagem);

    //buscar por parceiro de viagem



}
