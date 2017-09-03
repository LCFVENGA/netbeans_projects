package uniquindio.lenguaje.aerolinea.mundo;

public class Silla {

	private int tipo;
	private String ubicacion;
	private String codPuesto;
	private boolean isDisponible=true;
	public Silla(int tipo, String ubicacion, String codPuesto) {
		this.tipo = tipo;
		this.ubicacion = ubicacion;
		this.codPuesto = codPuesto;
	}
	public int getTipo() {
		return tipo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public String getCodPuesto() {
		return codPuesto;
	}
	public boolean isDisponible() {
		return isDisponible;
	}
	public void setDisponible(boolean isDisponible) {
		this.isDisponible = isDisponible;
	}
	
	
}
