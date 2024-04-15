package Propuestos;

/*Método void variaAltura(double desplazamiento). Este método acepta un parámetro que será positivo o
negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.

Método boolean enOrbitaQ. Este método devolverá false si el satélite está en tierra y true en caso
contrario.

Método void variaPosicion(double variap, double variam). Este método permite modificar los atributos de
posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos parámetros serán valores
positivos o negativos relativos que harán al satélite modificar su posición.*/

public class proSatelite {

	private double meridiano;
	private double paralelo;
	private double DistanciaTierra;
	
	proSatelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		DistanciaTierra = d;
	}
	
	proSatelite() {
		meridiano = paralelo = DistanciaTierra = 0;
	}
	
	public double getMeridiano() {
		return meridiano;
	}
	public void setMeridiano(double meridiano) {
		this.meridiano = meridiano;
	}
	public double getParalelo() {
		return paralelo;
	}
	public void setParalelo(double paralelo) {
		this.paralelo = paralelo;
	}
	public double getDistanciaTierra() {
		return DistanciaTierra;
	}
	public void setDistanciaTierra(double distanciaTierra) {
		this.DistanciaTierra = distanciaTierra;
	}
	
	public void setPosicion(double m, double p, double d) {
		setMeridiano(m);
		setParalelo(p);
		setDistanciaTierra(d);
	}
	@Override
	public String toString() {
		return "proSatelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", DistanciaTierra=" + DistanciaTierra
				+ "]";
	}

	public void variaAltura(double desplazamiento) {
		setDistanciaTierra(DistanciaTierra+desplazamiento);
	}
	
	public boolean enOrbitaQ() {
		boolean orb = false;
			if(DistanciaTierra>0)
				orb = true;
		return orb;
	}
	
	public void variaPosicion(double variap, double variam) {
		meridiano+=variam;
		paralelo+=variap;
	}
	
}
