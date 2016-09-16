import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * Programa para convertir un valor a otro segun la opcion que desee el usuario 
 * e imprimirlo 
 * 
 * kiloBytes (KB) a Bytes(B), MegaBytes (MB) a KiloBytes (KB), MegaBytes (MB) a
 * TeraBytes(TB)
 *
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson.
 */
public class ConversionesCondicion {

    /**
     * Metodo para leer un numero double
     * @param pregunta es la pregunta que se le hace al usuario
     * @return es el numero double que nos da el usuario(la respuesta del usuario)
     */
    public static double leerDouble( String pregunta )
    {
        return Double.parseDouble(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * Metodo para pregunta sobre un tema en especifico
     * @param texto es la pregunta que se le va a hacer al usuario
     * @return es la respuesta de l usuario
     */
    public static String preguntar(String texto)
    {
        return JOptionPane.showInputDialog( texto );
    }
    /**
     * Metodo para imprimir un texto o mensaje
     * @param texto es el texto o mesaje que deseamos imprimir
     */
    public static void imprimir (String texto)
    {
        JOptionPane.showMessageDialog(null, texto);
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {

       DecimalFormat decimal = new DecimalFormat("#.###");
       double numero, resultado;
       String pregunta;
       imprimir("A la hora de escojer porfavor solo presiona el numero "
             + "correspondiente");
       
       pregunta = preguntar(" 1. Convertr de KiloBytes(KB) a Bytes(B). \n 2. "
               + "Convertir de MegaBytes(MB) a KiloBytes(KB). \n 3. Convertir "
               + "de MegaBytes(MB) a TeraBytes(TB). \n 4. Salir.");
       if( "1".equals(pregunta)){
           numero = leerDouble("KiloBytes(KB): ");
           resultado = numero * 1024;
           imprimir(" KiloBytes(KB): " + numero + "\n Bytes(B): " + decimal. 
                   format(resultado));
       }
       if( "2".equals(pregunta)){
           numero = leerDouble("MegaBytes(MB): ");
            resultado = numero * 1024;
           imprimir( "MegaBytes(MB): " + numero + "\n KiloBytes(KB): " + decimal. 
                   format(resultado));
       }
       if("3".equals(pregunta)){
           numero = leerDouble("MegaBytes(MB): ");
            resultado = numero * 1048576;
           imprimir( "MegaBytes(MB): " + numero + "\n TeraBytes(TB): " + decimal. 
                   format(resultado));
       }
       if("4".equals(pregunta)){
           imprimir("Hasta luego");
       }
       
    }
    
}
