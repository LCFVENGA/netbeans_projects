package uniquindio.fundamentos.comunidad.mundo;

public class Propiedad {
	private Propietario miPropietario;
	private String catastral, direccion;
	private double area;
	private Estrato miEstrato;
	private int tipo;
	public Propiedad(Propietario miPropietario,int tipo, String catastral, String direccion, double area, String nivel, int rango) {
		this.miPropietario = miPropietario;
		this.catastral = catastral;
		this.direccion = direccion;
		this.area = area;
		this.tipo = tipo;
		miEstrato = new Estrato();
		miEstrato.setNivel(nivel);
		miEstrato.setRango(rango);
	}
	public Propietario getMiPropietario() {
		return miPropietario;
	}
	public int getTipo()
	{
		return tipo;
	}
	public String getCatastral() {
		return catastral;
	}
	public String getDireccion() {
		return direccion;
	}
	public double getArea() {
		return area;
	}
	public Estrato getMiEstrato() {
		return miEstrato;
	}
	

}
