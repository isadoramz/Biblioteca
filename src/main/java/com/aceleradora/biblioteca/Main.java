package com.aceleradora.biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.imprimeMensagem();

        Livros livro1 = new Livros("Program development in Java", "Barbara Liskov");
        Livros livro2 = new Livros("Use a Cabeça: Padrões de projeto","Elisabeth Freeman, Kathy Sierra");

        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.imprimeListaDeLivros();
    }
}
