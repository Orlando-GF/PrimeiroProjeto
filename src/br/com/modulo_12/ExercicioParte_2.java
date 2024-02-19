package br.com.modulo_12;

import java.util.*;

public class ExercicioParte_2 {

    //parte 2 ler no console um nome tracinho sexo, ler os resultados no console
//ira separar por grupos e generos ira imprimir no console as respostas com grupos separados
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> gruposPorSexo = new HashMap<>();

        System.out.println("Digite os nomes seguidos de traço e sexo (M ou F), separados por vírgulas: ");
        String input = scan.nextLine();
        System.out.println();

        String[] partes = input.split(",");
        for (String parte : partes) {
            String[] partesNomeSexo = parte.trim().split("-");
            if (partesNomeSexo.length == 2) {
                String nome = partesNomeSexo[0].trim();
                String sexo = partesNomeSexo[1].trim().toUpperCase();

                if (!gruposPorSexo.containsKey(sexo)) {
                    gruposPorSexo.put(sexo, new ArrayList<>());
                }
                gruposPorSexo.get(sexo).add(nome);
            }
        }

        System.out.println("Nomes agrupados por sexo: ");
        for (Map.Entry<String, List<String>> entry : gruposPorSexo.entrySet()) {
            System.out.println("Sexo " + entry.getKey() + ":");
            for (String nome : entry.getValue()) {
                System.out.println(nome);
            }
            System.out.println();
        }
    }
}