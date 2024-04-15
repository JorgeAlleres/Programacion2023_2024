package Propuestos;

import java.util.Scanner;

public class Propuesto8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String romano="";
		int decimal;
		
		System.out.println("Dame un numero: ");
		decimal= sc.nextInt();
		System.out.println("Convertir a Romano-> "+ decimal);
		
		while(decimal>0) {
			while(decimal>=1000) {
				romano+="M";
				decimal-=1000;
			}
			while(decimal>=900) {
				romano+="CM";
				decimal-=900;
			}
			while(decimal>=500) {
				romano+="D";
				decimal-=500;
			}
			while(decimal>=400) {
				romano+="CD";
				decimal-=400;
			}
			while(decimal>=100) {
				romano+="C";
				decimal-=100;
			}
			while(decimal>=90) {
				romano+="XC";
				decimal-=90;
			}
			while(decimal>=50) {
				romano+="L";
				decimal-=50;
			}
			while(decimal>=40) {
				romano+="XL";
				decimal-=40;
			}
			while(decimal>=10) {
				romano+="X";
				decimal-=10;
			}
			while(decimal>=9) {
				romano+="IX";
				decimal-=9;
			}
			while(decimal>=5) {
				romano+="V";
				decimal-=5;
			}
			while(decimal>=4) {
				romano+="IV";
				decimal-=4;
			}
			while(decimal>=1) {
				romano+="I";
				decimal-=1;
			}
		}
		System.out.println("El número convertido es: "+ romano);
		
	}
	
}