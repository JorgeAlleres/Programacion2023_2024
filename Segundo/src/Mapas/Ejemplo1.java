package Mapas;

import java.util.HashMap;

public class Ejemplo1 {

	public static void main(String[] args) {
		//KEY--> Integer //VALUE-->String
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(924, "Amalia Núñez");
		mapa.put(921, "Cindy Nero");
		mapa.put(700, "César Vázquez");
		mapa.put(219, "Víctor Tilla");
		mapa.put(537, "Alan Brito");
		mapa.put(605, "Esteban Quito");
		
		System.out.println("Los elementos del mapa son: \n" + mapa);
	}
}
