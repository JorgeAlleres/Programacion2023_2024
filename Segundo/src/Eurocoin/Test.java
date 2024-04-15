package Eurocoin;

import java.util.ArrayList;

public class Test {

	// Simula, mediante un programa, la generación de 6 monedas aleatorias siguiendo
	// la pauta correcta. Cada moneda generada debe ser una instancia de la clase
	// Moneda y la secuencia se debe ir almacenando en una lista.
	/*
	 * Ejemplo:
	 * 2 céntimos–cara
	 * 2 céntimos–cruz
	 * 50 céntimos–cruz
	 * 1 euro–cruz
	 * 1 euro–cara
	 * 10 céntimos–cara*/

	public static boolean valido(Moneda generada,Moneda anterior) {
		//Validamos si la moneda generada tiene alguno de los dos valores iguales a la última
		if(generada.getLado().equals(anterior.getLado()) || generada.getValor().equals(anterior.getValor()))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Moneda> monedero = new ArrayList<Moneda>();
		//añadimos la 1ª moneda
		monedero.add(new Moneda());
		
		//Añadimos las 5 siguientes monedas
		do {
			Moneda m = new Moneda();
			if(valido(m,monedero.get(monedero.size()-1))) {
				monedero.add(m);
			}	
		} while(monedero.size()<6);
		//Mostramos la colección de monedas
		System.out.println("Colección de 6 monedas:");
		for(Moneda m : monedero) {
			System.out.println(m);
		}
	}
}
