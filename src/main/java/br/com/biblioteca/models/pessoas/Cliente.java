package br.com.biblioteca.models.pessoas;

public class Cliente extends Pessoa{

    private Double saldo;

    private Double quantLivrosMes;

    private Double quantLivrosAno;

    private String email;

    private String endereco;

    public Cliente(String nomeCompleto, int idade, String cpf, Double saldo, 
    Double quantLivrosMes, Double quantLivrosAno, String email, String endereco) {
        super(nomeCompleto, idade, cpf);
        this.saldo = saldo;
        this.quantLivrosMes = quantLivrosMes;
        this.quantLivrosAno = quantLivrosAno;
        this.email = email;
        this.endereco = endereco;
    }


    public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Double getQuantLivrosMes() {
		return quantLivrosMes;
	}


	public void setQuantLivrosMes(Double quantLivrosMes) {
		this.quantLivrosMes = quantLivrosMes;
	}


	public Double getQuantLivrosAno() {
		return quantLivrosAno;
	}


	public void setQuantLivrosAno(Double quantLivrosAno) {
		this.quantLivrosAno = quantLivrosAno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}