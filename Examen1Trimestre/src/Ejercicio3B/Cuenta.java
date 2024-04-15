package Ejercicio3B;

public class Cuenta {

	private double contador;
	private double saldo = 0;
	private String titular;

	// Contructor por defecto sin parámetros
	Cuenta() {

	}

	Cuenta(double contador, double saldo, String titular) {
		this.contador = contador;
		this.saldo = saldo;
		this.titular = titular;
	}

	public double getContador() {
		return contador;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setContador(double contador) {
		this.contador = contador;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void Deposito(double cantidad) {
		this.saldo += cantidad;
	}

	public void Retiro(double cantidad) {
		this.saldo -= cantidad;
	}

	public void Saldo() {
		System.out.println("El saldo es " + saldo);
	}
	
	@Override
	public String toString() {
		return "Cuenta [contador=" + contador + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

}
