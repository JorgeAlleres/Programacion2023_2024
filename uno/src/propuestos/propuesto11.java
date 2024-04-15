package propuestos;

import java.util.Scanner;

//Segundos a horas minutos y segundos

public class propuesto11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tiempo=0;
		
		System.out.println("Introduce segundos:");
		tiempo = sc.nextInt();
		
		int dias, horas, minutos, segundos;
		
		dias=tiempo/86400;
		horas=(tiempo%86400)/3600;
		minutos=(tiempo/60)%60;
		segundos=tiempo%60;
		
		System.out.println("Días: "+ dias +",Horas: " + horas + ", Minutos: " + minutos + " y Segundos " + segundos);
	}
}
