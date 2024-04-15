package TiendaMascotas;

import java.util.ArrayList;
import TiendaMascotas.GatoPeloCorto.razaCorto;
import TiendaMascotas.GatoPeloLargo.razaLargo;
import TiendaMascotas.GatoSinPelo.razaSinPelo;
import TiendaMascotas.PerroGrande.razaGrande;
import TiendaMascotas.PerroMediano.razaMediano;
import TiendaMascotas.PerroPequeño.razaPequeño;

public class testTiendaMascotas {
	
	public static void main(String[] args) {
		
		ArrayList<Mascota> TiendaMascotas = new ArrayList();
		
		GatoSinPelo GatoSinPelo = new GatoSinPelo("David", "Negro", 16, 1.54, 2.35, razaSinPelo.donskoy);
		TiendaMascotas.add(GatoSinPelo);
		PerroGrande PerroGrande = new PerroGrande("Bolt", "Marron/Negro", 14, 25.78, false, razaGrande.pastor_aleman);
		TiendaMascotas.add(PerroGrande);
		GatoPeloCorto GatoPeloCorto = new GatoPeloCorto("Martin", "Blanco", 5, 2.56, 10.4, razaCorto.manx);
		TiendaMascotas.add(GatoPeloCorto);
		PerroPequeño PerroPequeño = new PerroPequeño("Pluto", "Amarillo", 6, 10.54, false, razaPequeño.schnauzer);
		TiendaMascotas.add(PerroPequeño);
		PerroMediano PerroMediano = new PerroMediano("Max", "Gris", 18, 16.89, true, razaMediano.bulldog);
		TiendaMascotas.add(PerroMediano);
		GatoPeloLargo GatoPeloLargo = new GatoPeloLargo("Eduard", "Marron", 4, 1.2, 0.5, razaLargo.himalayo);
		TiendaMascotas.add(GatoPeloLargo);
		
		for(Mascota m: TiendaMascotas) {
			System.out.println(m.toString());
			m.sonido();
		}
	}
	
}
