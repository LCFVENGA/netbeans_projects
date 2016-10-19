import javax.swing.*;

/**
 * programa que imprime el triangulo de pascal segun la escala que desee el 
 * usuario
 * @author Carabali Rivera Juan Pablo
 */
public class Pascal {

    
    /**
     * Metodo para leer un entero.
     * @param pregunta es la pregunta que se le va a hacer a el usuario.
     * @return es el entero que ingrese el usuario como respuesta
     */
    public static int leerEntero ( String pregunta )
    {
        while( true )
        {
            try
            {
               return Integer.parseInt(JOptionPane.showInputDialog(pregunta));
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog(null, "Error, por favor ingrese un "
                + "numero","Ventada de Error",JOptionPane.ERROR_MESSAGE);
            }
        }     
    }
    
    
    
   /**
    * Metodo para el triangulo de pascal.
    * @param n es numero que da el grande del triangulo.
    */ 
   public static void triangulo ( int n )
   {
       int r, numero,i,j;
       
       String p = "";
       
       for( i = 0; i <= n; i++ )
       {
           numero = 1;
           r =  i + 1;
          
           for( j = 0; j <= i; j++ )
           {
               if( j > 0 )
               {
                   numero = numero * ( r - j ) / j; 
               }
               p += numero + " ";
           }
           p += "\n";
       }
        imprimir( p );
   }
    
    
    
    
    /**
     * Metodo para mostrar un mensage un la pantalla. 
     * @param texto es el texto que se desea imprimir.
     */
    public static void imprimir ( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    
    
    
    /**
     * @param args linea de comandos.
     */
    public static void main(String[] args) {
        
        int n;
        
        imprimir("El maximo numero ingresado es de 10 y el minimo es de 0.");
        
        do
        {
            n = leerEntero ( "Numero" );
            
            if( n < 1 )
            {
                imprimir ( "El numero debe de ser mayor de 0." ); 
            }
            
            if( n > 10 )
            {
                imprimir ( "El numero debe de ser menor o igual a 10.");
            }
            
        } while ( n < 1 || n > 10 );
        
        triangulo( n );
      
    }
    
}
