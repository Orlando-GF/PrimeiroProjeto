package br.com.modulo_10.ExemploS;

import java.util.Scanner;

public class Exercicio {
    //Ler no console 4 notas e dividir por 4
    //Fazer condicao e validar se essa nota é maior ou iguAL A 7
    //IMPRIMIR SE FOR APROVADO OU NAO
    //MAIOR OU IGUAL A 5 ESTA DE RECUPERAÇAO
    //MENOR QUE 5 ESTA REPROVADO.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a sua primeira nota: ");
        int nota1 = s.nextInt();
        System.out.println("Digite a sua segunda nota: ");
        int nota2 = s.nextInt();
        System.out.println("Digite a sua terceira nota: ");
        int nota3 = s.nextInt();
        System.out.println("digite a sua quarta nota: ");
        int nota4 = s.nextInt();
        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A sua media escolar é " + media + ".");

        if (media >= 7) {
            System.out.println("Parabéns, você foi aprovado!!!");
        } else if (media >= 5) {
            System.out.println("Você esta de recuperação");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}
