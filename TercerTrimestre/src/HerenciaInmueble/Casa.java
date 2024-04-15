package HerenciaInmueble;

public class Casa extends Vivienda {

	protected int numPisos;

	Casa(int id, int area, String direccion, int numHabitaciones, int numBanhos, int numPisos) {
		super(id, area, direccion, numHabitaciones, numBanhos);
		this.numPisos=numPisos;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	@Override
	public String toString() {
		return "Casa [numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBanhos=" + numBanhos
				+ ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
}
