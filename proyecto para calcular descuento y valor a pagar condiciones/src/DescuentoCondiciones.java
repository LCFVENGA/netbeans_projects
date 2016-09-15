import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * programa para sacar descuento segun el precio del producto e imprimir
 * los resultados
 *
 * (0 a 10000] 0.0%, (10000 a 10000000] 5.0%, (100000, en adelante) 8.0%
 * 
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson.
 */
public class DescuentoCondiciones {

    /**
     * Metodo para leer un numero double que nos da el usuario
     * @param pregunta es la pregunta que se le va a hacer al usuario
     * @return es el numero double que el usuario ingresa
     */
    public static double leerDouble ( String pregunta )
    {
        return Double.parseDouble(JOptionPane.showInputDialog(pregunta));
    }
    /**
     * Metodo para imrpimir un texto
     * @param texto es lo que queresmos imprimir 
     */
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * Metodo para calcular el descuento segun el precio dado 
     * @param precio es el valor que nos da el usuario
     * @return es el descuento que se le va a hacer al usuario
     */
    public static double calcularDescuento ( double precio )
    {   
      
        if( precio > 0 && precio <= 10000 ){
             return 0;
        }
        if( precio > 10000 && precio <= 100000)
        {
            return ( precio * 5.0 ) / 100.0 ;
        }
        if( precio > 100000 ){
            return( precio * 8.0 ) / 100.0;
        }
        return precio ;
    }
    /**
     * Metodo para imprimir los datos y resltados dados
     * @param precio es el valor del producto
     * @param descuento el descuento del producto
     * @param pagar lo que se debe pagar en total
     */
    public static void imprimirTodo( double precio, double descuento, 
            double pagar)
    {
        DecimalFormat decimal = new DecimalFormat("#.##");
        String texto;
        texto = "Precio del articulo: " + precio + "\n";
        texto += "Descuento: " + decimal. format (descuento) + "\n";
        texto += "Precio a Pagar: " + decimal. format(pagar);
        
        imprimir( texto );
        
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        double precio, descuento, pagar;
        
        precio = leerDouble("Cual es el precio del producto?: ");
        descuento = calcularDescuento( precio );
        pagar = precio - descuento;
        
        imprimirTodo( precio, descuento, pagar);
    }
    
}
