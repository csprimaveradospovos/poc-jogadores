package com.pocjogadores.api.service;

import com.pocjogadores.api.model.Jogador;

public interface JogadorService {
    Jogador findById(String id);

    void save(Jogador jogador);
}
