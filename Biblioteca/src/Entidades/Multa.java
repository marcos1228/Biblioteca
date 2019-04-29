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

	public long getId_multa() {
		return id_multa;
	}

	public void setId_multa(long id_multa) {
		this.id_multa = id_multa;
	}

	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + (int) (id_cliente ^ (id_cliente >>> 32));
		result = prime * result + (int) (id_multa ^ (id_multa >>> 32));
		result = prime * result + Float.floatToIntBits(valor);
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
		Multa other = (Multa) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id_cliente != other.id_cliente)
			return false;
		if (id_multa != other.id_multa)
			return false;
		if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multa [id_multa=");
		builder.append(id_multa);
		builder.append(", id_cliente=");
		builder.append(id_cliente);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}

}
