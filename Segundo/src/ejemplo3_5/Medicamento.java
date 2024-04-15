package ejemplo3_5;

public class Medicamento {
	String nombre; // Atributo que define el nombre de un medicamento
	String fabricante; /* Atributo que define el nombre del fabricante de un medicamento */
	String via; /* Atributo que define la vía de administración de un medicamento */
	Posologia posologia; /* Atributo que define la posología de un medicamento */

	Medicamento(String nombre, String fabricante, String via) {
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.via = via;
	}

	public void setPosologia(Posologia posologia) {
		this.posologia = posologia;
	}

	public Posologia getPosologia() {
		return posologia;
	}

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", fabricante=" + fabricante + ", via=" + via + ", posologia="
				+ posologia + "]";
	}

	/*
	 * La clase medicamento debe tener una clase interna, que represente la
	 * posología del medicamento con la siguiente información: Usuarios del
	 * medicamento. Dosis del medicamento en miligramos Periodo de tiempo para tomar
	 * el medicamento. Recomendaciones.
	 */

	class Posologia {
		String usuarios;
		int dosis;
		String periodo;
		String recomendaciones;

		public Posologia(String usuarios, int dosis, String periodo, String recomendaciones) {
			this.usuarios = usuarios;
			this.dosis = dosis;
			this.periodo = periodo;
			this.recomendaciones = recomendaciones;
		}

		Posologia() {

		}

		@Override
		public String toString() {
			return "Posologia [usuarios=" + usuarios + ", dosis=" + dosis + ", periodo=" + periodo
					+ ", recomendaciones=" + recomendaciones + "]";
		}

		public String getUsuarios() {
			return usuarios;
		}

		public void setUsuarios(String usuarios) {
			this.usuarios = usuarios;
		}

		public int getDosis() {
			return dosis;
		}

		public void setDosis(int dosis) {
			this.dosis = dosis;
		}

		public String getPeriodo() {
			return periodo;
		}

		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}

		public String getRecomendaciones() {
			return recomendaciones;
		}

		public void setRecomendaciones(String recomendaciones) {
			this.recomendaciones = recomendaciones;
		}

		
	}
}
