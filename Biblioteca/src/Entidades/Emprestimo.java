package Entidades;

public class Emprestimo {
	private long id_emprestimo;
	private long id_cliente;
	private long id_livro;
	private String data_emprestimo;
	private String data_devolu��o;

	public Emprestimo() {
		super();
	}

	public Emprestimo(long id_emprestimo, long id_cliente, long id_livro, String data_emprestimo,
			String data_devolu��o) {
		super();
		this.id_emprestimo = id_emprestimo;
		this.id_cliente = id_cliente;
		this.id_livro = id_livro;
		this.data_emprestimo = data_emprestimo;
		this.data_devolu��o = data_devolu��o;
	}

	public long getId_emprestimo() {
		return id_emprestimo;
	}

	public void setId_emprestimo(long id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}

	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public long getId_livro() {
		return id_livro;
	}

	public void setId_livro(long id_livro) {
		this.id_livro = id_livro;
	}

	public String getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public String getData_devolu��o() {
		return data_devolu��o;
	}

	public void setData_devolu��o(String data_devolu��o) {
		this.data_devolu��o = data_devolu��o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_devolu��o == null) ? 0 : data_devolu��o.hashCode());
		result = prime * result + ((data_emprestimo == null) ? 0 : data_emprestimo.hashCode());
		result = prime * result + (int) (id_cliente ^ (id_cliente >>> 32));
		result = prime * result + (int) (id_emprestimo ^ (id_emprestimo >>> 32));
		result = prime * result + (int) (id_livro ^ (id_livro >>> 32));
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
		Emprestimo other = (Emprestimo) obj;
		if (data_devolu��o == null) {
			if (other.data_devolu��o != null)
				return false;
		} else if (!data_devolu��o.equals(other.data_devolu��o))
			return false;
		if (data_emprestimo == null) {
			if (other.data_emprestimo != null)
				return false;
		} else if (!data_emprestimo.equals(other.data_emprestimo))
			return false;
		if (id_cliente != other.id_cliente)
			return false;
		if (id_emprestimo != other.id_emprestimo)
			return false;
		if (id_livro != other.id_livro)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emprestimo [id_emprestimo=");
		builder.append(id_emprestimo);
		builder.append(", id_cliente=");
		builder.append(id_cliente);
		builder.append(", id_livro=");
		builder.append(id_livro);
		builder.append(", data_emprestimo=");
		builder.append(data_emprestimo);
		builder.append(", data_devolu��o=");
		builder.append(data_devolu��o);
		builder.append("]");
		return builder.toString();
	}

}
