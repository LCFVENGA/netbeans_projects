package uniquindio.lenguaje.aerolinea.mundo;

public class Piloto extends Persona {
	
	private String añosExp;
	private String licencia;

	public Piloto(String nombre, String id,int edad) {
		super(nombre, id,edad);
	}

	public Piloto(String nombre, String id,int edad, String añosExp, String licencia) {
		super(nombre, id,edad);
		this.añosExp = añosExp;
		this.licencia = licencia;
	}

	public String getAñosExp() {
		return añosExp;
	}

	public String getLicencia() {
		return licencia;
	}

}
