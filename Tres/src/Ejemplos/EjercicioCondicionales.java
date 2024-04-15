package Ejemplos;

import java.util.Scanner;

public class EjercicioCondicionales {

	/*Se quiere determinar el importe a facturar a los clientes de unos grandes almacenes siguiendo estos criterios:
		- Tarjeta oro tendrán 15% descuento
		- Tarjeta club tendrán un 5% descuento
		- Si la targeta (oro o club) es modalidad joven, tendrá un 5% descuento
		- Los descuentos son acumulables*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion_targeta, opcion_joven;
		
		System.out.println("Targeta oro - 1");
		System.out.println("Targeta club - 2");
		System.out.println("No tengo targeta - Cualquier número");
		opcion_targeta=sc.nextInt();
		
		if(opcion_targeta==1 && opcion_targeta==2) {
			System.out.println("Es joven - 3");
			System.out.println("No es joven - Cualquier número");
		}
		opcion_joven=sc.nextInt();
		
		if(opcion_targeta==1) {
			if(opcion_joven==3)
				System.out.println("Oro joven (20% descuento)");
			else
				System.out.println("Oro (15% descuento)");
		} else if (opcion_targeta==2){
			if(opcion_joven==3)
				System.out.println("Club joven (10% descuento)");
			else
				System.out.println("Club (5% descuento)");
		} else {
			System.out.println("Ninguna targeta");
		}
		
	}
}
