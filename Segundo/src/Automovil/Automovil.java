package Automovil;

public class Automovil {

	// Atributo para la marca
	String marca;
	// Atributo para el modelo
	int modelo;
	// Atributo para el motor
	int motor;
	// Atributo para el numero de puertas
	int numeroPuertas;

	//Atributo para saber si es automatico
	boolean auto;
	
	// Atributo para el tipo de combustible
	enum tipoCom {
		GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
	}

	tipoCom combustible;

	// Atributo para el tipo de automovil
	enum tipoAutomovil {
		CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUB
	}

	tipoAutomovil tipoAutomovil;

	// Atributo para el tipo de color
	enum tipoColor {
		BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
	}

	tipoColor color;
	// Atributo para el numero de asientos
	int cantidadAsientos;
	// Atributo para la velocidad máxima
	int velocidadMáxima;
	// Atributo inicializado a 0 de velocidad acual
	int velocidadActual = 0;

	// Constructor con todos los parámetros
	Automovil(String marca, int modelo, int motor, int numeroPuertas, tipoCom combustible, tipoAutomovil tipoAutomovil,
			int cantidadAsientos, int velocidadMáxima, tipoColor color) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.numeroPuertas = numeroPuertas;
		this.combustible = combustible;
		this.tipoAutomovil = tipoAutomovil;
		this.cantidadAsientos = cantidadAsientos;
		this.velocidadMáxima = velocidadMáxima;
		this.color = color;
		// NO SE LE PASA LA VELOCIDAD ACTUAL PORQUE SE INICIALIZA SIEMPRE A 0
	}

	// GETTERS AND SETTERS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public tipoCom getCombustible() {
		return combustible;
	}

	public void setCombustible(tipoCom combustible) {
		this.combustible = combustible;
	}

	public tipoAutomovil getTipoAutomovil() {
		return tipoAutomovil;
	}

	public void setTipoAutomovil(tipoAutomovil tipoAutomovil) {
		this.tipoAutomovil = tipoAutomovil;
	}

	public tipoColor getColor() {
		return color;
	}

	public void setColor(tipoColor color) {
		this.color = color;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public int getVelocidadMáxima() {
		return velocidadMáxima;
	}

	public void setVelocidadMáxima(int velocidadMáxima) {
		this.velocidadMáxima = velocidadMáxima;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
	}

	public void acelera(int v) {
		if (velocidadActual + v <= velocidadMáxima)
			this.velocidadActual += v;
		else
			System.out.println("No se puede pasar la velocidad máxima.");
	}

	public void desacelera(int v) {
		if (velocidadActual - v >= 0)
			this.velocidadActual -= v;
		else
			System.out.println("No se puede tener velocidad negativa.");
	}

	public void frena() {
		this.velocidadActual = 0;
	}

	public double calculaTirmpo(int distancia) {
		return distancia * 1.0f / this.velocidadActual;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", numeroPuertas="
				+ numeroPuertas + ", combustible=" + combustible + ", tipoAutomovil=" + tipoAutomovil + ", color="
				+ color + ", cantidadAsientos=" + cantidadAsientos + ", velocidadMáxima=" + velocidadMáxima
				+ ", velocidadActual=" + velocidadActual + "]";
	}

}
