package br.com.modulo_11;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    public static void exemploListaSimples() {
        System.out.println("***** Exemplo de Lista simples *****");
        java.util.List<String> lista = new ArrayList<String>();
        lista.add("Orlando Gomes");
        lista.add("Fabiana Aparecida");
        lista.add("Leonardo Fabio");
        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploListaSimplesOrdemAscendente() {
        System.out.println("***** Exemplo Ascendente *****");
        java.util.List<String> lista = new ArrayList<String>();
        lista.add("Flavia Nazareth");
        lista.add("Rafael Gomes");
        lista.add("Rodrigo Carvalho");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploNumeros() {
        System.out.println("***** Exemplo com Numeros *****");
        java.util.List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);
        System.out.println("");
    }
}

