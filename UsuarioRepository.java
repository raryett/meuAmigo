package com.example.meuAmigo.repository;

import com.example.meuAmigo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //aqui eu estou criando um findBy para ser usado ja que ele nao existe na base
    Optional<Usuario> findByEmail(String email);

}
