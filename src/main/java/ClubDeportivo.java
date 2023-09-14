import java.util.ArrayList;

public class ClubDeportivo {
	private ArrayList equipoDeporte;
	private GestorClubDeportivo gestorClubDeportivo;
	private ArrayList<Deportista> deportista = new ArrayList<Deportista>();
	private ArrayList<Entrenador> entrenador = new ArrayList<Entrenador>();

	public ArrayList getEquipoDeporte() {

		return this.equipoDeporte;
	}

	public void setEquipoDeporte(ArrayList equipoDeporte) {

		this.equipoDeporte = equipoDeporte;
	}
}