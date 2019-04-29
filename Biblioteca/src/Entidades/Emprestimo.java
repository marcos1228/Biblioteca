package Entidades;

public class Emprestimo {
	private long id_emprestimo;
	private long id_cliente;
	private long id_livro;
	private String data_emprestimo;
	private String data_devolução;

	public Emprestimo() {
		super();
	}

	public Emprestimo(long id_emprestimo, long id_cliente, long id_livro, String data_emprestimo,
			String data_devolução) {
		super();
		this.id_emprestimo = id_emprestimo;
		this.id_cliente = id_cliente;
		this.id_livro = id_livro;
		this.data_emprestimo = data_emprestimo;
		this.data_devolução = data_devolução;
	}

}
