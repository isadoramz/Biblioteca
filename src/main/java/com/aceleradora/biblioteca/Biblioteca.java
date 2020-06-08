package com.aceleradora.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    //Metodo de apresentar mensagem de boas-vindas

    ExibeTextos textos = new ExibeTextos();

    public void imprimeMensagem(){
        textos.exibeMensagemBoasVindas();
    }

    ArrayList<Livros> livros = new ArrayList<Livros>();

    public void addLivro(Livros livro){
        livros.add(livro);
    }

    public void imprimeListaDeLivros(){
        for(int i = 0; i < livros.size(); i++){
            textos.exibeListaDeLivros(livros.get(i));
        }
    }
}