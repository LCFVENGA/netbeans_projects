import javax.swing.JOptionPane;
/**
 * programa para calcular el cambio del aceite segun el kilometraje e imprimir 
 * el resultado;
 * 
 * ( diferencia <= 6000 Km y direncia >= 4500 Km ) es oportuno el cambio
 * ( diferencia >6000) es urgente el cambio
 * ( diferencia < 4500 Km ) cuatos Km faltan
 *
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson.
 */
public class CambioAceiteKilometrajeCondicion {

    /**
     * Metodo para leer un entero
     * @param pregunta es la pregunta que le vamos a hacer al usuario
     * @return es el entero que nos va a dar el usuario 
     */
    public static int leerEntero( String pregunta )
    {
       return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * Metodo para imprimir un texto
     * @param texto es el texto que queramos que imprima
     */
    public static void imprimir ( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        int km, kmu, kmt, faltante;
        imprimir("Cambia el aceite de tu coche segun el kilometraje");
        imprimir("Solo numeros enteros, asi que aproxime.");
        
        kmu = leerEntero("kilometros ultima vez que hizo cambio: ");
        km = leerEntero("Kilometraje Actual del auto: ");
        kmt = km - kmu;
        faltante = 4500 - km; 
        
        if ( kmt <= 6000 && kmt >=4500  ){
            imprimir("Es momento oprtuno para el cambio del aceite");
        }
        if ( kmt > 6000 ){
            imprimir("¡¡URGENTE!!...");
            imprimir("Hay que cambiar el aceite");
        }
        if( kmt < 4500 ){
            imprimir("Le faltan " + faltante + " km, para el cambio del aceite.");
        }
    }
    
}
