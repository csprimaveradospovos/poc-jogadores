package com.pocjogadores.api.repository;

import com.pocjogadores.api.model.Jogador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JogadorRepository extends MongoRepository<Jogador, String> {

}

