import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * programa para calcular el valor a pagar por el cliente segun el valor 
 * unitario de la mercancia y la cantidad ademas ver si le sobra dinero al 
 * cliente o le falta por pagar e imprimirlo con condiciones
 * 
 *  valorTotal = cantidad * valorUnitario
 *  devuelta = valorEntregado - valorTotal
 *
 * @author Carabalí Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson.
 */
public class CompraCalcularSobroFaltaCondiciones {

    /**
     * Metodo para leer numero double
     * @param pregunta es la pregunta que le vamos a hacer al usuario
     * @return el el double que el usuario ingresa
     */
    public static double leerValor ( String pregunta )
    {
        return Double.parseDouble(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * Metodo para calcular el valor total al ver la cantidad y el valor uni.
     * @param cantidad es la cantidad de mercancia que desea
     * @param valorUni es el valor del producto
     * @return es el valor total de la mercancia
     */
    public static double calcularValorTotal ( double cantidad, double valorUni)
    {
        return cantidad * valorUni ;
    }
    /**
     * Metodo para calcular cuanto se le tiene que devolver al cliente.
     * @param valorEntregado es la cantidad que el cliente nos dio.
     * @param valorTotal es es costo total de toda la mercancia que desea el
     *                   cliente.
     * @return total que se le debe de devolver al cliente.
     */
    public static double calcularDevuelta ( double valorEntregado, double 
                                            valorTotal )
    {
        return valorEntregado - valorTotal ;
    }
    /**
     * Metodo para imprimir un texto especifico.
     * @param texto es el texto que se va a imprimir.
     */
    public static void imprimir ( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * Metodo para imprimir los datos y resultado dados
     * @param cantidad cantidad de producto que compra
     * @param valorUni valor de el producto
     * @param valorTotal valor total de la mercancia
     * @param valorEntregado dinero que el cliente da
     * @param devuelta es lo que le sobra al cliente
     */
    public static void imprimirTodo ( double cantidad, double valorUni, 
            double valorTotal, double valorEntregado, double devuelta)
    {
        DecimalFormat decimal = new DecimalFormat("#.##");
        String texto;
        
        texto = "Precio Unitario: $" + valorUni + "\n";
        texto += "Cantidad: " + cantidad + "\n";
        texto += "Valor Entregado: $" + valorEntregado + "\n";
        texto += "Valor Total: $" + decimal. format( valorTotal ) + "\n";
        texto += "Total Devuelta: $" + decimal. format( devuelta );
        
        imprimir ( texto );
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        double cantidad, valorUni, valorTotal, valorEntregado, devuelta;
        
        valorUni = leerValor("Precio unitario: ");
        cantidad = leerValor("cantidad: ");
        valorEntregado = leerValor("Valor Entregado por cliente: ");
        valorTotal = calcularValorTotal( cantidad, valorUni );
        devuelta = calcularDevuelta( valorEntregado, valorTotal );
        if( devuelta < 0 )
        {
            imprimir("Dinero insuficiente le faltan: $" + -1 * devuelta );
            return;
        }
        else
        {
            if ( devuelta > 0 )
            {
            imprimir("Su devuelta es: $" + devuelta );
            }
        }
        imprimirTodo( cantidad, valorUni, valorTotal, valorEntregado, devuelta);
    }
    
}
