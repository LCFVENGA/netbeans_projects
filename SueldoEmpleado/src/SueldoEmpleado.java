import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 * progrma para calcular el amuento de salario dado la categoria y sueldo del 
 * empleado, de acuerdo a la tabla:
 * _________________________________________________
 * |                      |                         |
 * |      Categoria       |  Porcentaje de aumento  |
 * |______________________|_________________________|
 * |                      |                         |
 * |          1           |           12%           |
 * |______________________|_________________________|
 * |                      |                         |
 * |          2           |           10%           |
 * |______________________|_________________________|
 * |                      |                         |
 * |          3           |           8%            |
 * |______________________|_________________________|
 * |                      |                         |
 * |          4           |           5%            |
 * |______________________|_________________________|
 *
 * 
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson.
 */
public class SueldoEmpleado {

    /**
     * Metodo para leer un entero
     * @param pregunta es la pregunta que se le hace al usuario
     * @return es el entero que ingreso el usuario
     */
    public static int leerEntero(String pregunta)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(pregunta));
    }
    /**
     * Metodo para imprimir un texto en la pantalla
     * @param texto es el texto que queremos imprimir
     */
    public static void imprimir(String texto)
    {
        JOptionPane.showMessageDialog(null,texto);
    }
    /**
     * Metodo para calcular el aumento segun categoria y sueldo de un empleado
     * @param sueldo es el sueldo del empleado
     */
    public static void operarCategoria(int sueldo)
    {
       DecimalFormat decimal = new DecimalFormat("#.##");
        int opcion;
        double  aumento, total;
        
        opcion = leerEntero("De que categoria es el empleado\nCategoria 1. "
                + "presione el 1.\nCategoria 2. presione el 2.\nCategoria 3. "
                + "presione el 3.\nCategoria 4. presione el 4.");
        
        switch(opcion){
            case 1: aumento = sueldo * 0.12;
                    total = sueldo + aumento;
                    imprimir("El aumento que optiene este empleado es: " + 
                    decimal. format(aumento) + "\nSu sueldo ahora es un total "
                    + "de: " + decimal. format(total));
                    break;
            case 2: aumento = sueldo * 0.10;
                    total = sueldo + aumento;
                    imprimir("El aumento que optiene este empleado es: " + 
                    decimal. format(aumento) + "\nSu sueldo ahora es un total "
                    + "de: " + decimal. format(total));
                    break;  
            case 3: aumento = sueldo * 0.8;
                    total = sueldo + aumento;
                    imprimir("El aumento que optiene este empleado es: " + 
                    decimal. format(aumento) + "\nSu sueldo ahora es un total "
                    + "de: " + decimal. format(total));
                    break;   
            case 4: aumento = sueldo * 0.5;
                    total = sueldo + aumento;
                    imprimir("El aumento que optiene este empleado es: " + 
                    decimal. format(aumento) + "\nSu sueldo ahora es un total "
                    + "de: " + decimal. format(total));
                    break;          
            default: imprimir("Opcion Ivalida.");        
        }
        
    }
    /**
     * @param args linea de codigos.
     */
    public static void main(String[] args) {
        int sueldo;
        sueldo = leerEntero("Sueldo.");
        operarCategoria(sueldo);
        JOptionPane.showMessageDialog(null, "Blah blah blah", "mensaje", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/home/jp/NetBeansProjects/SueldoEmpleado/src/1.jpg"));
    }
    
}
