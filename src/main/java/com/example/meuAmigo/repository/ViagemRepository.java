package com.example.meuAmigo.repository;

import com.example.meuAmigo.model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ViagemRepository  extends JpaRepository<Viagem, Integer> {

        Optional<Viagem> findByNome(String nomeViagem);
}
