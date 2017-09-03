package uniquindio.lenguaje.aerolinea.mundo;

import java.util.ArrayList;

public class Aerolinea implements IAerolinea
{
	private ArrayList<Vehiculo>misVehiculos=new ArrayList<Vehiculo>();
	private ArrayList<Persona>misPersonas=new ArrayList<Persona>();
	private ArrayList<Reserva>misReservas=new ArrayList<Reserva>();
	private int numerosA=0;
	
	
	public int getNumerosA() {
		return numerosA;
	}

	public Aerolinea() 
	{}

	@Override
	public void asignarNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}
	public Vehiculo devolverVehiculos(int i)
	{
		return misVehiculos.get(i);
	}
	
	
	public void CrearAvion()
	{
		int a =numerosA+1;
		misVehiculos.add(new Avion(null,""+a));
		numerosA++;
	}
	
	public int getNumeroVehiculos()
	{
		int conta=0;
		for (int i = 0; i < misVehiculos.size(); i++) {
			conta++;
		}
		return conta;
	}
	
	public Silla devolverSilla(Avion miA,int i,int j)
	{
		return miA.devolverSilla(i, j);
	}
	
	public Avion getAvion(int id)
	{
//		int i=-1;
//		for (int j = 0; j < misVehiculos.size(); j++) {
//			if(misVehiculos.get(j).getId().equals(id))
//			{
//				i=j;
//			}
//		}
//		if (i<0) 
//		{
//			return null;
//		}
		return (Avion) misVehiculos.get(id);
	}
	
	public Pasajero getMisPersonas(Persona miP) 
	{
		int i=-1;
		for (int j = 0; j < misPersonas.size(); j++) {
			if(misPersonas.get(j).equals(miP))
			{
				i=j;
			}
		}
		return  (Pasajero) misPersonas.get(i);
	}

	@Override
	public void AgregarUsuario(Pasajero mip) throws UsuarioRepetidoException {
		int ubicacion=buscarPasajero(mip);
		System.out.println(""+ubicacion);
		if(ubicacion!=-1)
		{
			throw new UsuarioRepetidoException("El Usario Ya esta registrado en el sistema.");
		}
		else
		{
			misPersonas.add(mip);
		}
		
	}
	
	public int buscarPasajero(Pasajero mip)
	{
		int j=-1;
		
		for (int i = 0; i < misPersonas.size()&&j==-1; i++) {
			System.out.println(misPersonas.get(i).equals(mip));
			if(misPersonas.get(i).equals(mip))
			{
				System.out.println(misPersonas.get(i).equals(mip));
				j=i;
			}
			
		}
		return j;
	}

	@Override
	public void ModificarUsuario(Pasajero miP) throws UsuarioInexistenteException {
		int num=buscarPasajero(miP);
		if(num!=-1)
		{
			
				misPersonas.set(num, miP);
				System.out.println("Se a modificado satisfactoriamente");
			
		}
		else
		{
			throw new UsuarioInexistenteException("Este Usuario no se encuentra en el Sistema.");
		}
	}
	
}