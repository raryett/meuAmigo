package com.example.meuAmigo.service;

import com.example.meuAmigo.model.Usuario;
import com.example.meuAmigo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    ///achar um usuario especifico
    @Override
    public Optional<Usuario> usuarioPorId(Integer id) {
        return usuarioRepository.findById(id);
    }


    ///listar todos os usuario

    @Override
    public List<Usuario> todosUsuarios() {
        return usuarioRepository.findAll();
    }





}
