package com.example.meuAmigo.service;

import com.example.meuAmigo.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    ///achar um usuario especifico
    public Optional<Usuario> usuarioPorId(Integer id);

    //achar todos os usuarios
    public List<Usuario> todosUsuarios();


}
