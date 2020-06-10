package com.aceleradora.biblioteca;

import java.util.ArrayList;

public class MensagensDoSistema {
    public static String retornaMensagemDeBoasVindas(){
        return "Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre";
    }

    public static String retornaListaDeLivros(ArrayList<Livro> livro){
       String informacoesLivros = "";
       for(int i =0; i < livro.size(); i++){
           informacoesLivros += livro.get(i).toString() + "\n";
       }
       return informacoesLivros;
    }
}
