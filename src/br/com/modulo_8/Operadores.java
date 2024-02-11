package br.com.modulo_8;

public class Operadores {
    public static void main(String[] args) {
        operadoresLogicos();
        operadoresAritmeticos();
        operadoresAtribuicoes();
        operadoresIncrementoDecremento();
        operadoresRelacionais();
    }

    private static void operadoresLogicos() {
        System.out.println("***Operadores Lógicos***");
        int num1 = 10;
        int num2 = 20;
        boolean num3 = num1>= num2;
        System.out.println("Operador logico: " + num3);
    }

    private static void operadoresAritmeticos() {
        System.out.println("***Operadores Aritmeticos***");
        int num1 = 10;
        int num2 = 20;
        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }

    private static void operadoresAtribuicoes() {
        System.out.println("***Operadores Atribuições***");
        int num1 = 10;
        int num2 = 20;
        int num3 = num1 + num2;
        System.out.println(num3);
        num3 += num3;
        System.out.println(num3);
    }

    private static void operadoresIncrementoDecremento() {
        System.out.println("***Operadores de Incremento e Decremento***");
        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
    }

    private static void operadoresRelacionais() {
        System.out.println("***Operadores Relacionais***");
        int num1 = 10;
        int num2 = 20;
        boolean num3 = num1 > num2;
        System.out.println("Operador relacional: " + num3);
    }
}

