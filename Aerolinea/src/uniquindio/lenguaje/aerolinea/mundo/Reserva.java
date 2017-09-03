package uniquindio.lenguaje.aerolinea.mundo;

import java.util.ArrayList;

public class Reserva {
	
	private ArrayList <Pasajero> misPasajeros = new ArrayList();
	private ArrayList <Silla> misSillas = new ArrayList();
	public Reserva(ArrayList<Pasajero> misPasajeros, ArrayList<Silla> misSillas) 
	{
		this.misPasajeros = misPasajeros;
		this.misSillas = misSillas;
	}
	public ArrayList<Pasajero> getMisPasajeros() {
		return misPasajeros;
	}
	public ArrayList<Silla> getMisSillas() {
		return misSillas;
	}
	
	public void agregarPasajero(Pasajero mip)
	{
		misPasajeros.add(mip);
	}
	
	public void agergarSilla(Silla laSilla)
	{
		misSillas.add(laSilla);
	}
	
	

}
