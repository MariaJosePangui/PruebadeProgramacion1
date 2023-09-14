public class Entrenador {
	private int experiencia;
	private String especialidadDeportiva;
	private Deporte deporte;

	public Entrenador(int experiencia, String especialidadDeportiva, Deporte deporte) {
		this.experiencia = experiencia;
		this.especialidadDeportiva = especialidadDeportiva;
		this.deporte = deporte;
	}

	public int getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getEspecialidadDeportiva() {
		return this.especialidadDeportiva;
	}

	public void setEspecialidadDeportiva(String especialidadDeportiva) {
		this.especialidadDeportiva = especialidadDeportiva;
	}
}