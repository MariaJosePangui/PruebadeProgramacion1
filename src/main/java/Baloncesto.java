public class Baloncesto extends Deporte {
	private String tipoCancha;
	private String tiemposJugados;

	public Baloncesto(String tipoCancha, String tiemposJugados) {
		this.tipoCancha = tipoCancha;
		this.tiemposJugados = tiemposJugados;
	}

	public String getTipoCancha() {

		return this.tipoCancha;
	}

	public void setTipoCancha(String tipoCancha) {

		this.tipoCancha = tipoCancha;
	}

	public String getTiemposJugados() {

		return this.tiemposJugados;
	}

	public void setTiemposJugados(String tiemposJugados) {

		this.tiemposJugados = tiemposJugados;
	}

	public String getTipo() {

		throw new UnsupportedOperationException();
	}

	public String toString() {

		throw new UnsupportedOperationException();
	}
}