package Propuestos;

/*12. Realiza un programa que muestre por pantalla los números del 1 al 100 sin mostrar aquellos números múltiplos
de 5.*/

public class Propuesto12 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if (i%5!=0)
				System.out.print(i + ", ");
		}
	}
}
