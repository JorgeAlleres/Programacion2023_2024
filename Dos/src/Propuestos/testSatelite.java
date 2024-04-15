package Propuestos;

public class testSatelite {

	public static void main(String[] args) {
		
		proSatelite sabaris = new proSatelite(-8, 42, 1);
		System.out.println(sabaris.toString());
		sabaris.setPosicion(1,  42.4, 0.5);
		System.out.println(sabaris.toString());
		System.out.println(sabaris.enOrbitaQ());
		
		proSatelite xabarin = new proSatelite();
		System.out.println(xabarin.toString());
		sabaris.variaPosicion(20, -40);
		xabarin.variaAltura(30);
		System.out.println(xabarin);
	}
}
