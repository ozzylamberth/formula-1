public class ClaseCampeonato {

	public String idCampeonato;
	public String nombreCampeonato;

	public ClaseCampeonato(String idCampeonato, String nombreCampeonato) {
		this.idCampeonato = idCampeonato;
		this.nombreCampeonato = nombreCampeonato;

	}

	public String getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(String idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	public String getNombreCampeonato() {
		return nombreCampeonato;
	}

	public void setNombreCampeonato(String nombreCampeonato) {
		this.nombreCampeonato = nombreCampeonato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idCampeonato == null) ? 0 : idCampeonato.hashCode());
		result = prime
				* result
				+ ((nombreCampeonato == null) ? 0 : nombreCampeonato.hashCode());
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
		ClaseCampeonato other = (ClaseCampeonato) obj;
		if (idCampeonato == null) {
			if (other.idCampeonato != null)
				return false;
		} else if (!idCampeonato.equals(other.idCampeonato))
			return false;
		if (nombreCampeonato == null) {
			if (other.nombreCampeonato != null)
				return false;
		} else if (!nombreCampeonato.equals(other.nombreCampeonato))
			return false;
		return true;
	}

	public String toString() {
		return idCampeonato + " " + nombreCampeonato;
	}

}
