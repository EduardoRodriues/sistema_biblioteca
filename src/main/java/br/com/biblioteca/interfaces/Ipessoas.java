package br.com.biblioteca.interfaces;

public interface Ipessoas {

    void cadastraPessoa(Pessoa pessoa);

    boolean autenticaUsuario(String usuario, String senha);

}