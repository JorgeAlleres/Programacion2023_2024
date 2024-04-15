package Propuestos;

public class Consumo {

	private int kilometros;
	private int litros;
	private int vmed;
	private double pgas;
	
	public Consumo() {
		this.kilometros = 0;
		this.litros = 0;
		this.vmed = 0;
		this.pgas = 0;
	}
	
	public Consumo(int kilometros, int litros, int vmed, double pgas) {
		this.kilometros = kilometros;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}

	public int getKilometros() {
		return kilometros;
	}
	
	public int getLitros() {
		return litros;
	}
	
	public int getVmed() {
		return vmed;
	}
	
	public double getPgas() {
		return pgas;
	}
	
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	public void setLitros(int litros) {
		this.litros = litros;
	}
	
	public void setVmed(int vmed) {
		this.vmed = vmed;
	}
	
	public void setPgas(double pgas) {
		this.pgas = pgas;
	}

	
	public double getTiempo() {
		double consumo;
		consumo = kilometros/vmed;
		return consumo;
	}
	
	public double consumoMedio() {
		double consumo;
		consumo = litros/kilometros*100;
		return consumo;
	}
	
	public double consumoEuros() {
		return (litros/kilometros*100)*pgas;
	}
	
	public String toString() {
		return "Consumo [kilometros=" + kilometros + ", litros=" + litros + ", vmed=" + vmed + ", pgas=" + pgas + "]";
	}
	
}
