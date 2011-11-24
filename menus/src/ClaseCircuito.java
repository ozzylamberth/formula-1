public class ClaseCircuito {

	public String nombreCircuito;
	public String ubicacion;
	public String tipo;

	public String getNombreCircuito() {
		return nombreCircuito;
	}

	public void setNombreCircuito(String nombreCircuito) {
		this.nombreCircuito = nombreCircuito;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombreCircuito == null) ? 0 : nombreCircuito.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result
				+ ((ubicacion == null) ? 0 : ubicacion.hashCode());
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
		final ClaseCircuito other = (ClaseCircuito) obj;
		if (nombreCircuito == null) {
			if (other.nombreCircuito != null)
				return false;
		} else if (!nombreCircuito.equals(other.nombreCircuito))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (ubicacion == null) {
			if (other.ubicacion != null)
				return false;
		} else if (!ubicacion.equals(other.ubicacion))
			return false;
		return true;
	}

	public String toString() {
		return nombreCircuito + " " + ubicacion + " " + tipo;
	}

}
