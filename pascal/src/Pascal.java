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
    public static int leerEntero (String pregunta)
    {
        while( true )
        {
            try
            {
               return Integer.parseInt(JOptionPane.showInputDialog(pregunta));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error, por favor ingrese un "
                + "numero","Ventada de Error",JOptionPane.ERROR_MESSAGE);
            }
        }     
    }
    
    
    
    
    public static String pascal(int n)
    {
        int i,j,cont;
        String cadena;
        cadena ="";
        cont = 0;
        
        for(i=1;i<=n;i++)
        {
           cadena+= 1;
           for(j=1;j<=i;j++)
           {
               if(j>2)
               {
                   cadena+= j - 1;
               }
           }
          
           if(i>1 && i<=n)
           {
               cadena+=1;
           }
           
           cadena+="\n";
        }
        return cadena;
    }
    
    
    
    /**
     * Metodo para mostrar un mensage un la pantalla 
     * @param texto es el texto que se desea imprimir.
     */
    public static void imprimir (String texto)
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = leerEntero("numero");
        String h;
        
        h = pascal(n);
        imprimir(h);
    }
    
}
