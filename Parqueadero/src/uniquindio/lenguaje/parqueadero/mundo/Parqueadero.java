package uniquindio.lenguaje.parqueadero.mundo;

import java.awt.Color;

import javax.swing.JOptionPane;

import uniquindio.lenguaje.parqueadero.interfaz.GenerarMatrizBotones;
import uniquindio.lenguaje.parqueadero.interfaz.VentanaPrincipal;
/**
 * Clase principal del mundo
 * @author 
 *
 */
public class Parqueadero 
{
	
   //---------------------------------------------------------------------------
   //ATRIBUTOS
   //---------------------------------------------------------------------------
   private Puesto misPuestos[][];
   
   
   /**
    * Constructor de la clase Parqueadero
    * @param tamanio El tamanio del parqueadero, tamanio>5
    */
   public Parqueadero(int tamanio)
   {
	   misPuestos=new Puesto[tamanio][tamanio];
	   iniciarMatriz();
   }
   
   /**
    * Método sin parametros para inicializar la matriz
    */
   public void iniciarMatriz()
   {   int numDividir=0;
	   numDividir=(int)misPuestos.length/2;
	   /**
	    * Los puestos pueden ser 0,1, 2
	    */
	   int anexo=0, anexo2=misPuestos.length-1;
	   
	   for(int i=0; i<misPuestos.length; i++)
	   {
		   for(int j=0; j<misPuestos.length; j++)
		   {
			     
			   if(numDividir==j)
			   {
				   misPuestos[i][j]=new Puesto(1, null);
			   }
			   else
			   {
				   misPuestos[i][j]=new Puesto(0, null);
			   }
			   
			   if((i==1)&&(j==(misPuestos.length-1)))
				{
				   misPuestos[i][j]=new Puesto(2, null);
				}
		   }
	   }
	   
	   for(int m=misPuestos.length-1; m>numDividir; m--)
	   {
		   for(int s=anexo; s<numDividir; s++)
		   {
			   misPuestos[m][s]=new Puesto(1, null);
		   }
		   
		   anexo=anexo+1;
	   }
	   
	   for(int x=misPuestos.length-1; x>numDividir; x--)
	   {
		   for(int z=anexo2; z>numDividir; z--)
		   {
			   misPuestos[x][z]=new Puesto(1, null);
		   }
		   
		   anexo2=anexo2-1;
	   }	   
   }
   
   /**
    * Verifica si hay vehiculo en el puesto i, j
    * @param i La posicion i
    * @param j la posicion j
    * @return un boolean, true si el puesto esta disponible
    */
   public boolean verificarDisponibilidadPuesto(int i, int j)
   {
	   boolean centinela=false;
	   if(misPuestos[i][j].isOcupado()== false)
	   {
		   centinela=true;
	   }
	   return centinela;
	   
   }
   /**
    * Método para ubicar un vehiculo dentro del puesto
    * @param miVehiculo El vehiculo,  miVehiculo!=null
    */
   public void agregarVehiculo(Vehiculo miVehiculo)
   {  //se asume que llega un carro
	  int tipo=miVehiculo.getTipo();
	  boolean guardar=false;
	
	
	  for(int i = 0; i < misPuestos.length&&guardar==false; i++) 
	  {
		for(int j = 0; j < misPuestos.length&&guardar==false; j++) 
		{
			if(guardar==false)
			{
				
				
				    if((misPuestos[i][j].getTipo()==tipo) && (misPuestos[i][j].isOcupado()==false))
					{
				    	
						misPuestos[i][j].agregarVehiculo(miVehiculo);
			     		guardar=true;	
			     		
					}
				
				
			}
		}
		
	  }
   }
   /**
    * Método para eliminar un vehiculo del parqueadero
    * @param guardaI La posicion i dentro del arreglo bidimensional en donde está el vehiculo, i>=0
    * @param guardaJ La posicion j dentro del arreglo bidimensional en donde está el vehiculo, j>=0
    */
   public void eliminarVehiculo(int guardaI, int guardaJ)
   {       	   
       misPuestos[guardaI][guardaJ].eliminarMiVehiculo();
   }
  
/**
 * Devuelve el arreglo de puestos
 * @return El arreglo de Pestos del parqueadero
 */
public Puesto[][] getMisPuestos() {
	return misPuestos;
}

/**
 * Permite fijar el arreglo de puestos
 * @param misPuestos
 */
public void setMisPuestos(Puesto[][] misPuestos) {
	this.misPuestos = misPuestos;
}

/**
 * Devuelve le propietario del vehiculo ubicado en la posicion i, j
 * @param i La fila del puesto solicitado
 * @param j La columna del puesto solicitado
 * @return El propietario del vehiculo en el puesto solicitado
 */
 public Propietario getPropietario (int i, int j )
 {
	 return misPuestos[i][j].getPropietario();
	 
 }
 public int[][] isRepetido(String placa)
 {
	 int a[] = new int 
			 
 }
 /**
  * Devuelve el vehiculo que está en la posicion i, j
  * @param i La fila del puesto solicitado
  * @param j La columna del puesto solicitado
  * @return el vehiculo
  */
 public Vehiculo getMiVehiculo (int i, int j )
 {
	 return misPuestos[i][j].getVehiculo();
	 
 }
   
 public Puesto getMiPuesto(int i, int j)
 {
	 return misPuestos[i][j];
 }
}
