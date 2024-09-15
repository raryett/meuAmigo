package com.example.meuAmigo.controller;

import com.example.meuAmigo.model.Viagem;
import com.example.meuAmigo.service.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viagem")
@CrossOrigin
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @PostMapping("/addViagem")
    public String addViagem(@RequestBody Viagem viagem) {
        viagemService.salvarViagem(viagem);
        return "Viagem adicionado com sucesso!";
    }

    @GetMapping("/listarViagens")
    public List<Viagem> listarViagens() {
        return viagemService.buscarViagens();
    }

    @GetMapping("/buscarPorNome")
    public Viagem buscarPorNome(@RequestParam String nomeViagem) throws IllegalAccessException {
        if(nomeViagem.isEmpty()){
            throw new IllegalAccessException("Não existe");
        }
        return  viagemService.buscarPorNomeViagem(nomeViagem);
    }


}
