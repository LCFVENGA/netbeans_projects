package uniquindio.lenguaje.aerolinea.mundo;

public class Persona {
	
	private String nombre;
	private String id;
	private int edad;
	public Persona(String nombre, String id, int edad) {
		this.edad=edad;
		this.nombre = nombre;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getId() {
		return id;
	}
	
	public int getEdad() {
		return edad;
	}
	public boolean equals(Object obj)
	{
		Persona persona;
		if(obj instanceof Persona)
		{
			return true;
		}
		if(obj==null)
		{
			return false;
		}
		if(getClass()!= obj.getClass())
		{
			return false;
		}
		persona =(Persona) obj;
		
		return this.getId()==persona.getId();
	}
	
	public Persona clone() {
		Persona miP=new Persona(nombre, id,edad);
		return miP;
	}

}
