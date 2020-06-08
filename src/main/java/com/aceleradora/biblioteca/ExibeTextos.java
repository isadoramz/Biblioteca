package com.aceleradora.biblioteca;

public class ExibeTextos {
    public void exibeMensagemBoasVindas(){
        System.out.println("Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre");
    }

    public void exibeListaDeLivros(Livros livro){
        System.out.println("\nTítulo: " + livro.titulo + "\nAutoria: " + livro.autoria);
    }
}
