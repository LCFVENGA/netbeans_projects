import javax.swing.*;

/**
 * Es te programa lo que hace es sumar n numeros elevados al cuadrado e imprimir
 * su resultado.
 * 
 *  suma 1 +4 + 9 + 16 + 25 + ... + n2
 * 
 * @author Carabali Rivera Juan Pablo.
 */
public class CalcularNumero {

    /**
     * Metodo para leer un entero.
     * @param pregunta es la pregunta que se le hara al usuario.
     * @return es el numero entero que ingresa el usuario.
     */
    public static int leerEntero(String pregunta)
    {
        while(true)
        {
            try
            {
              return Integer.parseInt(JOptionPane.showInputDialog(pregunta));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error, Ingrese un entero",
                        "Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    /**
     *  Metodo para impirmir un texto en una ventana.
     * @param texto es el texto que se desea imrpimir.
     */
    public static void imprimir (String texto)
    {
        JOptionPane.showMessageDialog(null, texto );
    }
    
    
    
    /**
     * Metodo para calcular la suma de potencias dado un numero.
     * @param n es hasta que numero desea el usuario que se haga la suma las 
     * potencias de los numeros antesesores y este al cuadrado.
     * @return 
     */
    public static int calcularSuma(int n)
    {
        int suma, i;
        suma = 0;
       
        for (i=1;i<=n;i++)
        {
            suma+= Math.pow( i, 2 );
        }
        
        return suma;
    }
    
    
    /**
     * @param args linea de comandos.
     */
    public static void main(String[] args) {
        int n , suma;

        n = leerEntero("de un numero: ");    
        suma = calcularSuma(n);
        
        imprimir("el resultado es: " + suma);
    }
    
}
