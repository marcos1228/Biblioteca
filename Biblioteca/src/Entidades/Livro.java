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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExemplar() {
		return exemplar;
	}

	public void setExemplar(String exemplar) {
		this.exemplar = exemplar;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public byte getEdicao() {
		return edicao;
	}

	public void setEdicao(byte edicao) {
		this.edicao = edicao;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((disponibilidade == null) ? 0 : disponibilidade.hashCode());
		result = prime * result + edicao;
		result = prime * result + ((exemplar == null) ? 0 : exemplar.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (ano != other.ano)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (disponibilidade == null) {
			if (other.disponibilidade != null)
				return false;
		} else if (!disponibilidade.equals(other.disponibilidade))
			return false;
		if (edicao != other.edicao)
			return false;
		if (exemplar == null) {
			if (other.exemplar != null)
				return false;
		} else if (!exemplar.equals(other.exemplar))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
