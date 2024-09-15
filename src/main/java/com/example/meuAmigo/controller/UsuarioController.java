package com.example.meuAmigo.controller;

import com.example.meuAmigo.model.Usuario;
import com.example.meuAmigo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/addUsuario")
    public String addUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return "Usuario adicionado com sucesso!";
    }

    @GetMapping("/listarUsuarios")
    public List<Usuario>  list() {
        return usuarioService.buscarUsuarios();
    }


    @GetMapping("/buscarPorId")
    public Usuario buscarPorId(@RequestParam(required = false) int idUsuario) throws IllegalAccessException {
        if( idUsuario == 0 ){
            throw new IllegalAccessException("Id não fornecida");
        }
        return  usuarioService.buscarUsuarioPorId(idUsuario);
    }

    @GetMapping("/bucarPorEmail")
    public Usuario buscarUsuarioPorEmail(@RequestParam String email) throws IllegalAccessException {
        if(email == null || email.isEmpty()){
            throw  new IllegalAccessException("Deu ruim o email");
        }
        return usuarioService.buscarUsuarioPorEmail(email);
    }


    @GetMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        boolean autenticado  = usuarioService.autenticarUsuario(email, senha);
        if(autenticado){
            return "Login efetuado com sucesso!";
        }
        else {
            return "Usuário ou senha incorretos.";
        }
    }

    @PostMapping("/atualizarSenha")
    public String atualizarSenha(@RequestBody String email, @RequestParam String novaSenha) {
        try{
            usuarioService.atualizarSenha(email, novaSenha);
            return "Senha atualizada com sucesso!";
        } catch (RuntimeException e) {
            return e.getMessage();
        }

    }

}
