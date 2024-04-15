package HerenciaInmueble;

public class Oficina extends Local {

	public static final int VALOR_AREA = 3500;
	private boolean propiedadDelGobierno;

	Oficina(int id, int area, String direccion, tipo local, boolean propiedadDelGobierno) {
		super(id, area, direccion, local);
		this.propiedadDelGobierno = propiedadDelGobierno;
	}

	public boolean isPropiedadDelGobierno() {
		return propiedadDelGobierno;
	}

	public void setPropiedadDelGobierno(boolean propiedadDelGobierno) {
		this.propiedadDelGobierno = propiedadDelGobierno;
	}

	@Override
	public String toString() {
		return "Oficina [propiedadDelGobierno=" + propiedadDelGobierno + ", tipoLocal="
				+ tipoLocal + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
	@Override
	public double calcularPrecioVenta() {
		return area*VALOR_AREA;
	}
	
}
