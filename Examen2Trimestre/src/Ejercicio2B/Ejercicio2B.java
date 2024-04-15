package Ejercicio2B;

import java.util.Arrays;
import java.util.Scanner;

/*Un grupo de inteligencia militar desea codificar los mensajes
secretos de tal forma que no puedan ser interpretados con una
lectura directa, para lo cual han establecido las siguientes reglas:
a) Todo mensaje debe estar sus letras en mayúsculas.
b) Reemplazar cada letra por la que PRECEDE dos posiciones antes
según abecedario, excepto A que se deberá reemplazar con la letra Y
y B por Z.
c) Reemplazar cada dígito encontrado por el número dos posiciones
anterior excepto el 0 que deberá ser reemplazado por el 8, y el 1
por el 9.
Pida una cadena al usuario (conteniendo letras mayusculas y minusculas y
digitos) y muestrela codificada con las anteriores reglas.*/
public class Ejercicio2B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String codigo, codigoEncriptado = "";
		String reemplazo;
		
		System.out.println("Introduce código a encriptar (Debe contener mayusculas, minusculas y numeros)");
		codigo=sc.nextLine();
		codigo=codigo.toUpperCase();
		
		for (int j = 0; j < codigo.length(); j++) {
			if(codigo.charAt(j)=='A') {
				codigoEncriptado+=(char)(codigo.charAt(j)+24);
			} else if(codigo.charAt(j)=='B') {
				codigoEncriptado+=(char)(codigo.charAt(j)+24);
			} else if(codigo.charAt(j)=='0') {
				codigoEncriptado+=(char)(codigo.charAt(j)+8);
			} else if(codigo.charAt(j)=='1') {
				codigoEncriptado+=(char)(codigo.charAt(j)+8);
			} else {
				codigoEncriptado+=(char)(codigo.charAt(j)-2);
			}
		}	
		System.out.println(codigoEncriptado);
	}
}
