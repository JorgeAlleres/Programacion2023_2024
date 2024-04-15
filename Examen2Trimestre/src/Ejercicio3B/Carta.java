package Ejercicio3B;

import java.util.Objects;

public class Carta implements Comparable {

	String valor;
	final String[] numero = { "As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey" };
	String palo;
	final String[] simbolo = { "Bastos", "Copas", "Espadas", "Oros" };

	// Constructor
	public Carta() {
		this.valor = numero[(int) (Math.random() * 10)];
		this.palo = simbolo[(int) (Math.random() * 4)];
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta otra = (Carta) obj;
		return Objects.equals(palo, otra.palo) && Objects.equals(valor, otra.valor);
	}

	@Override
	public int compareTo(Object o) {
		Carta c = (Carta) o;
		if (!this.getPalo().equals(c.getPalo()))
			return this.getValor().compareTo(c.getValor());
		else
			return this.getPalo().compareTo(c.getPalo());
	}
}
