package HerenciaInmueble;

public class Apartamento extends Vivienda {
	
	Apartamento(int id, int area, String direccion, int numHabitaciones, int numBanhos, int numPisos) {
		super(id, area, direccion, numHabitaciones, numBanhos);
	}

	@Override
	public String toString() {
		return "Apartamento [numHabitaciones=" + numHabitaciones + ", numBanhos=" + numBanhos + ", id=" + id + ", area="
				+ area + ", direccion=" + direccion + "]";
	}
	
}
