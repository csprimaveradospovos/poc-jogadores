package com.pocjogadores.api.service;

import com.pocjogadores.api.model.Jogador;
import com.pocjogadores.api.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JogadorServiceV1 implements JogadorService {

    @Autowired
    private JogadorRepository repository;


    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Jogador> findById(String id) {
        Optional<Jogador> jogador  = repository.findJogadorById(id);
        return jogador;
    }

    /**
     * @param jogador
     */
    @Override
    public void save(Jogador jogador) {
        repository.save(jogador);
    }
}
