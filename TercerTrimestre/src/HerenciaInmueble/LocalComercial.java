package HerenciaInmueble;

public class LocalComercial extends Local {

	public static final int VALOR_AREA = 3000;
	private String centroComercial;

	LocalComercial(int id, int area, String direccion, tipo local, String centroComercial) {
		super(id, area, direccion, local);
		this.centroComercial=centroComercial;
	}

	public String getCentroComercial() {
		return centroComercial;
	}

	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}

	@Override
	public String toString() {
		return "LocalComercial [centroComercial=" + centroComercial + ", tipoLocal="
				+ tipoLocal + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
	@Override
	public double calcularPrecioVenta() {
		return area*VALOR_AREA;
	}
	
}
