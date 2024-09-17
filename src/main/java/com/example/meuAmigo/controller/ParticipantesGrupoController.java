package com.example.meuAmigo.controller;


import com.example.meuAmigo.model.ParticipantesGrupo;
import com.example.meuAmigo.service.ParticipantesGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("participante")
@CrossOrigin
public class ParticipantesGrupoController {


    @Autowired
    ParticipantesGrupoService participantesGrupoService;

    @PostMapping("/salvarComParticipante")
    public String salvarComParticipante(@RequestBody ParticipantesGrupo nomeParticipante) {
        participantesGrupoService.salvarComParticipante(nomeParticipante);
        return "Participante ihncluido com sucesso!";
    }




}
