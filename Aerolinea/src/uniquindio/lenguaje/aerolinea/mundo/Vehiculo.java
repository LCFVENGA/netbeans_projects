package uniquindio.lenguaje.aerolinea.mundo;

import java.util.ArrayList;

public class Vehiculo {
	
	private Piloto miPiloto;
	protected Silla[][] misSillas=new Silla[2][7];
	private String id;
	public Vehiculo(Piloto miPiloto, String id) {
		this.id=id;
		this.miPiloto = miPiloto;
		crearMaPues();
	}
	
	public String getId() {
		return id;
	}
	
	public Silla devolverSilla(int i, int j)
	{
		return null;
	}

	public Piloto getMiPiloto() {
		return miPiloto;
	}
	public void crearMaPues() {
		int cod=1;
		
		for(int i=0; i<misSillas.length;i++)
		{
			
			for (int j = 0; j < misSillas[0].length; j++) {
				
				if(j!=2||j!=3||j!=4)
				{
					if(j==1||j==5)
					{
						misSillas[i][j]=new Silla(0, "Pasillo", ""+cod);
						cod++;
					}
					else
					{
						misSillas[i][j]=new Silla(0, "Ventana", ""+cod);
						cod++;
					}
				}
				else
				{
					misSillas[i][j]=new Silla(-1,null,null);
				}
			}
		}
	}
	
public Silla devolverSilla (int opcion,int i,int j) {
	return null;
	
}

}
