package com.aceleradora.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensagensDoSistemaTeste {
    MensagensDoSistema mensagensDoSistema = new MensagensDoSistema();

    @Test
    public void deveRetornarMensagemDeBoasVindas(){
       String mensagemEsperadaDeBoasVindas = "Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre";
       String mensagemRecebidaDeBoasVindas = mensagensDoSistema.retornaMensagemDeBoasVindas();
       assertEquals(mensagemEsperadaDeBoasVindas, mensagemRecebidaDeBoasVindas);
    }

    @Test
    public void deveRetornarMensagemComTituloEAutoriaDoLivro(){
        String tituloDoLivro = "O Pequeno Príncipe";
        String autoriaDoLivro = "Isadora Zandonotto";
        Livro livro = new Livro(tituloDoLivro, autoriaDoLivro);
        String mensagemEsperada = "\nTítulo: " + tituloDoLivro + "\nAutoria: " + autoriaDoLivro;
        String mensagemRecebida = mensagensDoSistema.retornaListaDeLivros(livro);
        assertEquals(mensagemEsperada, mensagemRecebida);
    }
}