package HerenciaInmueble;

public class ApartamentoFamiliar extends Apartamento {

	public static final int VALOR_AREA = 2000;
	private double valorAdministracion;
	
	ApartamentoFamiliar(int id, int area, String direccion, int numHabitaciones, int numBanhos, int numPisos, double valorAdministracion) {
		super(id, area, direccion, numHabitaciones, numBanhos, numPisos);
		this.valorAdministracion=valorAdministracion;
	}

	public double getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(double valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	@Override
	public String toString() {
		return "ApartamentoFamiliar [valorAdministracion=" + valorAdministracion + ", numHabitaciones="
				+ numHabitaciones + ", numBanhos=" + numBanhos + ", id=" + id + ", area=" + area + ", direccion="
				+ direccion + "]";
	}

	@Override
	public double calcularPrecioVenta() {
		return area*VALOR_AREA;
	}
	
}
