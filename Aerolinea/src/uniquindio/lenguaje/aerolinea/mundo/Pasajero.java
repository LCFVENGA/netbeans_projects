package uniquindio.lenguaje.aerolinea.mundo;

public class Pasajero extends Persona {

	private String numeroTiquete;
	
	public Pasajero(String nombre, String id,int edad, String numeroTiquete) {
		super(nombre, id, edad);
		this.numeroTiquete = numeroTiquete;
	}

	public Pasajero(String nombre, String id,int edad) {
		super(nombre, id, edad);
	}

	public String getNumeroTiquete() {
		return numeroTiquete;
	}
	

}
