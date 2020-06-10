package com.aceleradora.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<Livro>();

    public Biblioteca(){
        this.popularBiblioteca();
    }

    private void popularBiblioteca(){
        Livro livro1 = new Livro("Program development in Java", "Barbara Liskov");
        Livro livro2 = new Livro("Use a Cabeça: Padrões de projeto","Elisabeth Freeman, Kathy Sierra");
        this.addLivro(livro1);
        this.addLivro(livro2);
    }

    public void addLivro(Livro livro){
        livros.add(livro);
    }

    public ArrayList<Livro> getLivros(){
       return livros;

    }


}