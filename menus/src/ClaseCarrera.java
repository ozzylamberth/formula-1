public class ClaseCarrera {

	public String idCarrera;
	public String fecha;
	public String nombre;
	public String numvueltas;
	public String circuito;

	public ClaseCarrera(String idCarrera, String fecha, String nombre,
			String numvueltas, String circuito) {

		this.idCarrera = idCarrera;
		this.fecha = fecha;
		this.nombre = nombre;
		this.numvueltas = numvueltas;
		this.circuito = circuito;
	}

	public String getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumvueltas() {
		return numvueltas;
	}

	public void setNumvueltas(String numvueltas) {
		this.numvueltas = numvueltas;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((circuito == null) ? 0 : circuito.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result
				+ ((idCarrera == null) ? 0 : idCarrera.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((numvueltas == null) ? 0 : numvueltas.hashCode());
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
		ClaseCarrera other = (ClaseCarrera) obj;
		if (circuito == null) {
			if (other.circuito != null)
				return false;
		} else if (!circuito.equals(other.circuito))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idCarrera == null) {
			if (other.idCarrera != null)
				return false;
		} else if (!idCarrera.equals(other.idCarrera))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numvueltas == null) {
			if (other.numvueltas != null)
				return false;
		} else if (!numvueltas.equals(other.numvueltas))
			return false;
		return true;
	}

	public String toString() {
		return idCarrera + "" + fecha + " " + nombre + " " + numvueltas + ""
				+ circuito + " ";
	}

}