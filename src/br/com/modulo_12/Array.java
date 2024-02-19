package br.com.modulo_12;

public class Array {
    public static void main(String[] args) {
        int[] numeros = {10, 5, 6, 7, 9, 5, 56, 98, 45};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
