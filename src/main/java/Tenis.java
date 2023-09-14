public class Tenis extends Deporte {
	private String tipoSuperficieCancha;
	private String tipoPartido;

	public Tenis(String tipoSuperficieCancha, String tipoPartido) {
		this.tipoSuperficieCancha = tipoSuperficieCancha;
		this.tipoPartido = tipoPartido;
	}

	public String getTipoSuperficieCancha() {

		return this.tipoSuperficieCancha;
	}

	public void setTipoSuperficieCancha(String tipoSuperficieCancha) {

		this.tipoSuperficieCancha = tipoSuperficieCancha;
	}

	public String getTipoPartido() {

		return this.tipoPartido;
	}

	public void setTipoPartido(String tipoPartido) {

		this.tipoPartido = tipoPartido;
	}

	public String getTipo() {

		throw new UnsupportedOperationException();
	}

	public String toString() {

		throw new UnsupportedOperationException();
	}
}