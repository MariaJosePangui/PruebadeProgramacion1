public class PartidosJugados {
	private String resultado;
	private String fecha;
	private String lugar;
	private Equipo equipo;

	public PartidosJugados(String resultado, String fecha, String lugar) {
		this.resultado = resultado;
		this.fecha = fecha;
		this.lugar = lugar;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
}