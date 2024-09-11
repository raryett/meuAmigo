package com.example.meuAmigo.service;


import com.example.meuAmigo.model.Usuario;


import java.util.List;


public interface UsuarioService {

    //salvar um usuario
    Usuario salvarUsuario(Usuario usuario);

    //usuario pelo id
    Usuario buscarUsuarioPorId(int idUsuario);

    //listar todos os usuarios
    List<Usuario> buscarUsuarios();

    //buscar usuario pelo email
    Usuario buscarUsuarioPorEmail(String email);


}
