package HerenciaInmueble;

public class CasaRural extends Casa {

	public static final int VALOR_AREA = 1500;
	protected double distanciaCabecera;
	protected int altitud;

	CasaRural(int id, int area, String direccion, int numHabitaciones, int numBanhos, int numPisos,
			double distanciaCabecera, int altitud) {
		super(id, area, direccion, numHabitaciones, numBanhos, numPisos);
		this.distanciaCabecera = distanciaCabecera;
		this.altitud = altitud;
	}

	public double getDistanciaCabecera() {
		return distanciaCabecera;
	}

	public void setDistanciaCabecera(double distanciaCabecera) {
		this.distanciaCabecera = distanciaCabecera;
	}

	public int getAltitud() {
		return altitud;
	}

	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}

	@Override
	public String toString() {
		return "CasaRural [distanciaCabecera=" + distanciaCabecera + ", altitud=" + altitud + ", numPisos=" + numPisos
				+ ", numHabitaciones=" + numHabitaciones + ", numBanhos=" + numBanhos + ", id=" + id + ", area=" + area
				+ ", direccion=" + direccion + "]";
	}

	@Override
	public double calcularPrecioVenta() {
		return area * VALOR_AREA;
	}
}
