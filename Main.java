package com.example;

public class Main {
    public static void main(String[] args) {
        FormatadorNome informal = new FormatadorNomeInformal();
        Autoridade autoridade1 = new Autoridade("Pedro", "Cabral", informal);
        System.out.println(autoridade1.getTratamento()); // Pedro

        FormatadorNome respeitoso = new FormatadorNomeRespeitoso("feminino");
        Autoridade autoridade2 = new Autoridade("Maria", "Oliveira", respeitoso);
        System.out.println(autoridade2.getTratamento()); // Sra. Oliveira

        FormatadorNome comTitulo = new FormatadorNomeComTitulo("Magnífico");
        Autoridade autoridade3 = new Autoridade("Pedro", "Cabral", comTitulo);
        System.out.println(autoridade3.getTratamento()); // Magnífico Pedro Cabral
    }
}
