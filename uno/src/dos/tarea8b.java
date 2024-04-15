package dos;

public class tarea8b {

	public static char getLetras() {
		return (char) ('a' + Math.random() * 26);
	}
	
	public static void main(String[] args) {
		int contador = 0;
		
		for(int j=1; j<1000; j++) {
			getLetras();
		}

	}
}
