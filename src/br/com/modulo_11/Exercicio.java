package br.com.modulo_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        exercicioListas();
    }

    public static void exercicioListas() {
        Scanner s = new Scanner(System.in);
        List<String> nomesMasculinos  = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("*** Exercicio modulo 11 ***");
            System.out.println("Digite o nome: ");
            String nome = s.next();
            System.out.println("Digite o sexo (M/F): ");
            String sexo = s.next();

            if (sexo.equalsIgnoreCase("M")) {
                nomesMasculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Digite M para masculino e F para feminino.");
            }

            System.out.println("");
            System.out.println("Deseja continuar? S/N: ");
            String resposta = s.next();

            if(!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        System.out.println("*** Lista com nomes masculinos. ***");
        for (String nome : nomesMasculinos) {
            System.out.println("Masculino:  " + nome);
        }

        System.out.println("");
        System.out.println("*** Lista com nomes Femininos. ***");
        for (String nome : nomesFemininos) {
            System.out.println("Feminino:  " + nome);
        }
    }
}
