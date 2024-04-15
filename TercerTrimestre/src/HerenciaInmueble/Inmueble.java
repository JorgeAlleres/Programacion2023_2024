package HerenciaInmueble;

public class Inmueble {

	protected int id;
	protected int area; // metros cuadrados
	protected String direccion;
	protected double precioVenta=0d;

	Inmueble(int id, int area, String direccion) {
		this.id = id;
		this.area = area;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
	public double calcularPrecioVenta() {
		return 0d;
	}
	
}
