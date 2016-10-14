import javax.swing.*;

/**
 *  Este programa halla el factorial de un numero 
 * @author Carabali Rivera Juan Pablo.
 */
public class Factorial {

    
    /**
     * Metodo para leer un entero.
     * @param question es la pregunta que se le hara al usuario.
     * @return es el entero que nos da el usuario como respuesta.
     */
    public static int readInteger(String question)
    {
        while( true )
        {
            try
            {
               return Integer.parseInt(JOptionPane.showInputDialog( question ));
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog(null,"Error, Ingrese un entero",
                        "Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    /**
     * Metodo para imprimir un texto.
     * @param text es el texto que deseamos imprimir.
     */
    public static void toPrint (String text)
    {
        JOptionPane.showMessageDialog( null, text );
    }
    
    
    /**
     * Metodo para hacer una multiplicacion con sumas.
     * @param a es el numero que sera multiplicado.
     * @param b es el numero que multiplica al otro.
     * @return es el resultado de la operacion efectuada.
     */
    public static int calculateSum(int a,int b)
    {
        int i,sum;
        
        i=0;
        sum=0;
        
        while(i<b)
        {
            sum+=a;
            i++;
        }
        return sum;
        
    }
    
    
    
    /**
     * Metodo para calcular el factorial de un numero.
     * @param n es el numero en el cual vamos a efectuar la operacion.
     * @return el resultado de la operacion.
     */
    public static int calculateFactorial(int n)
    {
        int factorial,i;
        
        
        factorial= calculateSum(n,n-1);
        
        for(i=1;i<n;i++)
        {
            if(i>1)
            {
            factorial= calculateSum( factorial, n-i);
            }
        }
        return factorial;
    }
    
    
    
    /**
     * @param args linea de comandos.
     */
    public static void main(String[] args) {
        int n,a;
        
        n = readInteger("dar entero");
        a = calculateFactorial(n);
        
        toPrint("El resultado es: " + a);
    }
    
}
