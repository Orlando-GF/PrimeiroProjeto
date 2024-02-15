package br.com.modulo_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
//         Ler no console no nome e sexo e salvar em uma colecao separado por G fem e masc
//         dica - usar split pra usar array
        exercicioListas();
    }

    public static void exercicioListas() {
        Scanner s = new Scanner(System.in);
        List<String> nomes  = new ArrayList<>();
        List<String> sexos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("*** Exercicio modulo 11 ***");
            System.out.println("Digite o nome: ");
            String nome = s.next();
            nomes.add(nome);
            System.out.println("Digite seu sexo: ");
            String sexo = s.next();
            sexos.add(sexo);
            System.out.println("");
            System.out.println("Deseja continuar? S/N: ");
            String resposta = s.next();

            if(!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        System.out.println("*** Lista com nome e sexo dos participantes ***");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i) + ", Sexo: " + sexos.get(i));
        }
    }
}
