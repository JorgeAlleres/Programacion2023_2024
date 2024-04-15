package Mapas;

import java.util.HashMap;

public class Ejemplo2 {

	public static void main(String[] args) {
		// KEY--> Integer //VALUE-->String
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(924, "Amalia Núñez");
		mapa.put(921, "Cindy Nero");
		mapa.put(700, "César Vázquez");
		mapa.put(219, "Víctor Tilla");
		mapa.put(537, "Alan Brito");
		mapa.put(605, "Esteban Quito");
		
		System.out.println(mapa.keySet());
		System.out.println(mapa.get(921));
		System.out.println(mapa.get(605));
		System.out.println(mapa.get(888));
	}
}
