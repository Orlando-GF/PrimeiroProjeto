package br.com.modulo_10.ExemploS;

import java.util.Scanner;

public class ForWhile {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite qual a tabuada você quer: ");

        int num = s.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
