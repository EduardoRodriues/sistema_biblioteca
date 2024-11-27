package br.com.biblioteca.exceptions;

public class LivroNaoEncontradoException extends Exception{

    public LivroNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}