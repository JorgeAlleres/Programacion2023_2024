package Propuestos;

public class Coche {

	//Atributos
	private int velocidad;
	private String marca;
	private String modelo;
	
	
	//Constructores
	//Constructor sin atributos
	Coche() {
		velocidad=0;
		marca="";
		modelo="";
	}
	
	//Constructor con todos los atributos
	Coche(int v, String mar, String mod) {
		if(v<0 || v>120)
			this.velocidad=0;
		else
			this.velocidad=v;
		this.marca=mar;
		this.modelo=mod;
	}
	
	//Getters
	public int getVelocidad() {
		return this.velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	//Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setVelocidad(int v) {
		if(v<0 || v>120)
			this.velocidad=0;
		else
			this.velocidad=v;
	}
	
	//Metodos de la clase
	public void acelera(int mas) {
		setVelocidad(getVelocidad()+mas);
	}
	
	public void frena(int men) {
		setVelocidad(getVelocidad()-men);
	}

	//ToString
	public String toString() {
		return "Coche [velocidad=" + velocidad + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
