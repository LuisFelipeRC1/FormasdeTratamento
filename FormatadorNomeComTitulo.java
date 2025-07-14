package com.example;

public class FormatadorNomeComTitulo implements FormatadorNome {
    private String titulo;

    public FormatadorNomeComTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return titulo + " " + nome + " " + sobrenome;
    }
}
