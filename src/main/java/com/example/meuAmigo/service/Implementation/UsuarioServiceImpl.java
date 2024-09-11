package com.example.meuAmigo.service.Implementation;


import com.example.meuAmigo.model.Usuario;
import com.example.meuAmigo.repository.UsuarioRepository;
import com.example.meuAmigo.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario salvarUsuario(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario buscarUsuarioPorId(int idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario).orElseThrow(() ->
                new RuntimeException("Usuario com ID: " + idUsuario + " não foi encontrado ")
        );
        return usuario;
    }

    @Override
    public List<Usuario> buscarUsuarios() {

        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email).orElseThrow(()->
                new RuntimeException("Não foi encontrado nenhum email"));
    }
}
