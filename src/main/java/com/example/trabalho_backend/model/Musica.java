package com.example.trabalho_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "musicas")

public class Musica {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cantor")
    private String cantor;
    @Column(name = "genero")
    private String genero;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cantor='" + cantor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
