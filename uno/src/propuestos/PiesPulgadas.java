package propuestos;

import java.util.Scanner;

public class PiesPulgadas {
	
	public static final double CAMBIOaCM=2.54;
	
	public static double PiesyPulgadasACentímetros(int pies, int pulgadas) {
		pulgadas=pulgadas+(pies*12);
		return pulgadas*CAMBIOaCM;
	}

	public static int CentímetrosAPiesyPulgadas(int cm) {
		double pulgadas = 0, pies = 0;
		
		pulgadas = cm/2.54;
		if(pulgadas>=12) {
			pulgadas=-12;
			pies++;
		}
		return (int) pies;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int res=0;
		
		do {
			System.out.println("Para Pies y pulgadas a Centimetros pulse 1");
			System.out.println("Para Centimetros a Pies y pulgadas pulse 2");
			System.out.println("Para finalizar el programa pulse 3");
			res=sc.nextInt();
			switch(res) {
				case 1:
					System.out.println("Introduce pies");
					int pies = sc.nextInt();
					
					System.out.println("Introduce pulgadas");
					int pulgadas = sc.nextInt();
					
					if(pulgadas>=12 || pulgadas <0)
						System.out.println("Dato erróneo");
					else
					System.out.println("En Centímetros son: " + PiesyPulgadasACentímetros(pies, pulgadas));
				break;
				case 2:
					System.out.println("Introduce centímetros");
					int cm = sc.nextInt();
					
					System.out.println("En euros son: " + CentímetrosAPiesyPulgadas(cm));
				break;
				case 3:
					break;
				default:
					System.out.println("Opción no valida");
			}
			System.out.println("------------------------------");
		} while (res!=3);
			System.out.println("Fin de programa");
		
	}

}