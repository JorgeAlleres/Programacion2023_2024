package HerenciaInmueble;

public class Local extends Inmueble {

	public enum tipo {
		CALLE, INTERNO
	}

	protected tipo tipoLocal;

	Local(int id, int area, String direccion, tipo tipoLocal) {
		super(id, area, direccion);
		this.tipoLocal = tipoLocal;
	}
	
	public tipo getTipoLocal() {
		return tipoLocal;
	}

	public void setTipoLocal(tipo tipoLocal) {
		this.tipoLocal = tipoLocal;
	}

	@Override
	public String toString() {
		return "Local [tipoLocal=" + tipoLocal + ", id=" + id + ", area=" + area + ", direccion=" + direccion
				+ "]";
	}
	
}
