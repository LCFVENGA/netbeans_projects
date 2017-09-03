package uniquindio.lenguaje.aerolinea.mundo;

import java.util.ArrayList;

public class Avion extends Vehiculo
{
	private Silla[][] misSillasA=new Silla[11][7];
	private String idAvion="Avion ";
	public Avion(Piloto miPiloto, String id) {
		super(miPiloto, id);
		idAvion+=id;
		generarSillas();
	}
	
	public void generarSillas()
	{

		int cod=9;
		
		for(int i=0;i<11;i++)
		{
			
				for (int j = 0; j < 7; j++) 
				{
					if(i>=4)
					{
						if(j!=3)
						{
							if(j==0||j==6)
							{
								misSillasA[i][j]=new Silla(1,"Ventana",""+cod);
								cod++;
							}
							else if(j==1||j==5)
							{
								misSillasA[i][j]=new Silla(1,"Medio",""+cod);
								cod++;
							}
							else
							{
								misSillasA[i][j]=new Silla(1,"Pasillo",""+cod);
								cod++;
							}
							
						}
						else
						{
							misSillasA[i][j]=new Silla(-11,null,null);
						}
					}
					else if(i<2)
					{
						misSillasA[i][j]=misSillas[i][j];
				}
			}
		}
	}
	
	public Silla devolverSilla(int i, int j) {
		
		return misSillasA[i][j];
	}

	public Silla[][] getMisSillasA() {
		return misSillasA;
	}

	public String getIdAvion() {
		return idAvion;
	}
	
	
}