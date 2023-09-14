package com.pocjogadores.api.repository;

import com.pocjogadores.api.model.Jogador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface JogadorRepository extends MongoRepository<Jogador, String> {
    @Query("{_id:'?0'}")
    Optional<Jogador> findJogadorById(String is);
}

