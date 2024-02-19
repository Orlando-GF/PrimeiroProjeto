package br.com.modulo_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioParte_1 {
//Ler no console nome de pessoal separado por virgula
//Separar os valor que leu guardar em um tipo de variavel visto nas aulas
//ordenar a varialvel em ordem alfabetica e imprimir no console
//
//
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes separados por vírgulas: ");
        String input = scan.nextLine();

        String[] partes = input.split(",");
        for (String parte : partes) {
            nomes.add(parte.trim());
        }

        System.out.println(" ");
        Collections.sort(nomes);

        System.out.println("Nomes em ordem alfabética: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
