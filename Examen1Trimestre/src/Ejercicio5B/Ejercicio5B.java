package Ejercicio5B;

import java.util.Scanner;

public class Ejercicio5B {

	public static double MetroAPie = 0.3048;
	public static double YardaAMetro = 0.9144;

	public static double metroAPie(double metro) {
		double pie = 0;
		pie = metro / MetroAPie;
		return pie;
	}

	public static double YardaAMetro(double yarda) {
		double metro = 0;
		metro = yarda * YardaAMetro;
		return metro;
	}

	public static double PieAYarda(double pie) {
		double yarda = 0;
		yarda = ((pie * MetroAPie) * YardaAMetro);
		return yarda;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double metro_introducido, yarda_introducida, pie_introducido;
		double metro_calculado, yarda_calculada, pie_calculado;

		System.out.println("Introduce metros");
		metro_introducido = sc.nextDouble();
		System.out.println("Introduce yardas");
		yarda_introducida = sc.nextDouble();
		System.out.println("Introduce pies");
		pie_introducido = sc.nextDouble();

		pie_calculado = metroAPie(metro_introducido);
		System.out.println(metro_introducido + " metros a pies: " + pie_calculado);

		metro_calculado = YardaAMetro(yarda_introducida);
		System.out.println(yarda_introducida + " yardas a metros: " + metro_calculado);

		yarda_calculada = PieAYarda(pie_introducido);
		System.out.println(pie_introducido + " pies a yardas: " + yarda_calculada);
	}

}
