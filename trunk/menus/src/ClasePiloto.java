public class ClasePiloto {

	public String identificacion;
	public String nombrePiloto;
	public String escuderia;
	public String licencia;

	public ClasePiloto(String identificacion, String nombrePiloto,
			String escuderia, String licencia) {
		this.identificacion = identificacion;
		this.nombrePiloto = nombrePiloto;
		this.escuderia = escuderia;
		this.licencia = licencia;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombrePiloto() {
		return nombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((escuderia == null) ? 0 : escuderia.hashCode());
		result = prime * result
				+ ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result
				+ ((licencia == null) ? 0 : licencia.hashCode());
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
		ClasePiloto other = (ClasePiloto) obj;
		if (escuderia == null) {
			if (other.escuderia != null)
				return false;
		} else if (!escuderia.equals(other.escuderia))
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (licencia == null) {
			if (other.licencia != null)
				return false;
		} else if (!licencia.equals(other.licencia))
			return false;
		if (nombrePiloto == null) {
			if (other.nombrePiloto != null)
				return false;
		} else if (!nombrePiloto.equals(other.nombrePiloto))
			return false;
		return true;
	}

	public String toString() {
		return identificacion + " " + nombrePiloto + " " + escuderia + " "
				+ licencia;
	}

}
