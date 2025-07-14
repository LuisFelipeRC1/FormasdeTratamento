package com.example;

public class FormatadorNomeInformal implements FormatadorNome {
    @Override
    public String formatarNome(String nome, String sobrenome) {
        return nome; // Retorna apenas o primeiro nome
    }
}
