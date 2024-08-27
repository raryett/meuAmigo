package com.example.meuAmigo.repository;

import com.example.meuAmigo.model.ParticipantesGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantesGruposRepository extends JpaRepository<ParticipantesGrupo,Integer> {
}
