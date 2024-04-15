package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo4 {

	public static void main(String[] args) {
		// KEY--> Integer //VALUE-->String
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(924, "Amalia Núñez");
		mapa.put(921, "Cindy Nero");
		mapa.put(700, "César Vázquez");
		mapa.put(219, "Víctor Tilla");
		mapa.put(537, "Alan Brito");
		mapa.put(605, "Esteban Quito");

		System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
		System.out.println(mapa.entrySet());

		System.out.println("Código \tNombre");
		System.out.println("------ \t--------------");
		for (Map.Entry duo : mapa.entrySet()) {
			System.out.print(duo.getKey());
			System.out.print("\t");
			System.out.println(duo.getValue());
		}
	}
}
