package com.example.meuAmigo.repository;

import com.example.meuAmigo.model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepository  extends JpaRepository<Viagem, Integer> {
}
