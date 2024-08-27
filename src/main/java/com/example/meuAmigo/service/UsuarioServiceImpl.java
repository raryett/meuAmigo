package com.example.meuAmigo.service;

import com.example.meuAmigo.dto.UsuarioDto;
import com.example.meuAmigo.model.Usuario;
import com.example.meuAmigo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario salvarUsuario(UsuarioDto usuarioDto) {
        return usuarioRepository.saveAndFlush();
    }

    @Override
    public List<UsuarioDto> todosUsuarios() {
        return List.of();
    }

//    @Override
//    public Optional<Usuario> buscaPorId(Integer idUsuario) {
//        return Optional.empty();
//    }

//    ///achar um usuario especifico
////    @Override
////    public Optional<UsuarioDto> buscaPorId(Integer id) {
////
////        return usuarioRepository.findById(id);
//    }
//    ///listar todos os usuario
//    @Override
//    public List<UsuarioDto> todosUsuarios() {
//        return usuarioRepository.findAll();
//    }





}
