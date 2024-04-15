package Ejercicio4B;

import java.util.Scanner;

public class Ejercicio4B {

	
	/*Interpreto que solo se ven los turnos si no es domingo
	 * y que los impuestos se acumulan de forma continúa, es decir, uno después de otro
	 * */
	public static double calcularDiaYTurno(String dia, String turno, double coste) {
		
		if(dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes")) {
			System.out.println("No es domingo");
			coste=coste+(coste*0.03);
			if(turno.equals("mañana")) {
				System.out.println("Turno de mañana");
				coste=coste+(coste*0.15);
			} else if(turno.equals("tarde")) {
				System.out.println("Turno de tarde");
				coste=coste+(coste*0.10);
			} else if(turno.equals("noche"))
				System.out.println("Turno de noche");
			else
				System.out.println("Turno no válido");
		} else if(dia.equals("domingo"))
			System.out.println("Es domingo");
		else
			System.out.println("Día no válido");
		
		return coste;
	}
	
	public static double calculaCosteTiempo(int tiempo) {
		double coste = 0;
		
		while(tiempo>10) {
			tiempo--;
			coste+=0.50;
		}
		while(tiempo>=9) {
			tiempo--;
			coste+=0.70;
		}
		while(tiempo>=6) {
			tiempo--;
			coste+=0.80;
		}
		while(tiempo>0) {
			tiempo--;
			coste+=1;
		}
		return coste;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String dia, turno;
		int tiempo;
		double coste;
		
		System.out.println("Día LLamada");
		dia = sc.nextLine();
		dia=dia.toLowerCase();
		System.out.println("Turno en Horario de LLamada");
		turno = sc.nextLine();
		turno=turno.toLowerCase();
		System.out.println("Duración LLamada");
		tiempo = sc.nextInt();
		
		coste=calculaCosteTiempo(tiempo);
		System.out.println("Coste sin impuestos " + coste);
		coste=calcularDiaYTurno(dia, turno, coste);
		System.out.println("Coste Final " + coste);
	}
}
