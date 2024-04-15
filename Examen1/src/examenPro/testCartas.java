package examenPro;

import java.util.ArrayList;
import java.util.Collections;

public class testCartas {
	
	 public static void main(String[] args) {
	        ArrayList<Carta> mano = new ArrayList<>();
	        String[] palos = {"corazones", "diamantes", "picas", "tréboles"};
	        String[] numeros = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

	        for (String palo : palos) {
	            for (String numero : numeros) {
	                mano.add(new Carta(palo, numero));
	            }
	        }

	        Collections.shuffle(mano);

	        System.out.println("Mano de cinco cartas ordenadas por PALO y NÚMERO:");
	        for (Carta carta : mano.subList(0, 5)) {
	            System.out.println(carta.toString());
	        }

	        int totalPuntos = 0;
	        for (Carta carta : mano.subList(0, 5)) {
	            totalPuntos += carta.getValor();
	        }

	        System.out.println("Tienes " + totalPuntos + " puntos.");
	    }

}
