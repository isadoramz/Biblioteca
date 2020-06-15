package com.aceleradora.biblioteca;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MensagensDoSistemaTeste {
    @Test
    public void deveRetornarMensagemDeBoasVindas(){
       String mensagemEsperadaDeBoasVindas = "Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre";
       String mensagemRecebidaDeBoasVindas = MensagensDoSistema.retornaMensagemDeBoasVindas();
       assertEquals(mensagemEsperadaDeBoasVindas, mensagemRecebidaDeBoasVindas);
    }

    @Test
    public void deveRetornarMensagemComTituloEAutoriaDoLivro(){
        String tituloDoLivro = "O Pequeno Príncipe";
        String autoriaDoLivro = "Isadora Zandonotto";
        ArrayList<Livro> livros = new ArrayList<>();
        Livro livroTeste = new Livro(tituloDoLivro, autoriaDoLivro);
        livros.add(livroTeste);
        String mensagemEsperada = "\nTítulo: " + tituloDoLivro + "\nAutoria: " + autoriaDoLivro;
        String mensagemRecebida = MensagensDoSistema.retornaListaDeLivros(livros);
        assertEquals(mensagemEsperada, mensagemRecebida);
    }
}