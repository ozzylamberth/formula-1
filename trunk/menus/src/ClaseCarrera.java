public class ClaseCarrera {

	public String nombreCarrera;
	public String circuito;
	public String nombrePiloto1;
	public String nombrePiloto2;
	public String nombrePiloto3;
	public int pocision1;
	public int pocision2;
	public int pocision3;
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	public String getNombrePiloto1() {
		return nombrePiloto1;
	}
	public void setNombrePiloto1(String nombrePiloto1) {
		this.nombrePiloto1 = nombrePiloto1;
	}
	public String getNombrePiloto2() {
		return nombrePiloto2;
	}
	public void setNombrePiloto2(String nombrePiloto2) {
		this.nombrePiloto2 = nombrePiloto2;
	}
	public String getNombrePiloto3() {
		return nombrePiloto3;
	}
	public void setNombrePiloto3(String nombrePiloto3) {
		this.nombrePiloto3 = nombrePiloto3;
	}
	public int getPocision1() {
		return pocision1;
	}
	public void setPocision1(int pocision1) {
		this.pocision1 = pocision1;
	}
	public int getPocision2() {
		return pocision2;
	}
	public void setPocision2(int pocision2) {
		this.pocision2 = pocision2;
	}
	public int getPocision3() {
		return pocision3;
	}
	public void setPocision3(int pocision3) {
		this.pocision3 = pocision3;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((circuito == null) ? 0 : circuito.hashCode());
		result = prime * result
				+ ((nombreCarrera == null) ? 0 : nombreCarrera.hashCode());
		result = prime * result
				+ ((nombrePiloto1 == null) ? 0 : nombrePiloto1.hashCode());
		result = prime * result
				+ ((nombrePiloto2 == null) ? 0 : nombrePiloto2.hashCode());
		result = prime * result
				+ ((nombrePiloto3 == null) ? 0 : nombrePiloto3.hashCode());
		result = prime * result + pocision1;
		result = prime * result + pocision2;
		result = prime * result + pocision3;
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
		final ClaseCarrera other = (ClaseCarrera) obj;
		if (circuito == null) {
			if (other.circuito != null)
				return false;
		} else if (!circuito.equals(other.circuito))
			return false;
		if (nombreCarrera == null) {
			if (other.nombreCarrera != null)
				return false;
		} else if (!nombreCarrera.equals(other.nombreCarrera))
			return false;
		if (nombrePiloto1 == null) {
			if (other.nombrePiloto1 != null)
				return false;
		} else if (!nombrePiloto1.equals(other.nombrePiloto1))
			return false;
		if (nombrePiloto2 == null) {
			if (other.nombrePiloto2 != null)
				return false;
		} else if (!nombrePiloto2.equals(other.nombrePiloto2))
			return false;
		if (nombrePiloto3 == null) {
			if (other.nombrePiloto3 != null)
				return false;
		} else if (!nombrePiloto3.equals(other.nombrePiloto3))
			return false;
		if (pocision1 != other.pocision1)
			return false;
		if (pocision2 != other.pocision2)
			return false;
		if (pocision3 != other.pocision3)
			return false;
		return true;
	}
	
	public String toString() {
		return nombreCarrera + " " + circuito + " " + nombrePiloto1 +""+nombrePiloto2+" "
		+nombrePiloto3+""+pocision1+""+pocision2+""+pocision3;
	}
	
	
	
	

}