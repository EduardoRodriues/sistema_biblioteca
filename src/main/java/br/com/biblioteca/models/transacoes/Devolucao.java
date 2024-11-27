package br.com.biblioteca.models.transacoes;

import java.time.LocalDate;

public class Devolucao extends Transacao{

    private LocalDate dataDevolucao;

    private Double multa;

    public Devolucao(Int id, Cliente cliente, LocalDate data, ItemBiblioteca item, LocalDate dataDevolucao,
    Double multa) {
        super(id, cliente, data, item);
        this.multa = multa;
        this.dataDevolucao = dataDevolucao;
    }

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Double getMulta() {
		return multa;
	}

	public void setMulta(Double multa) {
		this.multa = multa;
	}
    
}