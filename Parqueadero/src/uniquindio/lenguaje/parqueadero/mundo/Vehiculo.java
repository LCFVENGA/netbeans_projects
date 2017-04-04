package uniquindio.lenguaje.parqueadero.mundo;
/**
 * Esta clase representa un vehiculo
 * @author 
 *
 */

public class Vehiculo 
{
//---------------------------------------------------------------------------
//ATRIBUTOS
//---------------------------------------------------------------------------
private String modelo="", placa="";
private Propietario duenio;	
private int tipo;
/**
 * Constructor de la clase vehiculo
 * @param modelo El modelo del vehiculo, modelo > 1900
 * @param placa La placa del vehiculo, placa!=null
 * @param duenio El duenio del vehiculo, duenio!=null
 */
 public Vehiculo(String modelo, String placa, Propietario duenio, int tipo)
  {
	  this.modelo=modelo;
	  this.placa=placa;
	  this.duenio=duenio;
	  this.tipo=tipo;
  }

/**
 * Metodo accesor
 * @return El modelo
 */
public String getModelo() {
	return modelo;
}

/**
 * Metodo modificador 
 * @param modelo El modelo del vehiculo, modelo > 1900
 */
public void setModelo(String modelo) {
	this.modelo = modelo;
}
/**
 * Metodo accesor
 * @return La placa del vehiculo
 */
public String getPlaca() {
	return placa;
}
/**
 * Metodo modificador
 * @param placa La placa del vehiculo, placa!=null
 */
public void setPlaca(String placa) {
	this.placa = placa;
}

/**
 * Metodo accesor
 * @return El dueño del vehiculo
 */

public Propietario getDuenio() {
	return duenio;
}
/**
 * @param duenio El duenio del vehiculo, duenio!=null
 */
public void setDuenio(Propietario duenio) {
	this.duenio = duenio;
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}
  
  
}
