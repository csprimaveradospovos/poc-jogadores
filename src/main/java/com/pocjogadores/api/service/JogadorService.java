package com.pocjogadores.api.service;

import com.pocjogadores.api.model.Jogador;

import java.util.Optional;

public interface JogadorService {
    Optional<Jogador> findById(String id);

    void save(Jogador jogador);
}
