package com.example.meuAmigo.controller;


import com.example.meuAmigo.model.ViagensGrupo;
import com.example.meuAmigo.service.ViagensGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viagensGrupo")
@CrossOrigin
public class ViagensGrupoController {
    @Autowired
    private ViagensGrupoService viagensGrupoService;

    @PostMapping("addViagensGrupo")
    public String addViagensGrupo(@RequestBody ViagensGrupo viagensGrupo) {
        viagensGrupoService.salvarViagensGrupo(viagensGrupo);
        return "Viagem adicionado com sucesso!";
    }

    @GetMapping("listarViagensGrupo")
    public List<ViagensGrupo> listarViagensGrupo() {
       return viagensGrupoService.buscarViagensGrupos();
    }


}
