import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * programa para sumar dos fraccionaros con condiciones e imprimirlos
 * 
 *  (a/b)+(c/d) = (a*d+c*b)/b*d donde b y d son diferentes de cero
 *
 * @author Carabalí Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson.
 */
public class SumaFraccionesCondiciones {

    /**
     * Metodopara leer el entero que nos da el usuario
     * @param pregunta esla pregunta que le hacemos al usuario
     * @return es el numero entero que ingresa el usuario
     */
    public static int leerEntero( String pregunta )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * Metodo para imprimir un texto
     * @param texto es lo que se va a  imprimir
     */
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * Metodo para sumar dos fracciones heterogeneas
     * @param a valor de a 
     * @param b valor de b
     * @param c valor de c
     * @param d valor de d
     * @return es el resultado de la suma de las dos fracciones heterogeneas
     */
    public static double calcularFraccion (double a, double b, double c,
                                           double d)
    {
        return (a * d + b * c) / ( b * d ) ;
    }
    /**
     * Metodo para imprimir todos los datos
     * @param a es el valor de a
     * @param b es el valor de b 
     * @param c es el valor de c
     * @param d es el valor de d
     * @param r es el resultado de la de las dos fracciones heterogeneas
     */
    public static void imprimirResultado ( int a, int b, int c, 
                                           int d, double r)
    {
        DecimalFormat decimal = new DecimalFormat("#.##");
        String texto;
        texto = "valor de A: " + a + "\n";
        texto += "Valor de B: " + b + "\n";
        texto += "Valor de C: " + c + "\n";
        texto += "Valor de D: " + d + "\n";
        texto += a + "/" + b +" +" + c + "/" + d + "\n\n";
        texto += "Resultado: " + decimal. format(r);
        
        imprimir( texto );
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        int a, b, c, d;
        double r;
        
        imprimir("Suma de dos Fracciones Heterogeneas" + "\n" + "              "
                + "      a/b + c/d");
        
        a = leerEntero("Valor de A: ");
        b = leerEntero("Valoe de B: ");
        c = leerEntero("Valor de C: ");
        d = leerEntero("valor de D: ");
        
        r = calcularFraccion( a, b, c, d );
        if( b * d == 0)
        {
            imprimir("El resultado es indeterminado ya que uno de los divisores "
                    + "es cero ");
                     return;
        }
        imprimirResultado( a, b, c, d, r);
    }
    
}
