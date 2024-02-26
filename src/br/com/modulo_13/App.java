package br.com.modulo_13;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("João", new Date(), "111.222.333.99");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa X", new Date(), "12.345.678/0001-99");

        System.out.println("*** Pessoa Física ***");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Data de Nascimento: " + pessoaFisica.getNascimento());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println();

        System.out.println("*** Pessoa Jurídica ***");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Data de Nascimento: " + pessoaJuridica.getNascimento());
        System.out.println("CPF: " + pessoaJuridica.getCnpj());
    }
}
