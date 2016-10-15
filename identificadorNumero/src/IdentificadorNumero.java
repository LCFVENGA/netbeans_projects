import javax.swing.*;

/**
 * Metodo para identificar en cuales casillas se encuentra el numero a identificar.
 * @author Carabali Rivera Juan Pablo.
 */
public class IdentificadorNumero {

    
    /**
     * Metodo para leer un entero.
     * @param question es la pregunta que se le hace al usuario.
     * @return es el entero que nos entrega el usuario como respuesta.
     */
    public static int readInteger ( String question )
    {
        while( true )
        {
            try
            {
                return Integer.parseInt(JOptionPane.showInputDialog(question));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error, Ingrese un Numero.",
                        "Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    /**
     * Metodo para imprimir el texto que se desea.
     * @param text es el texto que se va a imprimir.
     */
    public static void toPrint ( String text )
    {
        JOptionPane.showMessageDialog(null, text);
    }
    
    
    
    /**
     * Metodo para leer varios enteros.
     * @param question es la pregunta que se le efectuara al usuario.
     * @param quantity es la cantidad de enteros que ingresara el usuario.
     * @return son los enteros que el usuario ingreso como respuesta.
     */
    public static int[] readIntegers ( String question, int quantity )
    {
        int integers[],i;
        
        integers = new int [quantity];
        
        for( i = 0; i < integers.length; i++ )
        {
            integers[i] = readInteger( question + "( " + (i+1) + " de " + quantity
            + " )");
        }
        
        return integers;
        
    }
    
    
    
    /**
     * metodo para imprimir varios enteros.
     * @param integers son los enteros a imprimir.
     */
    public static void toPrintIntegers ( int[] integers )
    {
        String departure;
        int i;
        
        departure = "";
        
        for( i = 0; i < integers.length; i++ )
        {
            departure += integers[i] + "\n";
        }
        
        toPrint( departure );
        
    }
    
    
    
    /**
     * Metodo para identificar la posicion del numero deseado.
     * @param integers son los enteros que fueron ingresados.
     * @param k es el numero que se desea saber en que posicion(es) se encuentra.
     * @return el nuevo arreglo con la posicion o posiciones del numero.
     */
    public static int[] identifyInteger(int[] integers, int k )
    {
        int newArray[],i,j,a;
        
        a = 0;
        
        for( int number: integers )
        {
            if( number == k )
            {
                a++;
            }
        }
        
        j = 0;
        newArray = new int [a];
        
        for( i = 0; i < integers.length; i++)
        {
            if( integers[i] == k )
            {
                newArray[j] = i;
                j++;
            }
        }
        
        return newArray;
            
    }
    
    
    
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        int newArray[], integers[], k, quantity ;
        
        quantity = readInteger ( "Cantida de enteros" );
        
        integers = readIntegers ( "Ingrese un entero", quantity );
        
        k = readInteger ( "Numero a saber posicion(es)." );
        
        newArray = identifyInteger( integers, k );
        
        toPrintIntegers ( integers );
        toPrintIntegers ( newArray );
    }
    
}
