package com.aceleradora.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livros> livros = new ArrayList<Livros>();
    ExibeTextos textos = new ExibeTextos();

    public Biblioteca() {
        this.popularBiblioteca();
    }

    public void imprimeMensagem(){
        textos.exibeMensagemBoasVindas();
    }

    private void popularBiblioteca() {
        Livros livro1 = new Livros("Program development in Java", "Barbara Liskov");
        Livros livro2 = new Livros("Use a Cabeça: Padrões de projeto","Elisabeth Freeman, Kathy Sierra");
        this.addLivro(livro1);
        this.addLivro(livro2);
    }

    public void addLivro(Livros livro) {
        livros.add(livro);
    }

    public void imprimeListaDeLivros(){
        for(int i = 0; i < livros.size(); i++){
            textos.exibeListaDeLivros(livros.get(i));
        }
    }

}