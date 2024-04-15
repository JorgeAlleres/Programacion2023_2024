package HerenciaInmueble;

import java.util.ArrayList;

import HerenciaInmueble.Local.tipo;

public class testInmuebles {

	public static int generaArea() {
		return (int) (30 + Math.random()*120);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Inmueble> col = new ArrayList();
		
		CasaRural CasaRural = new CasaRural(1, generaArea(), "Hispanidad 31", 3, 1, 1, 1000, 500);
		col.add(CasaRural);
		CasaConjuntoCerrado CasaConjuntoCerrado = new CasaConjuntoCerrado(2, generaArea(), "Hispanidad 32", 7, 2, 2, 1000000, true, false);
		col.add(CasaConjuntoCerrado);
		CasaIndependiente CasaIndependiente = new CasaIndependiente(3, generaArea(), "Hispanidad 33", 5, 2, 1);
		col.add(CasaIndependiente);
		ApartamentoFamiliar ApartamentoFamiliar = new ApartamentoFamiliar(4, generaArea(), "Hispanidad 34", 1, 3, 2, 15000);
		col.add(ApartamentoFamiliar);
		ApartaEstudio ApartaEstudio = new ApartaEstudio(5, generaArea(), "Hispanidad 35", 1, 1, 1);
		col.add(ApartaEstudio);
		LocalComercial LocalComercial = new LocalComercial(6, generaArea(), "Hispanidad 36", tipo.INTERNO, "GranVia");
		col.add(LocalComercial);
		Oficina Oficina = new Oficina(7, generaArea(), "Hispanidad 37", tipo.CALLE, false);
		col.add(Oficina);
		
		System.out.println(CasaRural.toString());
		System.out.println(CasaConjuntoCerrado.toString());
		System.out.println(CasaIndependiente.toString());
		System.out.println(ApartamentoFamiliar.toString());
		System.out.println(ApartaEstudio.toString());
		System.out.println(LocalComercial.toString());
		System.out.println(Oficina.toString());
		
		System.out.println();
		
		float precioPropiedades = 0f;
		for (Inmueble i : col) {
			System.out.println(i.toString());
			precioPropiedades+=(i.calcularPrecioVenta());
		}
		
		System.out.println("Total libros = " + precioPropiedades);
		System.out.println("IVA del 21% = " + 0.21*precioPropiedades);
		System.out.println("Precio final = " + 1.21*precioPropiedades);
	}
}
