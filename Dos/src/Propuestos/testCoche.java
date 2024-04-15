package Propuestos;

public class testCoche {

	public static void main(String[] args) {
		
		Coche ceronte = new Coche();
		System.out.println(ceronte.toString());
		
		ceronte.setMarca("africano");
		ceronte.setModelo("blanco");
		ceronte.setVelocidad(-30);
		
		System.out.println(ceronte.toString());
	
		Coche macuin = new Coche(23, "pasos", "pez");
		System.out.println(macuin.toString());
		
		macuin.acelera(45);
		System.out.println(macuin.toString());
		macuin.frena(12);
		System.out.println(macuin.toString());
	}
}
