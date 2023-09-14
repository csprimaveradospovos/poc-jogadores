package com.pocjogadores.api.controller;

import com.pocjogadores.api.service.JogadorService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.pocjogadores.api.model.Jogador;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.jetbrains.annotations.NotNull;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
public class JogadoresController extends BaseController {


    @Autowired
    private JogadorService service;

    @GetMapping(value = "/jogadores/{id}", consumes = "application/json", produces = "application/json")
    public  ResponseEntity<Jogador> getJogadores(@NotNull @PathVariable String id){
        Optional<Jogador> jogador = service.findById(id);
        return jogador.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.ok(null));
    }

    @PostMapping(value = "/jogadores",consumes = "application/json", produces = "application/json")
    public ResponseEntity<Jogador> postJogador(@RequestBody Jogador jogador){
        service.save(jogador);
        return ResponseEntity.ok(jogador);
    }
}
