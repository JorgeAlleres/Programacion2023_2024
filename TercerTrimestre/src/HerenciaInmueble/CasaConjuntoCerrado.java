package HerenciaInmueble;

public class CasaConjuntoCerrado extends CasaUrbana {

	public static final int VALOR_AREA = 2500;
	private double valorAdministracion;
	private boolean tienePiscina;
	private boolean tieneCamposDeportivos;
	
	CasaConjuntoCerrado(int id, int area, String direccion, int numHabitaciones, int numBanhos, int numPisos,
			double valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
		super(id, area, direccion, numHabitaciones, numBanhos, numPisos);
		this.valorAdministracion = valorAdministracion;
		this.tienePiscina = tienePiscina;
		this.tieneCamposDeportivos = tieneCamposDeportivos;
	}

	public double getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValor(double valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	public boolean isTienePiscina() {
		return tienePiscina;
	}

	public void setTienePiscina(boolean tienePiscina) {
		this.tienePiscina = tienePiscina;
	}

	public boolean isTieneCamposDeportivos() {
		return tieneCamposDeportivos;
	}

	public void setTieneCamposDeportivos(boolean tieneCamposDeportivos) {
		this.tieneCamposDeportivos = tieneCamposDeportivos;
	}

	@Override
	public String toString() {
		return "CasaConjuntoCerrado [valorAdministracion=" + valorAdministracion + ", tienePiscina=" + tienePiscina + ", tieneCamposDeportivos="
				+ tieneCamposDeportivos + ", numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones
				+ ", numBanhos=" + numBanhos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
	@Override
	public double calcularPrecioVenta() {
		return area*VALOR_AREA;
	}
}
