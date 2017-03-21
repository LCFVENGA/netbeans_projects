package uniquindio.fundamentos.comunidad.mundo;

import java.util.ArrayList;

public class Comunidad {
	
	private ArrayList <Propiedad> misPropiedades;
	private ArrayList <Propietario> misPropietarios;
	
	
	public void AgregarPropietario(int id, String nombre)
	{
		Propietario miPr;
		miPr=Propietario(id,nombre);
		if(verificarPropietario(id)!=null)
		{
			misPropietarios.add();
		}
	}
	
	public Propietario verificarPropietario(int id)
	{
		for(int i=0;i<misPropietarios.size();i++)
		{
			if(misPropietarios.get(i).getId()==id)
			{
				return misPropietarios.get(i);
			}
		}
		return null;
	}
	
	
	
	

}
