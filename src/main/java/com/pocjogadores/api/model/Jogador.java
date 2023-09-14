package com.pocjogadores.api.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("jogador")
@JsonClassDescription("jogador")
public class Jogador {

    @MongoId
    private String id;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("idade")
    private Integer idade;
    @JsonProperty("endereco")
    private String endereco;
    @JsonProperty("auto_avaliacao")
    private Integer autoAvaliacao;


    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Integer getAutoAvaliacao() {
        return autoAvaliacao;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAutoAvaliacao(Integer autoAvaliacao) {
        this.autoAvaliacao = autoAvaliacao;
    }



}
