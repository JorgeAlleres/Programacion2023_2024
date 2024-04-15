package HerenciaInmueble;

public class ApartaEstudio extends Apartamento {

	public static final int VALOR_AREA = 1500;
	
	ApartaEstudio(int id, int area, String direccion, int numHabitaciones, int numBanhos, int numPisos) {
		super(id, area, direccion, numHabitaciones, numBanhos, numPisos);
	}

	@Override
	public String toString() {
		return "Apartaestudio [numHabitaciones=" + numHabitaciones + ", numBanhos=" + numBanhos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + "]";
	}
	
	@Override
	public double calcularPrecioVenta() {
		return area*VALOR_AREA;
	}
}
