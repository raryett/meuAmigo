package com.example.meuAmigo.service;

import com.example.meuAmigo.dto.UsuarioDto;
import com.example.meuAmigo.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    //salvar um usuario
    Usuario salvarUsuario(UsuarioDto usuarioDto);


    //achar todos os usuarios
    public List<UsuarioDto> todosUsuarios();

//    ///achar um usuario especifico
//    Optional<Usuario> buscaPorId(Integer idUsuario);


}
