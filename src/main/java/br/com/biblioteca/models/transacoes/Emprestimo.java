package br.com.biblioteca.models.transacoes;

import java.time.LocalDate;

public class Emprestimo extends Transacao{

    private LocalDate dataDevolPrevista;

    private Boolean foiDevolvido;

    public Emprestimo(Int id, Cliente cliente, LocalDate data, ItemBiblioteca item, LocalDate dataDevolPrevista,
    Boolean foiDevolvido) {
        super(id, cliente, data, item);
        this.dataDevolPrevista = dataDevolPrevista;
        this.foiDevolvido = foiDevolvido;
    }

	public LocalDate getDataDevolPrevista() {
		return dataDevolPrevista;
	}

	public void setDataDevolPrevista(LocalDate dataDevolPrevista) {
		this.dataDevolPrevista = dataDevolPrevista;
	}

	public boolean isFoiDevolvido() {
		return foiDevolvido;
	}

	public void setFoiDevolvido(boolean foiDevolvido) {
		this.foiDevolvido = foiDevolvido;
	}
}