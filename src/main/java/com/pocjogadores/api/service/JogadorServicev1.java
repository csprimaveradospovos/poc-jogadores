package com.pocjogadores.api.service;

import com.pocjogadores.api.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadorServicev1 {

    @Autowired
    private JogadorRepository repository;


}
