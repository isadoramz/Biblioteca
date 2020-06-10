package com.aceleradora.biblioteca;

public class MensagensDoSistema {
    public String retornaMensagemDeBoasVindas(){
        return "Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre";
    }

    public String retornaListaDeLivros(Livro livro){
       return "\nTítulo: " + livro.titulo + "\nAutoria: " + livro.autoria;
    }
}
