package ejemplo3_5;

public class Paquete {

	enum tipo_envio {
		NACIONAL, INTERNACIONAL
	}

	enum tipo_contenido {
		DOCUMENTO, MERCANCIA
	}

	Persona remitente;
	Persona destinatario;
	tipo_envio envio;
	tipo_contenido contenido;
	double peso;

	public Paquete(Persona remitente, Persona destinatario, tipo_envio envio, tipo_contenido contenido, double peso) {
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.envio = envio;
		this.contenido = contenido;
		this.peso = peso;
	}

	public Persona getRemitente() {
		return remitente;
	}

	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}

	public Persona getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}

	public tipo_envio getEnvio() {
		return envio;
	}

	public void setEnvio(tipo_envio envio) {
		this.envio = envio;
	}

	public tipo_contenido getContenido() {
		return contenido;
	}

	public void setContenido(tipo_contenido contenido) {
		this.contenido = contenido;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double calcularCoste() {
		int valor_unitario = 0;

		if (this.envio == envio.NACIONAL) {
			if (this.contenido == contenido.DOCUMENTO) {
				if (peso <= 2) {
					valor_unitario = 2000;
				} else {
					valor_unitario = 3000;
				}
			}
			if (this.contenido == contenido.MERCANCIA) {
				if (peso <= 5) {
					valor_unitario = 5000;
				} else {
					valor_unitario = 7000;
				}
			}
		}
		if (this.envio == envio.INTERNACIONAL) {
			if (this.contenido == contenido.DOCUMENTO) {
				if (peso <= 2) {
					valor_unitario = 10000;
				} else {
					valor_unitario = 15000;
				}
			}
			if (this.contenido == contenido.MERCANCIA) {
				if (peso <= 5) {
					valor_unitario = 12000;
				} else {
					valor_unitario = 20000;
				}
			}
		}
		return peso * valor_unitario;
	}

	@Override
	public String toString() {
		return "Paquete [remitente=" + remitente + ", destinatario=" + destinatario + ", envio=" + envio
				+ ", contenido=" + contenido + ", peso=" + peso + "]";
	}

	class Persona {
		String nombre;
		String apellido;
		long id;
		String direccion;
		int telefono;

		public Persona(String nombre, String apellido, long id, String direccion, int telefono) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.id = id;
			this.direccion = direccion;
			this.telefono = telefono;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", direccion=" + direccion
					+ ", telefono=" + telefono + "]";
		}

	}
}