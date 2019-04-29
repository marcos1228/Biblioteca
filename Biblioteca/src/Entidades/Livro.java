package Entidades;

public class Livro {
	private long id;
	private String exemplar;
	private String autor;
	private byte edicao;
	private short ano;
	private String disponibilidade;

	public Livro() {
		super();
	}

	public Livro(long id, String exemplar, String autor, byte edicao, short ano, String disponibilidade) {
		super();
		this.id = id;
		this.exemplar = exemplar;
		this.autor = autor;
		this.edicao = edicao;
		this.ano = ano;
		this.disponibilidade = disponibilidade;
	}

}
