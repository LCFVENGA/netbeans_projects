import javax.swing.*;

/**
 * Metodo para verificar si dos conjuntos con n elementos son iguales teniendo 
 * en cuenta que tambien los numeros deben de estar en la misma posicion.
 * @author Carabali Rivera Juan Pablo.
 */
public class MismaPosicion {

    
    
    /**
     * Metodo para leer un entero.
     * @param question es la pregunta que se le efectua la usuario.
     * @return es el entero que ingresa el usuario como respuesta.
     */
    public static int readInteger ( String question )
    {
        while ( true )
        {
            try
            {
                return Integer.parseInt(JOptionPane.showInputDialog(question));
            }
            catch ( Exception e )
            {
                JOptionPane.showMessageDialog ( null, "Error, Ingrese un numero."
                        ,"Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    /**
     * Metodo para imprimir un texto.
     * @param text es el texto que se desea imprimir.
     */
    public static void toPrint ( String text )
    {
        JOptionPane.showMessageDialog( null, text );
    }
    
    
    
    /**
     * Metodo para leer varios enteros.
     * @param question es la pregunta que se le hace al usuario.
     * @param quantity es la cantidad de enteros que se le van a preguntar.
     * @return son los enteros ingresados por el usuario como respuesta.
     */
    public static int[] readIntegers ( String question, int quantity )
    {
        int integers[],i;
        
        integers = new int [ quantity ];
        
        for( i = 0; i < integers.length; i++ )
        {
            integers[i] = readInteger( question + " ( " + (i+1) + " de " + quantity
            + " )");
        }
        
        return integers;
        
    }
    
    
    
    /**
     * Metodo para imprimir varios enteros.
     * @param integers son los enteros que se van a imprimir.
     */
    public static void toPrintIntegers ( int[] integers )
    {
        String departure;
        int i;
        
        departure = "";
        
        for( i = 0; i < integers.length; i++)
        {
            departure += integers[i] + "\n"; 
        }
        
        toPrint( departure );
    }
    
    
    
    /**
     * Metodo para verificar si son iguales los dos conjuntos de numeros.
     * @param integersA es el primer conjunto de numeros.
     * @param integersB es el segundo conjunto de numeros.
     * @return nos retorna la verificacion si son iguales o no.
     */
    public static String verifyEquality( int[] integersA, int[] integersB)
    {
        String verify;
        int i;
        
        verify = "Son iguales.";
        
        for( i =0; i < integersA.length; i++ )
        {
            if( integersA[i] != integersB[i])
            {
                return verify = "No son iguales.";
            }
        }
        return verify;
    }
    
    
    
    /**
     * @param args linea de comandos.
     */
    public static void main(String[] args) {
        String verify;
        int quantity, integersA[], integersB[];
        
        quantity = readInteger ( "Ingrese el total de numeros.");
        
        integersA = readIntegers ( "Ingrese un numero A ", quantity );
        integersB = readIntegers ( "Ingrese un numero B ", quantity );
        
        verify = verifyEquality ( integersA, integersB );
        
        toPrintIntegers ( integersA );
        toPrintIntegers ( integersB );
        toPrint ( verify );
        
    }
    
}

