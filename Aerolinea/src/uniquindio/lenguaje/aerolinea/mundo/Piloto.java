package uniquindio.lenguaje.aerolinea.mundo;

public class Piloto extends Persona {
	
	private String a�osExp;
	private String licencia;

	public Piloto(String nombre, String id,int edad) {
		super(nombre, id,edad);
	}

	public Piloto(String nombre, String id,int edad, String a�osExp, String licencia) {
		super(nombre, id,edad);
		this.a�osExp = a�osExp;
		this.licencia = licencia;
	}

	public String getA�osExp() {
		return a�osExp;
	}

	public String getLicencia() {
		return licencia;
	}

}
