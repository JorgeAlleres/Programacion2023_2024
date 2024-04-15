package ejemplo3_6;

import java.util.Arrays;

public class Tienda {

	String nombre;
	String propietario;
	int id;
	Computador[] computadores;
	static int numComp;

	public Tienda(String nombre, String propietario, int id, int tamanho) {
		if (tamanho < 1) {
			System.out.println("Cantidad de computadores insuficientes.");
		} else {
			this.nombre = nombre;
			this.propietario = propietario;
			this.id = id;
			computadores = new Computador[tamanho];
			numComp = 0;
		}
	}

	public boolean tiendaLlena() {
		return numComp == computadores.length;
	}

	public boolean tiendaVacia() {
		return numComp == 0;
	}

	public void anhadir(Computador computador) {
		if (tiendaLlena()) {
			System.out.println("La tienda está llena. No se puede añadir elemento");
		} else {
			computadores[numComp] = computador;
			numComp++;
		}
	}

	public boolean eliminar(String marcaComputador) {
		int pos = buscar(marcaComputador);
		if (pos < 0) {
			return false;
		}
		for (int i = pos; i < numComp - 1; i++) {
			computadores[i] = computadores[i + 1];
		}
		computadores[computadores.length-1]=null;
		numComp--;
		return true;
	}

	public int buscar(String marcaComputador) {
		for (int i = 0; i < numComp; i++) {
			// USAR GETMARCA() PORFAVOR em vez del atributo marca
			if (computadores[i].getMarca().equals(marcaComputador))
				return i;
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", propietario=" + propietario + ", id=" + id + ", computadores="
				+ Arrays.toString(computadores) + "]";
	}

}
