package br.com.biblioteca.models.transacoes;

public abstract class Transacao implements Itransacoes{

    private Long id;

    private Cliente cliente;

    private LocalDate data;

    private ItemBiblioteca item;

    public Transacao(Long id, Cliente cliente, LocalDate data, ItemBiblioteca item) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.item = item;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public ItemBiblioteca getItem() {
		return item;
	}

	public void setItem(ItemBiblioteca item) {
		this.item = item;
	}
}