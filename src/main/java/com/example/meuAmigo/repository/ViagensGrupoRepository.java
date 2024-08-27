package com.example.meuAmigo.repository;

import com.example.meuAmigo.model.ViagensGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagensGrupoRepository  extends JpaRepository<ViagensGrupo, Integer> {
}
