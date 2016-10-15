
package verificarsemejanza;

import javax.swing.*;

/**
 * Metodo para verificar si dos con conjuntos de numeros con un tamaño n son 
 * semejantes
 * @author Carabali Rivera Juan Pablo.
 */
public class VerificarSemejanza {

    
    
    /**
     * Metodo para leer un entero.
     * @param question es la pregunta que se le hace al usuario.
     * @return es el entero que ingresa el usuario como respuesta.
     */
    public static int readInteger ( String question )
    {
        while ( true )
        {
            try
            {
                return Integer.parseInt(JOptionPane.showInputDialog( question ));
            }
            catch ( Exception e )
            {
                JOptionPane.showMessageDialog( null, "Error, Ingrese un Numero."
                        , "Ventana de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    
    
    
    /**
     * Metodo para imprimir un texto,
     * @param text es el texto que se desea imprimir.
     */
    public static void toPrint ( String text )
    {
        JOptionPane.showMessageDialog( null, text );
    }
    
    
    
    /**
     * Metodo para leer varios numeros.
     * @param question es la pregunta que se le hace al usuario.
     * @param quantity es la cantidad de numeros que contiene el conjunto.
     * @return son los numeros que ingresa el usuario como respuesta.
     */
    public static int[] readIntegers ( String question, int quantity )
    {
        int i, integers[];
        
        integers = new int [ quantity ];
        
        for( i = 0; i < integers.length; i++ )
        {
            integers[i] = readInteger( question + " ( " + ( i + 1 ) + " de " + 
                    quantity + " )");
        }
        
        return integers;
        
    }
    
    
    
    
    /**
     * Metodo para imprimir un conjunto de numeros.
     * @param integers es el conjunto de numeros.
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
     * Metodo para verificar dos conjuntos son semejantes.
     * @param integersA es el primer conjunto de numeros.
     * @param integersB es el segundo conjunto de numeros.
     * @return es la verificacion si son semejantes o no.
     */
    public static String verifySimilarity ( int[] integersA, int[] integersB )
    {
        String verify;
        int i,j,a=0;
       
        
        for( i = 0; i < integersA.length; i++ )
        {
            for( j = 0; j < integersB.length; j++ )
            {
                if( integersA[i] == integersB[j] )
                {
                    a++;
                }
            }
        }
        if( a == integersA.length )
        {
            verify = "Si son semejantes";
        }
        else
        {
            verify = "No son semejantes"; 
        }
        
        return verify;
        
    }
    
    
    
    /**
     * @param args linea de comandos.
     */
    public static void main(String[] args) {
       String verify;
       int integersA[], integersB[], quantity;
       
       quantity = readInteger( "Ingrese el total de numeros." );
       
       integersA = readIntegers ("Ingrese un numero", quantity );
       integersB = readIntegers ("Ingrese un numero", quantity );
       
       verify = verifySimilarity ( integersA, integersB );
       
       toPrintIntegers ( integersA );
       toPrintIntegers ( integersB );
       
       toPrint ( verify );
       
    }
    
}
