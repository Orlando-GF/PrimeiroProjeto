package br.com.modulo_10.ExemploS;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }
    public static String getIdade(int idade) {

        if (idade <= 5) {
            return "Você é um bebê!";
        } else if (idade <= 11) {
            return "Você é uma criança!";
        } else if (idade <= 14) {
            return "Você é pré-adolescente!";
        } else if (idade <= 18) {
            return "Você é adolescente!";
        } else {
            return "Você é adulto!";
        }
    }
}
