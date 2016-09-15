import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * programa para calcular el promedio de un estudiante dadas sus 3 notas ver
 * si gana o pierde teniendo en cuenta que la nota minima para ganar es 3.0 e 
 * imprimir el resultado
 * 
 * promedio = ( nota1 + nota2 + nota3 ) / 3
 *
 * @author Carabalí Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson
 */
public class CalcularPromedioConCondiciones {

    /**
     * Metodo para leer el double que ingrese el usuario
     * @param pregunta es la pregunta que le vamos a hacer al usuario
     * @return es el double que nos da el usuario
     */
    public static double leerDouble( String pregunta )
    {
        return Double.parseDouble(JOptionPane.showInputDialog ( pregunta ) );
    }
    /**
     * Metodo para calcular el promedio de tres notas dadas
     * @param nota1 es la primera nota ingresada por el usuario
     * @param nota2 es la segunda nota ingresada por el usuario
     * @param nota3 es la tercer nota ingresada por el usuario
     * @return es el promedio de las tres notas
     */
    public static double calcularPromedio ( double nota1, double nota2, 
            double nota3 )
    {
        return ( nota1 + nota2 + nota3 ) / 3 ;
    }
    /**
     * Metodo para imprimir lainformacion
     * @param texto es lo que se va a imprimir
     */
    public static void imprimir ( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("#.##");
        double nota1, nota2, nota3, promedio;
        
        nota1 = leerDouble("Nota 1: ");
        nota2 = leerDouble("Nota 2: ");
        nota3 = leerDouble("Nota 3: ");
        
        promedio = calcularPromedio( nota1, nota2, nota3 );
        if( promedio >= 3.0 )
        {
            imprimir("Su promedio es de " + decimal.format( promedio ) + 
                    " Aprobaste");
        }
        else
        {
            imprimir("Su promedio es de " + decimal. format( promedio ) +
                    " Reprobaste");
        }
    }
   
}
