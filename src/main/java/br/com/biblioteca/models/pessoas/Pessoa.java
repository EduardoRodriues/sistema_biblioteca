package br.com.biblioteca.models.pessoas;

public abstract class Pessoa implements Ipessoas{

    private String nomeCompleto;

    private Int idade;

    private String cpf;

    public Pessoa(String nomeCompleto, Int idade, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.cpf = cpf;
    }

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Int getIdade() {
		return idade;
	}

	public void setIdade(Int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
    
}