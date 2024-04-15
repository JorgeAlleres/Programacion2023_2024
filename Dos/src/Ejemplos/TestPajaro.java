package Ejemplos;

public class TestPajaro {

	public static void main(String[] args) {
		//Declara el nombre d euna referncia
		//Para manipular, apuntar a un objeto pajaro
		Pajaro p1;
		
		// objeto pajaro con new pajaro
		// igna a la referencia p
		p1 = new Pajaro();
		p1.setEdad(5);
		int num = p1.getEdad();
		System.out.println("Este pajero tiene: " + num);
		
		Pajaro p2 = new Pajaro('F',2343,"disecado");
		Pajaro p3 = new Pajaro("Bumbury");
		
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		}
}
