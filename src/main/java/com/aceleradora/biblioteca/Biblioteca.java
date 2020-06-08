package com.aceleradora.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livros> livros = new ArrayList<Livros>();

    public Biblioteca() {
        this.popularBiblioteca();
    }

    private void popularBiblioteca() {
        Livros livro1 = new Livros("Program development in Java", "Barbara Liskov");
        Livros livro2 = new Livros("Use a Cabeça: Padrões de projeto","Elisabeth Freeman, Kathy Sierra");
        this.addLivro(livro1);
        this.addLivro(livro2);
    }
    public void imprimeMensagemDeBoasVindas() {
        System.out.println("Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre");
    }

    public void addLivro(Livros livro) {
        livros.add(livro);
    }

    public void exibeListaDeLivros() {
        for(int i = 0; i < livros.size(); i++) {
            System.out.println("Titulo: " + livros.get(i).titulo + "\nAutoria: " + livros.get(i).autoria);
        }
    }




}