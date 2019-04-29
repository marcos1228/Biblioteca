package Entidades;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 8542230225101053269L;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCfp() {
		return cfp;
	}

	public void setCfp(String cfp) {
		this.cfp = cfp;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cfp == null) ? 0 : cfp.hashCode());
		result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((fone == null) ? 0 : fone.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Cliente other = (Cliente) obj;
		if (cfp == null) {
			if (other.cfp != null)
				return false;
		} else if (!cfp.equals(other.cfp))
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (fone == null) {
			if (other.fone != null)
				return false;
		} else if (!fone.equals(other.fone))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", dataNasc=");
		builder.append(dataNasc);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", cfp=");
		builder.append(cfp);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", fone=");
		builder.append(fone);
		builder.append("]");
		return builder.toString();
	}

}
