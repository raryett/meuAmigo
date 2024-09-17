package com.example.meuAmigo.service.Implementation;

import com.example.meuAmigo.model.ParticipantesGrupo;
import com.example.meuAmigo.repository.ParticipantesGruposRepository;
import com.example.meuAmigo.service.ParticipantesGrupoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParticipantesGrupoServiceImpl implements ParticipantesGrupoService {

    private ParticipantesGruposRepository participantesGruposRepository;
    @Override
    public ParticipantesGrupo salvarComParticipante(ParticipantesGrupo participantesGrupo) {
        return participantesGruposRepository.save(participantesGrupo);

    }

//    @Override
//    public ParticipantesGrupo salvarComParticipante(int idViagemGrupo) {
//        return participantesGruposRepository.save(new ParticipantesGrupo());
//    }
}
