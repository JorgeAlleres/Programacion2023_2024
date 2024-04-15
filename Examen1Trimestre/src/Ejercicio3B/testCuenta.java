package Ejercicio3B;

public class testCuenta {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta(2, 1000, "Jorge");
		
		System.out.println("Cuenta 1 " + c1.toString());
		System.out.println("Cuenta 2 " + c2.toString());

		System.out.println("Ingresamos 342 en Cuenta 1");
		c1.Deposito(342);
		System.out.println("Retiramos 950 en Cuenta 2");
		c2.Retiro(950);
		c2.getSaldo();
		
		System.out.println("Cuenta 1 " + c1.toString());
		System.out.println("Cuenta 2 " + c2.toString());
		
		System.out.println("Modificamos todos los datos con sets");
		c1.setContador(10);
		c1.setSaldo(150);
		c1.setTitular("Pepe");
		System.out.println("Cuenta 1 " + c1.toString());
		
		System.out.println("Sacamos todos los datos con gets");
		System.out.println("Contador: " + c2.getContador() + ", Saldo " + c2.getSaldo() + ", Titular " + c2.getTitular());
		
	}
}
