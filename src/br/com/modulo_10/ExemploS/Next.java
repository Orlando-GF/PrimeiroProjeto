package br.com.modulo_10.ExemploS;

import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual sua idade? ");

        int result = s.nextInt();
        if (result == 1) {
            System.out.println("Resultado é igual a 1");
        } else if (result > 1) {
            System.out.println("Resultado é maior que 1");
        } else {
                System.out.println("Resultado é menor que 1");
        }
    }
}
