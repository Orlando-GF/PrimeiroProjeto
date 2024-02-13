package br.com.modulo_10.ExemploS;

import java.util.Scanner;

public class SwitchCaseDefault {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do animal desejado: ");
        String texto = s.next();
        String animal = exampleOfSwitch(texto);
        System.out.println(animal);
    }

    public static String exampleOfSwitch(String animal) {
        String result;
        switch (animal) {
            case "Dog":
                result = "Animal domestico";
                break;
            case "Leão":
                result = "Animal silvestre";
                break;
            default:
                result = "não existe";
                break;
        }
        return result;
    }
}
