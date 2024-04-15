package HerenciaInmueble;

public class CasaUrbana extends Casa {

	CasaUrbana(int id, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
		super(id, area, direccion, numHabitaciones, numBaños, numPisos);
	}

	@Override
	public String toString() {
		return "CasaUrbana [numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBanhos=" + numBanhos
				+ ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}

}
