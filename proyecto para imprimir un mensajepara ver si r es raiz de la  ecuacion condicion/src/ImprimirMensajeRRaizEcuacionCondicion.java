import javax.swing.JOptionPane;
/**
 * programa para identificar si un numero r es raiz de la ecuacion e imprimir
 * un mensaje que diga si es o no.
 * 
 * a   *   r 2   +   b  *   r  +   c  =   0
 *
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño,
 *         Valencia Romero Kevin Edilson
 */
public class ImprimirMensajeRRaizEcuacionCondicion {

    /**
     * 
     * @param pregunta es la pregunta que le hacemos al usuario
     * @return es el double que nos da el usuario
     */
    public static double leerDouble( String pregunta )
    {
        return Double.parseDouble(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * Metodo para imptimir un texto
     * @param texto es el texto que deseamos que imprima
     */
    public static void imprimir (String texto)
    {
        JOptionPane.showMessageDialog(null, texto);
    }
    public static double calcularEcuacion ( double a, double b, double c, double r)
    {
        return a * Math.pow( r, 2.0 ) + b * r + c;
    }
    public static void imprimirTodo (double a, double b, double c, double r)
    {
        String texto;
        
        texto = "Valor de a: " + a + "\n";
        texto += "Valor de b: " + b + "\n";
        texto += "Valor de c: " + c + "\n";
        texto += "Valor de r: " + r + "\n";
        texto += "r si es Raiz de la ecuacion.";
        
        imprimir(texto);
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        double a, b, c, r, e;
        
        a = leerDouble("Valor de a: ");
        b = leerDouble("Valor de b: ");
        c = leerDouble("Valor de c: ");
        r = leerDouble("Valor de r: ");
        
        e = calcularEcuacion( a, b, c, r);
        
        if( e != 0 )
        {
            imprimir("r no es Raiz de la ecuacion");
            return ;
        }
        
        imprimirTodo( a, b, c, r);
    }
    
}
