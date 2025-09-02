package com.example.trabalho_backend.model;

public class Musica {
    private String id;
    private String nome;
    private String cantor;
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
