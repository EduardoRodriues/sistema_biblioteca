package br.com.biblioteca.models.itens;

public abstract class ItemBiblioteca implements Iitens{

    private String estadoConservacao;

    private Double preco;

    private Double paginas;

    public ItemBiblioteca(String estadoConservacao, Double preco, Double paginas) {
        this.estadoConservacao = estadoConservacao;
        this.preco = preco;
        this.paginas = paginas;
    }

	public String getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getPaginas() {
		return paginas;
	}

	public void setPaginas(Double paginas) {
		this.paginas = paginas;
	}
}