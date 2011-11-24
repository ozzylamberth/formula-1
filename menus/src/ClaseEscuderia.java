public class ClaseEscuderia {
	public String nombreEscuderia;
	public String pais;
	public String sede;

	public String getNombreEscuderia() {
		return nombreEscuderia;
	}

	public void setNombreEscuderia(String nombreEscuderia) {
		this.nombreEscuderia = nombreEscuderia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombreEscuderia == null) ? 0 : nombreEscuderia.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((sede == null) ? 0 : sede.hashCode());
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
		final ClaseEscuderia other = (ClaseEscuderia) obj;
		if (nombreEscuderia == null) {
			if (other.nombreEscuderia != null)
				return false;
		} else if (!nombreEscuderia.equals(other.nombreEscuderia))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (sede == null) {
			if (other.sede != null)
				return false;
		} else if (!sede.equals(other.sede))
			return false;
		return true;
	}

	public String toString() {
		return nombreEscuderia + " " + pais + " " + sede;
	}

}