import java.util.Calendar;

public class ClaseCampeonato {

	public int idCampeonato;
	public String nombreCampeonato;
	public String nombrePiloto;
	public String Carrera;

	public ClaseCampeonato(int idCampeonato, String nombreCampeonato,
			String nombrePiloto, String Carrera) {
		this.idCampeonato = idCampeonato;
		this.nombreCampeonato = nombreCampeonato;
		this.nombrePiloto = nombrePiloto;
		this.Carrera = Carrera;
	}

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

	public String getNombrePiloto() {
		return nombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Carrera == null) ? 0 : Carrera.hashCode());
		result = prime * result + idCampeonato;
		result = prime
				* result
				+ ((nombreCampeonato == null) ? 0 : nombreCampeonato.hashCode());
		result = prime * result
				+ ((nombrePiloto == null) ? 0 : nombrePiloto.hashCode());
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
		final ClaseCampeonato other = (ClaseCampeonato) obj;
		if (Carrera == null) {
			if (other.Carrera != null)
				return false;
		} else if (!Carrera.equals(other.Carrera))
			return false;
		if (idCampeonato != other.idCampeonato)
			return false;
		if (nombreCampeonato == null) {
			if (other.nombreCampeonato != null)
				return false;
		} else if (!nombreCampeonato.equals(other.nombreCampeonato))
			return false;
		if (nombrePiloto == null) {
			if (other.nombrePiloto != null)
				return false;
		} else if (!nombrePiloto.equals(other.nombrePiloto))
			return false;
		return true;
	}

	public String toString() {
		return idCampeonato + " " + nombreCampeonato + " " + nombrePiloto +""+Carrera;
	}
}
