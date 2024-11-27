package br.com.biblioteca.models.itens;

public class Livro extends ItemBiblioteca{

    private String autor;

    private String generoLiterario;

    private Double anoPublicacao;

    private String editora;

    public Livro(String estadoConservacao, Double preco, Double paginas, String autor,
    String generoLiterario, Double anoPublicacao, String editora) {
        super(estadoConservacao, preco, paginas);
        this.autor = autor;
        this.generoLiterario = generoLiterario;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}

	public Double getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Double anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
    
}