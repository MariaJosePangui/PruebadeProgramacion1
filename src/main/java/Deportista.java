public class Deportista {
	private String nombre;
	private String apellido;
	private String direccionCorreo;
	private String numeroContacto;
	private String deportePractica;
	private String rol;

	public Deportista(String nombre, String apellido, String direccionCorreo, String numeroContacto, String deportePractica, String rol) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccionCorreo = direccionCorreo;
		this.numeroContacto = numeroContacto;
		this.deportePractica = deportePractica;
		this.rol = rol;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccionCorreo() {
		return this.direccionCorreo;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public String getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(String numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getDeportePractica() {
		return this.deportePractica;
	}

	public void setDeportePractica(String deportePractica) {
		this.deportePractica = deportePractica;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}