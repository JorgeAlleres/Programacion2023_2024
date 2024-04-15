package ejemplo3_2;

public class ArrayCadenas {

	public static void main(String[] args) {
		String[] nombreDia = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo" };

		for(int i=0; i<nombreDia.length;i++) {
			System.out.println(nombreDia[i]);
			System.out.println("Nº Letras: " + nombreDia[i].length());
		}
	}
}
