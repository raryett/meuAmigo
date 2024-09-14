package com.example.meuAmigo.service.Implementation;


import com.example.meuAmigo.model.ViagensGrupo;
import com.example.meuAmigo.repository.ViagensGrupoRepository;
import com.example.meuAmigo.service.ViagensGrupoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@AllArgsConstructor

public class ViagensGrupoServiceImpl implements ViagensGrupoService {

    private ViagensGrupoRepository viagensGrupoRepository;


    @Override
    public ViagensGrupo salvarViagensGrupo(ViagensGrupo viagensGrupo) {
        return viagensGrupoRepository.save(viagensGrupo);
    }

    @Override
    public List<ViagensGrupo> buscarViagensGrupos() {
        return viagensGrupoRepository.findAll();
    }
}
