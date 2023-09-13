package com.pocjogadores.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("jogador")
public class Jogador {


    public Jogador(String id, String nome, Integer idade, String endereco, Integer autoAvaliacao) {
        super();
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.autoAvaliacao = autoAvaliacao;
    }

    @Id
    private String id;

    private String nome;

    private Integer idade;

    private String endereco;

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
