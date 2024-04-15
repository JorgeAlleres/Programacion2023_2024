package ejemplo3_2;

public class MuestraCaracteres {

	public static void main(String[] args) {
		
		String cadena = new String("Hola Mundo!");

		// Asi te va mostrando uno a uno cada uno de los caracteres
		for (int j = 0; j < cadena.length(); j++)
			System.out.println("-> " + cadena.charAt(j) + " <-");
	}
}
