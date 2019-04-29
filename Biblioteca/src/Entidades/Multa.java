package Entidades;

public class Multa {
	private long id_multa;
	private long id_cliente;
	private String descricao;
	private float valor;

	public Multa() {
		super();
	}

	public Multa(long id_multa, long id_cliente, String descricao, float valor) {
		super();
		this.id_multa = id_multa;
		this.id_cliente = id_cliente;
		this.descricao = descricao;
		this.valor = valor;
	}

}
