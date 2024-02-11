package br.com.orlando;

public abstract class MercadoEbac {
    public static void main(String[] args) {
        /**
         * Meu primeiro código sem consulta, feito sozinho
         * Uma classe principal "abstract", e mais 3 classes "extends"
         */
        Cliente cliente = new Cliente();
        String nome = cliente.getNome();
        System.out.println(nome);
    }
}
