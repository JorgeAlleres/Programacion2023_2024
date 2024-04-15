package ejemplo3_2;

public class DarVuelta {

	public static void main(String[] args) {

		String cadena = new String("Hola Mundo!");
		
		char[] caracteres = cadena.toCharArray();
		String volta = "";

		for (int i = caracteres.length-1; i >= 0; i--)
			volta += caracteres[i];
		
		System.out.println(volta);
	}
}
