package Caja;

public class testCaja {

	public static void main(String[] args) {
		Caja uno = new Caja();
		Caja dos = new Caja(1,2,3);
		Caja tres = new Caja(100);
		Caja cuatro = new Caja(dos, "Cajita");
		
		System.out.println(uno.toString());
		System.out.println(dos.toString());
		System.out.println(tres.toString());
		System.out.println(cuatro.toString());
		
	}
}
