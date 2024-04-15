package HerenciaInmueble;

public class Vivienda extends Inmueble {

	protected int numHabitaciones;
	protected int numBanhos; 

	Vivienda(int id, int area, String direccion, int numHabitaciones, int numBanhos) {
		super(id, area, direccion);
		this.numHabitaciones=numHabitaciones;
		this.numBanhos=numBanhos;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumBanhos() {
		return numBanhos;
	}

	public void setNumBanhos(int numBanhos) {
		this.numBanhos = numBanhos;
	}

	@Override
	public String toString() {
		return "Vivienda [numHabitaciones=" + numHabitaciones + ", numBanhos=" + numBanhos + ", id=" + id + ", area="
				+ area + ", direccion=" + direccion + "]";
	}

}
