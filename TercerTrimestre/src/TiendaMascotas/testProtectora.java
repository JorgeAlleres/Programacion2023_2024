package TiendaMascotas;

import java.util.ArrayList;

import TiendaMascotas.GatoPeloCorto.razaCorto;
import TiendaMascotas.GatoPeloLargo.razaLargo;
import TiendaMascotas.GatoSinPelo.razaSinPelo;
import TiendaMascotas.PerroGrande.razaGrande;
import TiendaMascotas.PerroMediano.razaMediano;
import TiendaMascotas.PerroPequeño.razaPequeño;

public class testProtectora {

	// Carnet: Mascota 50 €
	// Chip: Perro 100 € y Gato 75 €
	// Vacunas: Perro grande 150 €, Perro mediano 125 € y Perro pequeño 100 €
	// Desparasitación: GatoPeloLargo 200 €, GatoPeloCorto 100 € y GatoSinPelo 50 €
	// Calcular los impuestos municipales de una protectora, sabiendo que tiene 2
	// perros grandes, 1 perro mediano, 3 perros pequeños,
	// 3 gatos con pelo largo, 3 gatos con pelo gorto y 1 gato sin pelo

	public static void main(String[] args) {
		ArrayList<Mascota> Protectora = new ArrayList<Mascota>();

		PerroGrande PerroGrande1 = new PerroGrande("1", "Negro", 16, 1.54, true, razaGrande.pastor_aleman);
		PerroGrande PerroGrande2 = new PerroGrande("2", "Azul", 13, 10.4, false, razaGrande.rotweiller);
		Protectora.add(PerroGrande1);
		Protectora.add(PerroGrande2);
		PerroMediano PerroMediano1 = new PerroMediano("3", "Gris", 18, 16.89, true, razaMediano.bulldog);
		Protectora.add(PerroMediano1);
		PerroPequeño PerroPequeño1 = new PerroPequeño("4", "Amarillo", 6, 10.54, true, razaPequeño.yorkshire);
		PerroPequeño PerroPequeño2 = new PerroPequeño("5", "Verde", 7, 7.4, false, razaPequeño.chihuahua);
		PerroPequeño PerroPequeño3 = new PerroPequeño("6", "Naranja", 34, 1.54, false, razaPequeño.schnauzer);
		Protectora.add(PerroPequeño1);
		Protectora.add(PerroPequeño2);
		Protectora.add(PerroPequeño3);
		GatoPeloLargo GatoPeloLargo1 = new GatoPeloLargo("7", "Marron", 4, 15.67, 0.5, razaLargo.himalayo);
		GatoPeloLargo GatoPeloLargo2 = new GatoPeloLargo("8", "Azul", 14, 1.23, 1.45, razaLargo.somali);
		GatoPeloLargo GatoPeloLargo3 = new GatoPeloLargo("9", "Dorado", 42, 12.6, 0.85, razaLargo.balines);
		Protectora.add(GatoPeloLargo1);
		Protectora.add(GatoPeloLargo2);
		Protectora.add(GatoPeloLargo3);
		GatoPeloCorto GatoPeloCorto1 = new GatoPeloCorto("10", "Blanco", 21, 256, 10.4, razaCorto.manx);
		GatoPeloCorto GatoPeloCorto2 = new GatoPeloCorto("11", "Plata", 7, 2.6, 1.4, razaCorto.devon_rex);
		GatoPeloCorto GatoPeloCorto3 = new GatoPeloCorto("12", "Morado", 25, 7.56, 10, razaCorto.britanico);
		Protectora.add(GatoPeloCorto1);
		Protectora.add(GatoPeloCorto2);
		Protectora.add(GatoPeloCorto3);
		GatoSinPelo GatoSinPelo1 = new GatoSinPelo("13", "Dorado", 4, 2.6, 0.45, razaSinPelo.esfinge);
		Protectora.add(GatoPeloLargo1);

		int total = 0;
		for (Mascota m : Protectora) {
			System.out.println(m.toString());
			
			//Arreglo creando el metodo sonido vacio en la clase Mascota
			m.sonido();
			
			//Arreglamos con instanceof y casteo hacia abajo para saber si es perro o gato en tiempo de ejecución
			if(m instanceof Gato)
				((Gato) m).maullar();
			if(m instanceof Perro)
				((Perro) m).ladrar();
			
			System.out.println("Llevamos de impuestos: " + total);
			System.out.println("Paga de impuesto + " + m.pagoImpuesto() + " €");
			total+=m.pagoImpuesto();
		}
		System.out.println("Total Impuestos: " + total + " €");
	}
}
