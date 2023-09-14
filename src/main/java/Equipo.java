import java.util.ArrayList;

public class Equipo {
	private ArrayList jugadores;
	private ArrayList hPartidosJugados;
	private ArrayList<PartidosJugados> partidosJugados = new ArrayList<PartidosJugados>();

	public ArrayList getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(ArrayList jugadores) {
		this.jugadores = jugadores;
	}

	public ArrayList getHPartidosJugados() {
		return this.hPartidosJugados;
	}

	public void setHPartidosJugados(ArrayList hPartidosJugados) {
		this.hPartidosJugados = hPartidosJugados;
	}
}