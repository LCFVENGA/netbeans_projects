package uniquindio.lenguaje.parqueadero.mundo;

import java.util.ArrayList;

/**
 * Esta clase representa un puesto dentro del parqueadero
 * @author 
 *
 */
public class Puesto 
{
	
	//---------------------------------------------------------------------------
	//ATRIBUTOS
	//---------------------------------------------------------------------------
	private int tipo;
	
	private ArrayList <Vehiculo> misVehiculos = new ArrayList <Vehiculo>();
	private boolean ocupado = false;
	
	/**
	 * Constructor de la clase Puesto 
	 * @param tipo El tipo de vehiculo, tipo>=1&& tipo<=3
	 * @param miVehiculo El vehiculo que se ubica dentro del vehiculo
	 */
	
	public void agregarVehiculo(Vehiculo miV){
		misVehiculos.add(miV);
		ocupado = true;
	}
  
	public void eliminarMiVehiculo() {
		ocupado = false;
	}

	public Puesto(int tipo, ArrayList<Vehiculo> misVehiculos) {
		this.tipo = tipo;
		this.misVehiculos =  new ArrayList <Vehiculo>();
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public int getTipo() {
		return tipo;
	}

	public ArrayList<Vehiculo> getMisVehiculos() {
		return misVehiculos;
	}
	
	public Propietario getPropietario(){
		return misVehiculos.get(misVehiculos.size()-1).getDuenio();
	}
	
	public Vehiculo getVehiculo(){
		return misVehiculos.get(misVehiculos.size()-1);
		
	}
	public int isVehiculooMasRepe(String placa)
	{
		int conta=0;
		for(int i=0;i<misVehiculos.size();i++)
		{
			if(misVehiculos.get(i).getPlaca().equals(placa))
			{
				conta++;
			}
		}
		
		return conta;
	}
	
    
}
