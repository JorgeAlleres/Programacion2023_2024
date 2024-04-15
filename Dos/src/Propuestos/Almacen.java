package Propuestos;

public class Almacen {

	// Atributos
	private double papas;
	private double chocos;

	// Constructores
	Almacen() {
		this.papas = 0;
		this.chocos = 0;
	}

	Almacen(double papas, double chocos) {
		this.papas = papas;
		this.chocos = chocos;
	}

	// Setters
	public void setPapas(double papas) {
		this.papas = papas;
	}

	public void setChocos(double chocos) {
		this.chocos = chocos;
	}

	// Getters
	public double getPapas() {
		return papas;
	}

	public double getChocos() {
		return chocos;
	}

	// Añade x kilos de papas a los ya existentes.
	public void addPapas(double compra_papas) {
		setPapas(getPapas()+compra_papas);
	}

	// Añade x kilos de chocos a los ya existentes.
	public void addChocos(double compra_chocos) {
		setChocos(getChocos()+compra_chocos);
	}

	// Añade Muestra por pantalla los kilos de papas que hay en el almacén.
	public void showPapas() {
		System.out.println("Hay " + papas + " kilos de papas.");
	}

	// Muestra por pantalla los kilos de chocos que hay en el almacén.
	public void showChocos() {
		System.out.println("Hay " + chocos + " kilos de chocos.");
	}

	// Devuelve el número de clientes que puede atender el restaurante
	public int getComensales() {
		int comensales = 0;
		boolean seguir = false;
		do {
			if (papas >= 1 && chocos >= 0.5) {
				comensales += 3;
				papas -= 1;
				chocos -= 0.5;
			} else {
				seguir = true;
			}
		} while (!seguir);
		return comensales;
	}

	//Renovar existencias
	public void irMercado(double papas_compradas, double chocos_comprados) {
		addPapas(papas_compradas);
		addChocos(chocos_comprados);
	}
	
	//ToString
	public String toString() {
		return "Almacen [papas=" + papas + ", chocos=" + chocos + "]";
	}
}
