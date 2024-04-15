package Propuestos;

public class Propuesto11 {

	public static void main(String[] args) {
		
		System.out.println("sando módulo 2");
		for(int i=1; i<=100; i++) {
			if(i%2==0)
				System.out.println(i + " es par");
		}
		
		System.out.println("Usando sucesión aritmética");
		for(int i=1; i<=50; i++) {
			System.out.println(i + " es par");
		}
		
		System.out.println("Usando el contador");
		for(int i=2; i<=100; i=i+2) {
			System.out.println(i + " es par");
		}
	}
}
