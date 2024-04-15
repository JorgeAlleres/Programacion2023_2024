package Propuestos;

public class testConsumo {

	public static void main(String[] args) {
		Consumo c = new Consumo(317, 23, 60, 1.87);
		System.out.println(c.getTiempo());
		System.out.println(c.consumoMedio());
		System.out.println(c.consumoEuros());
	}
}
