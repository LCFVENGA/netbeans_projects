package uniquindio.lenguaje.aerolinea.mundo;

import java.util.ArrayList;

public class Aerolinea implements IAerolinea
{
	private ArrayList<Vehiculo>misVehiculos=new ArrayList<Vehiculo>();
	private ArrayList<Persona>misPersonas=new ArrayList<Persona>();
	private ArrayList<Reserva>misReservas=new ArrayList<Reserva>();
	private int numerosA=0;
	
	
	
	public ArrayList<Reserva> getMisReservas() {
		return misReservas;
	}

	public void setMisReservas(ArrayList<Reserva> misReservas) {
		this.misReservas = misReservas;
	}

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
		misReservas.add(null);
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
	
	public Silla devolverSilla(int miA,int i,int j)
	{
		return misVehiculos.get(miA).devolverSilla(i, j);
	}
	
	public boolean verificarDisponibilidadPuesto(int i,int j, int vehi)
	{
		return devolverSilla(vehi, i, j).isDisponible();
	}
	
	public Avion getAvion(int id)
	{
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
	
	public void reservarSillas(Pasajero miP,  int i, int j, int numeroVehiculo)  throws UsuarioInexistenteException
	{
		Pasajero mipp= getMisPersonas(miP);
		if(buscarPasajero(miP)!=-1)
		{
			if(verificarDisponibilidadPuesto(i, j, numeroVehiculo))
			{
				Pasajero miPp=new Pasajero(mipp.getNombre(),mipp.getId(),mipp.getEdad(),devolverSilla(numeroVehiculo, i, j).getCodPuesto());
				misReservas.get(numeroVehiculo).agregarPasajero(mipp);
				misVehiculos.get(numeroVehiculo).devolverSilla(i, j).setDisponible(false);
				Silla laSilla=devolverSilla(numeroVehiculo, i, j);
				misReservas.get(numeroVehiculo).agergarSilla(laSilla);
			}
		}
		else
		{
			throw new UsuarioInexistenteException("El Usuario no se a encontrado en el sistema.");
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