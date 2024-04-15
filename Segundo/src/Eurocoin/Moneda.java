package Eurocoin;

public class Moneda {

	//Declaramos los tipos
	String valor;
	final String[] facial = {
		"1_centimo", "2_centimos", "5_centimos", "10_centimos", "20_centimos",
		"50_centimos", "1_euro", "2_euros"};
	String lado;
	final String[] side = {
			"Cara", "Cruz"};

	//Constructor
	public Moneda() {
		this.valor = facial[(int)(Math.random()*8)];
		this.lado = side[(int)(Math.random()*2)];
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Moneda [valor=" + valor + ", lado=" + lado + "]";
	}

	
	
}
