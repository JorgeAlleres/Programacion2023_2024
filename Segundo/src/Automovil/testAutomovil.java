package Automovil;

import Automovil.Automovil.tipoAutomovil;
import Automovil.Automovil.tipoColor;
import Automovil.Automovil.tipoCom;

public class testAutomovil {

	public static void main(String[] args) {
		Automovil uno = new Automovil("Ford", 2018, 3, 5, tipoCom.GASOLINA, tipoAutomovil.EJECUTIVO, 6, 250,
				tipoColor.ROJO);

		System.out.println(uno.toString());
		uno.setVelocidadActual(100);
		System.out.println("Velocidad actual = " + uno.velocidadActual);
		uno.acelera(20);
		System.out.println("Velocidad actual = " + uno.velocidadActual);
		uno.desacelera(50);
		System.out.println("Velocidad actual = " + uno.velocidadActual);
		uno.frena();
		System.out.println("Velocidad actual = " + uno.velocidadActual);
		uno.desacelera(20);
		System.out.println("Velocidad actual = " + uno.velocidadActual);
	}
}
