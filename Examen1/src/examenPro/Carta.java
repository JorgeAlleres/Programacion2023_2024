package examenPro;

import java.util.HashMap;

public class Carta {
	
	private String palo;
    private String numero;

    public Carta(String palo, String numero) {
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
        valores.put("A", 11);
        valores.put("K", 10);
        valores.put("Q", 10);
        valores.put("J", 10);

        return valores.getOrDefault(numero, Integer.parseInt(numero));
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }


}
