package com.pocjogadores.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.pocjogadores.api.model.Jogador;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.jetbrains.annotations.NotNull;

@RestController
public class JogadoresController extends BaseController {

    @GetMapping(value = "/jogadores/{id}", produces = "application/json")
    public @ResponseBody String getJogadores(@NotNull @PathVariable Integer id){
        return id.toString();
    }

    @PostMapping(value = "/jogadores", produces = "application/json")
    public @ResponseBody String postJogador(@RequestBody @NotNull Jogador jogador){
        return jogador.getClass().getName();
    }
}
