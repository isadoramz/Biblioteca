package com.aceleradora.biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Impressora.imprimeMensagem(MensagensDoSistema.retornaMensagemDeBoasVindas());

        Impressora.imprimeMensagem(MensagensDoSistema.retornaListaDeLivros(biblioteca.getLivros()));
    }
}
