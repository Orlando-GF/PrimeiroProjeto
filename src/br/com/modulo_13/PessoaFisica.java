package br.com.modulo_13;

import java.util.Date;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, Date nascimento, String cpf) {
        super(nome, nascimento);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
