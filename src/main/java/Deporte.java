import java.util.ArrayList;

public abstract class Deporte {
	private ArrayList entrenadorPorDeporte;
	private ArrayList<Equipo> equipo = new ArrayList<Equipo>();

	public ArrayList getEntrenadorPorDeporte() {
		return this.entrenadorPorDeporte;
	}

	public void setEntrenadorPorDeporte(ArrayList entrenador) {
		this.entrenadorPorDeporte = entrenador;
	}

	public void getTipo() {
		throw new UnsupportedOperationException();
	}
}