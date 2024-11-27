package br.com.biblioteca.models.itens;

public class Revista extends ItemBiblioteca{

    private String editorChefe;

    private Double volume;

    private Double numArtigoos;

    private Double numEdicao;

    public Revista(String estadoConservacao, Double preco, Double paginas, 
     String editorChefe, Double volume, Integer numArtigos, Integer numEdicao) {
        super(estadoConservacao, preco, paginas);
        this.editorChefe = editorChefe;
        this.volume = volume;
        this.numArtigos = numArtigos;
        this.numEdicao = numEdicao;
    }

	public String getEditorChefe() {
		return editorChefe;
	}

	public void setEditorChefe(String editorChefe) {
		this.editorChefe = editorChefe;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getNumArtigoos() {
		return numArtigoos;
	}

	public void setNumArtigoos(Double numArtigoos) {
		this.numArtigoos = numArtigoos;
	}

	public Double getNumEdicao() {
		return numEdicao;
	}

	public void setNumEdicao(Double numEdicao) {
		this.numEdicao = numEdicao;
	}
}