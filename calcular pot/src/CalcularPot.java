import javax.swing.JOptionPane;

/**
 * Programa para calcular potencia de un numero dado por b veces.
 * 
 *  potencia = a*a*a*...*a  b veces.
 * 
 * @author Carabali Rivera Juan Pablo.
 */
public class CalcularPot {

    
    /**
     * Metodo para imprimir un texto que se desee.
     * @param texto es el texto a imprimir o mostrar en una ventana.
     */
    public static void imprimir(String texto)
    {
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    
    /**
     * Metodo para leer un entero.
     * @param pregunta es la pregunta que se le va a hacer el usuario.
     * @return es el entero que le usuario ingreso como respuesta.
     */
    public static int leerEntero(String pregunta)
    {
        while( true )
        {
            try
            {
               return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "ERROR, ingrese un Numero.",
                        "Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    /**
     * Metodo para calcular la potencia.
     * @param a es el primer numero.
     * @param b es la cantidad de veces que se va a multiplicar a.
     * @return es el resultado .
     */
    public static int calcularPotencia(int a, int b )
    {
        int i,potencia;
        i = 1;
        potencia = a;
        
        while(i<b)
        {
            potencia*=a;
            i++;
        }
        
        return potencia;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a,b,potencia;
        
        a = leerEntero("Ingrese el numero.");
        b = leerEntero("Ingrese el numero por el cual se va a potencialisar.");
        
        potencia = calcularPotencia(a,b);
        
        imprimir("El resultado es: " + potencia);
        
    }
    
}
