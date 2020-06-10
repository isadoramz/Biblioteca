package com.aceleradora.biblioteca;

public class Livro {
    private String titulo;
    private String autoria;

    public Livro(String titulo, String autoria){
        this.titulo = titulo;
        this.autoria = autoria;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutoria(){
        return autoria;
    }
    public void setAutoria(String autoria){
        this.autoria = autoria;
    }

    public String toString(){
        return "\nTítulo: " + this.titulo + "\nAutoria: " + this.autoria;
    }
}
