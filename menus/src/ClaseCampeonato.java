
public class ClaseCampeonato {

	public int idCampeonato;
	public String nombreCampeonato;
	public int getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(int idCampeonato) {
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
		result = prime * result + idCampeonato;
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
		if (idCampeonato != other.idCampeonato)
			return false;
		if (nombreCampeonato == null) {
			if (other.nombreCampeonato != null)
				return false;
		} else if (!nombreCampeonato.equals(other.nombreCampeonato))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ClaseCampeonato [idCampeonato=" + idCampeonato
				+ ", nombreCampeonato=" + nombreCampeonato + "]";
	}
	
}
