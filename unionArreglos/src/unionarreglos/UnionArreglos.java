package unionarreglos;

import javax.swing.*;

/**
 * Metodo para unir dos conjuntos de numeros e imprimirlos.
 * @author Carabali Rivera Juan Pablo.
 */
public class UnionArreglos {

    
    /**
     * Metodo para leer un entero.
     * @param question es la pregunta que se le hace al usuario.
     * @return es el entero como respuesta que ingresa el usuario.
     */
    public static int readInteger(String question)
    {
        while( true )
        {
            try
            {
                return Integer.parseInt(JOptionPane.showInputDialog(question));
            }
            catch( Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error, Ingrese un Numero.",
                        "Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    /**
     * Metodo para imprimir un texto .
     * @param text es el texto que se desea imprimir.
     */
    public static void toPrint ( String text )
    {
        JOptionPane.showMessageDialog(null, text);
    }
    
    
    
    /**
     * Metodo para leer varios enteros.
     * @param question es la pregunta que se le hace al usuario.
     * @param quantity es la cantidad de enteros a leer.
     * @return nos retorna los enteros que el usuario ingreso como respuesta.
     */
    public static int[] readIntegers ( String question, int quantity )
    {
        int integers[], i;
        
        integers = new int [quantity];
        
        for(i = 0; i < quantity; i++)
        {
            integers[i] = readInteger(question + "( " + (i+1)  +" de " + quantity
            + " )");
        }
        return integers;
    }
    
    
    
    /**
     * Metodo para imprimir varios enteros.
     * @param integers son los enteros a imprimir.
     */
    public static void toPrintIntegers ( int[] integers )
    {
        String departures;
        int i;
        
        departures = "";
        
        for( i = 0; i < integers.length; i++ )
        {
            departures += integers[i] + "\n";
        }
        
        toPrint( departures );
        
    }
    
    
    
    /**
     * Metodo para crear un nuevo arreglo apartir de otros dos arreglos.
     * @param integersA es el primer arreglo que nos da el usuario.
     * @param integersB es el segundo arreglo que nos da el usuario.
     * @return el nuevo arreglo con sus valores correspondientes.
     */
    public static int[] newArray ( int[] integersA, int[] integersB )
    {
        int newArray[],i,j;
        
        newArray = new int[integersA.length + integersB.length];
        j=0;
        for( i = 0; i < newArray.length; i++ )
        {
            if(i < integersA.length)
            {
                newArray[i] = integersA[i];
            }
            else
            {
                newArray[i] = integersB[j];
                j++;
            }
        }
        return newArray;
    }
    
    
    
    /**
     * @param args linea de comandos es decir donde corre el programa,
     */
    public static void main(String[] args) {
        int quantityA, quantityB, integersA[], integersB[], newArray[];
        
        quantityA = readInteger("La cantidad que tendra el conjunto de enteros A.");
        quantityB = readInteger("La cantidad que tendra el cunjunto de enteros B.");
        
        integersA = readIntegers("Ingrese un entero ", quantityA );
        integersB = readIntegers("Ingrese un entero ", quantityB );
        
        newArray = newArray(integersA,integersB);
        
        toPrintIntegers( integersA );
        toPrintIntegers( integersB );
        toPrintIntegers( newArray );
    }
    
}
