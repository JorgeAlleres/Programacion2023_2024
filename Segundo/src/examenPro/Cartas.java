package examenPro;

import java.util.HashMap;

public class Cartas {
	
	private String palo;
    private String numero;

    public Cartas(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }

    public int getValor() {
        HashMap<String, Integer> valores = new HashMap<>();
        valores.put("A", 20);
        valores.put("K", 15);
        valores.put("Q", 15);
        valores.put("J", 15);

        return valores.getOrDefault(numero, Integer.parseInt(numero));
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

}
