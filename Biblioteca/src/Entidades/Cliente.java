package Entidades;

public class Cliente {
	private long id;
	private String nome;
	private String dataNasc;
	private String sexo;
	private String cfp;
	private String endereco;
	private String fone;

	public Cliente() {
		super();
	}

	public Cliente(long id, String nome, String dataNasc, String sexo, String cfp, String endereco, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.cfp = cfp;
		this.endereco = endereco;
		this.fone = fone;
	}

}
