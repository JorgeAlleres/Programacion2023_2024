package ejemplo3_5;

import ejemplo3_5.Paquete.tipo_contenido;
import ejemplo3_5.Paquete.tipo_envio;

public class testPaquete {

	public static void main(String[] args) {
		Paquete.Persona rte = null;
		Paquete.Persona des = null;
		Paquete metes = new Paquete(rte, des, tipo_envio.INTERNACIONAL, tipo_contenido.MERCANCIA, 2.345);

		System.out.println(metes);
		System.out.println(metes.calcularCoste());

		Paquete.Persona manolo = metes.new Persona("manolo", "perez", 1, "alli", 11);
		
		System.out.println(manolo);
		metes.setDestinatario(manolo);
		System.out.println(metes);
		
		Paquete sales = null;
		Paquete.Persona carlos = sales.new Persona("a", "b", 2, "aca", 033);
		Paquete.Persona laura = sales.new Persona("cc", "cc", 3, "acuya", 044);
		
		System.out.println(carlos);
		System.out.println(laura);
		
		sales= new Paquete(laura, carlos, tipo_envio.NACIONAL, tipo_contenido.DOCUMENTO, 2.5);
		
		System.out.println(sales);
		System.out.println(sales.calcularCoste());
	}
}
