package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// KEY--> Integer //VALUE-->String
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(924, "Amalia Núñez");
		mapa.put(921, "Cindy Nero");
		mapa.put(700, "César Vázquez");
		mapa.put(219, "Víctor Tilla");
		mapa.put(537, "Alan Brito");
		mapa.put(605, "Esteban Quito");

		System.out.println("Por favor introduce el código");
		int code = sc.nextInt();

		if(mapa.containsKey(code))
			System.out.println("El código " + code + " corresponde a " + mapa.get(code));
		else
			System.out.println("El código entroducido no existe");
	}
}
