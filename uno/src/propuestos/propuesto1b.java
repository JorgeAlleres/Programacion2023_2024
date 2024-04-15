package propuestos;

import java.util.Scanner;

public class propuesto1b {

	private static int sumar(int n1, int n2) {
		return n1+n2;
	}
	
	private static int restar(int n1, int n2) {
		return n1-n2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0, suma = 0;
		char res=' ';
		
		do {
			System.out.println("Dame primer entero");
			n1 = sc.nextInt();
			
			System.out.println("Dame segundo entero");
			n2 = sc.nextInt();
			
			System.out.println("Sumar S, restar R, Salir Q");
			res=sc.next().charAt(0);
			switch(res) {
				case 'S':
					//Secuencia de sentencias
					System.out.println("La suma es: " + sumar(n1,n2));
				break;
				case 'R':
					//Secuencia de sentencias
					System.out.println("La resta es: " + restar(n1,n2));
				break;
				case 'Q':
					//Secuencia de sentencias
					//System.out.println("Adios");
					break;
				default:
					//Default sentencia de sentencias
					System.out.println("Caracter no valido");
					System.out.println("------------------------------");
			}
		} while (res!='Q');
			System.out.println("Fin de programa");
	}
}
