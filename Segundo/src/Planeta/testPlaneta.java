package Planeta;

public class testPlaneta {

	public static void main(String[] args) {
		Planeta marte = new Planeta("Marte", 2, 19460, 45.56, 25, 250352, true, 2.3, 20);
		Planeta tierra = new Planeta("Tierra", 1, 3232, 15.76, 17, 234322, true, 0.9, 140);
		
		System.out.println(marte.toString());
		System.out.println("Densidad: " + marte.calcularDensidad(marte.getMasa(), marte.getVolumen()));
		System.out.println();
		
		System.out.println(tierra.toString());
		System.out.println("Densidad: " + tierra.calcularDensidad(tierra.getMasa(), tierra.getVolumen()));
	}
}
