package organizadornumeros;

import javax.swing.*;

/**
 * Metodo para organizar un conjunto de tamaño n de manera descendiente
 * @author Carabali Rivera Juan Pablo.
 */
public class OrganizadorNumeros {

    
    /**
     * Metodo para leer un entero.
     * @param question es la pregunta que se le hace al usuario.
     * @return es el entero que el usuario ingresa como respuesta.
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
                JOptionPane.showMessageDialog( null, "Error, Ingrese un numero."
                ,"Ventana de Error", JOptionPane.ERROR_MESSAGE);
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
     * Metodo para leer un conjunto de enteros.
     * @param question es la pregunta que se le hace al usuario.
     * @param quantity es el tamaño del conjunto de numeros.
     * @return nos retorna los numeros que dio el usuario como respueta.
     */
    public static int[] readIntegers ( String question, int quantity )
    {
        int i, integers[];
        
        integers = new int [ quantity ];
        
        for( i = 0; i < integers.length; i++ )
        {
            integers[i] = readInteger ( question + " ( " + ( i + 1 ) + " de " + 
                    quantity + " )"); 
        }
        
        return integers;
        
    }
    
    
    
    
    /**
     * Metodo para imprimir un conjunto de enteros.
     * @param integers es el conjunto de enteros.
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
     * Metodo para hacer y organizar un arreglo de manera descendiente.
     * @param integers es el conjunto de enteros.
     */
    public static void burbuja ( int integers[] )
// fue sacado de:http://www.lawebdelprogramador.com/codigo/Java/2666-Metodo-de-ordenacion-de-Burbuja.html            

    {
        String departure = "";

        for( int i = 0; i < integers.length - 1; i++ )

        {

            for( int j = 0; j < integers.length - 1; j++ )

            {

                if ( integers[j] < integers[j + 1] )

                {

                    int tmp = integers[j+1];

                    integers [j+1] = integers[j];
                    integers[j] = tmp;

                }

            }

        }

        for( int i = 0;i < integers.length; i++ )

        {

            departure += integers[i] + "\n" ;

        }
        toPrint( departure );

    }
    
    
    
    /**
     * @param args linea de comandos.
     */
    public static void main(String[] args) {
        int integers[], quantity;
        
        quantity = readInteger ( "Ingrese el tamaño del conjunto.");
        
        integers = readIntegers ( "Ingrese un numero", quantity );
        
        toPrintIntegers ( integers );
        
        burbuja( integers );
        
    }
    
}
