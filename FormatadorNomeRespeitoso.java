package com.example;

public class FormatadorNomeRespeitoso implements FormatadorNome {
    private String genero;

    public FormatadorNomeRespeitoso(String genero) {
        this.genero = genero.toLowerCase();
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        if (genero.equals("masculino")) {
            return "Sr. " + sobrenome;
        } else if (genero.equals("feminino")) {
            return "Sra. " + sobrenome;
        } else {
            return sobrenome; 
        }
    }
}
