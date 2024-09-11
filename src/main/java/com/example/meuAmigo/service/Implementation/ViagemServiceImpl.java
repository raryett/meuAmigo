package com.example.meuAmigo.service.Implementation;

import com.example.meuAmigo.model.Viagem;
import com.example.meuAmigo.repository.ViagemRepository;
import com.example.meuAmigo.service.ViagemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ViagemServiceImpl implements ViagemService {

    private ViagemRepository viagemRepository;

    @Override
    public Viagem salvarViagem(Viagem viagem) {
        return viagemRepository.save(viagem);
    }

    @Override
    public List<Viagem> buscarViagens() {
        return viagemRepository.findAll();
    }

    @Override
    public Viagem buscarPorNomeViagem(String nomeViagem) {
        return viagemRepository.findByNome(nomeViagem).orElseThrow(()->
                new RuntimeException("Algo"));
    }

}
