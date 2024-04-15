package HerenciaInmueble;

public class CasaIndependiente extends CasaUrbana {

	public static final int VALOR_AREA = 3000;
	
	CasaIndependiente(int id, int area, String direccion, int numHabitaciones, int numBanhos, int numPisos) {
		super(id, area, direccion, numHabitaciones, numBanhos, numPisos);
	}

	@Override
	public String toString() {
		return "CasaIndependiente [numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBanhos="
				+ numBanhos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
	@Override
	public double calcularPrecioVenta() {
		return area*VALOR_AREA;
	}
}
