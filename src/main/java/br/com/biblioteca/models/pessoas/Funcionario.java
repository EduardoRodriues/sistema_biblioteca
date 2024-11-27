package br.com.biblioteca.models.pessoas;

public class Funcionario extends Pessoa implements Iitens{

    private String telefone;

    private Int tempoAtuacao;

    private Double salario;

    private String funcao;

    public Funcionario(String nomeCompleto, int idade, String cpf, String telefone,
    Int tempoAtuacao, Double salario, String funcao) {
        super(nomeCompleto, idade, cpf);
        this.telefone = telefone;
        this.tempoAtuacao = tempoAtuacao;
        this.salario = salario;
        this.funcao = funcao;
    }

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Int getTempoAtuacao() {
		return tempoAtuacao;
	}

	public void setTempoAtuacao(Int tempoAtuacao) {
		this.tempoAtuacao = tempoAtuacao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}