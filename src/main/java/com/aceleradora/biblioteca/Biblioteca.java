package com.aceleradora.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    //Metodo de apresentar mensagem de boas-vindas

    public void imprimeMensagem(){
        System.out.println("Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre");
    }

    ArrayList<Livros> livros = new ArrayList<Livros>();

    public void addLivro(Livros livro){
        livros.add(livro);
    }

    public void exibeLista(){
        for(int i = 0; i < livros.size(); i++){
            System.out.println("Titulo: " + livros.get(i).titulo + "\nAutoria: " + livros.get(i).autoria);
        }
    }
}