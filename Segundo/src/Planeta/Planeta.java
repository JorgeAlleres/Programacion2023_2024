package Planeta;

/*
u Determinar si un planeta del sistema solar se considera exterior.
El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una
unidad astronómica (UA) es la distancia entre la Tierra y el Sol=
149597870 Km.
u En un método main se deben crear dos planetas y mostrar los valores de sus atributos en pantalla. Además, se debe imprimir la
densidad de cada planeta y si el planeta es un planeta exterior del
sistema solar.*/

public class Planeta {

	//Atributos del planeta
	public String nombre = null;
	public int numSatelites = 0;
	public double masa = 0; // Kilogramos
	public double volumen = 0; // Kilómtros cúbicos
	public int diametro = 0; // Kilómetros
	public int distanciaMediaSol = 0; // Millones de kilómetros
	public enum tamanho {
		GASEOSO, TERRESTRE, ENANO
	};
	tamanho tamanho;
	public boolean visible = false;
	public double periodoOrbital; //Años
	public double periodoRotacion; //Días

	//Constructor de un planeta con todos los parametros
	Planeta(String nombre, int numSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, boolean visible, double periodoOrbital,double periodoRotacion) {
		this.nombre = nombre;
		this.numSatelites = numSatelites;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distanciaMediaSol = distanciaMediaSol;
		this.visible = visible;
		this.periodoOrbital = periodoOrbital;
		this.periodoRotacion = periodoRotacion;
	}
	
	//Getters y setters para modificar los valores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumSatelites() {
		return numSatelites;
	}

	public void setNumSatelites(int numSatelites) {
		this.numSatelites = numSatelites;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getDistanciaMediaSol() {
		return distanciaMediaSol;
	}

	public void setDistanciaMediaSol(int distanciaMediaSol) {
		this.distanciaMediaSol = distanciaMediaSol;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public double getPeriodoOrbital() {
		return periodoOrbital;
	}

	public void setPeriodoOrbital(double periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}

	public double getPeriodoRotacion() {
		return periodoRotacion;
	}

	public void setPeriodoRotacion(double periodoRotacion) {
		this.periodoRotacion = periodoRotacion;
	}

	//Metodos de la clase
	public double calcularDensidad(double masa, double volumen) {
		return masa/volumen;
	}
	
	public boolean esExterior(int distanciaMediaSol) {
		double ua = 1495978;
		if(distanciaMediaSol>(ua*3.4))
			return true;
		else
			return false;
	}
	
	//ToString para mostrar los planetas
	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", numSatelites=" + numSatelites + ", masa=" + masa + ", volumen="
				+ volumen + ", diametro=" + diametro + ", distanciaMediaSol=" + distanciaMediaSol + ", tamanho="
				+ tamanho + ", visible=" + visible + ", periodoOrbital=" + periodoOrbital + ", periodoRotacion="
				+ periodoRotacion + "]";
	}

}
