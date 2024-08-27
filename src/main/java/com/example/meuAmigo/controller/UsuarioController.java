package com.example.meuAmigo.controller;

import com.example.meuAmigo.dto.UsuarioDto;
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
    public String addUsuario(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.salvarUsuario(usuarioDto);
        return "Usuario adicionado com sucesso!";
    }

    @PostMapping("/listarUsuarios")
    public List<UsuarioDto>  list() {
        return usuarioService.todosUsuarios();
    }


//    @PostMapping("/buscaId")
//    public UsuarioDto buscaId(@RequestBody UsuarioDto usuarioDto) {
//
//        return usuarioService.buscaPorId();
//    }
}
