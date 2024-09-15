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

    private final SenhaServiceImpl senhaServiceImpl;
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

    @Override
    public boolean autenticarUsuario(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email).orElse(null);
        if(usuario != null){
            return senhaServiceImpl.matches(senha, usuario.getSenha());
        }
        return false;
    }

    @Override
    public void atualizarSenha(String email, String novaSenha) {
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow(() ->
                new RuntimeException("Não foi encontrado nenhum usuario com email: " + email)

        );
        String encoredPassword = senhaServiceImpl.encodePassword(novaSenha);
        usuario.setSenha(encoredPassword);
        usuarioRepository.save(usuario);


    }
}
