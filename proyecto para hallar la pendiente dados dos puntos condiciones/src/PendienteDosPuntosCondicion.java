import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * programa para hallar la pendiente de una recta dado dos puntos con 
 * condiciones e imprimirlo
 * 
 * pendiente = ( y2 - y1 ) / ( x2 - x1 )
 *
 * @author Carabalí Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson
 */
public class PendienteDosPuntosCondicion {

    /**
     * Metodo para leer el double que nos de el usuario
     * @param pregunta es la pregunta quele hacemos al usuario
     * @return es el double que ingresa el usuario
     */
    public static double leerDouble( String pregunta )
    {
        return Double.parseDouble(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * Metodo para calcular la pendiente dado dos puntos
     * @param y2 es y de el segundo punto
     * @param y1 es y de el primer punto
     * @param x2 es x de el segundo punto
     * @param x1 es x de el primer punto
     * @return  el resultado de la pendiente segun sus puntos
     */
    public static double calcularPendiente ( double y2, double y1, double x2,
                                             double x1 )
    {
        return ( y2 - y1 ) / ( x2 - x1 ) ;
    }
    public static void imprimir ( String texto )
    {
        JOptionPane.showMessageDialog( null , texto );
    }
    /**
     * Metodo para imprimir los datos dados y resultado
     * @param y2 valor en y punto 2
     * @param y1 valor en y punto 1
     * @param x2 valor en x punto 2
     * @param x1 valor en x punto 1
     * @param pendiente valor de la pendiente
     */
    public static void imprimirTodo ( double y2, double y1, double x2, 
                                      double x1 , double pendiente )
    {
        DecimalFormat decimal = new DecimalFormat( "#.###" );
        String texto;
        
        texto = "Punto 1 " + "(" + x1 + "," + y1 + ")" + "\n";
        texto += "Punto 2 " + "(" + x2 + "," + y2 + ")" + "\n\n";
        texto += "Pendiente: " + decimal. format( pendiente ) ;
        
        imprimir( texto );
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        double y2 , y1 , x2, x1, pendiente;
        
        imprimir( "Dar coordenadas de dos puntos para hallar la pendiente." );
        
        x1 = leerDouble("Valor de x, punto 1: ");
        y1 = leerDouble("Valor de y, punto 1: ");
        x2 = leerDouble("Valor de x, punto 2: ");
        y2 = leerDouble("Valor de y, punto 2: ");
        
        pendiente = calcularPendiente( y2, y1, x2, x1 );
        
        if ( x2 == x1 )
        {
            imprimir( "La pendiente no existe." );
            return;
        }
        imprimirTodo( y2, y1, x2, x1, pendiente );
    }
    
}
