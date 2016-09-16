import javax.swing.JOptionPane;
/**
 * Programa para determinar cual numero es mayor, menor o medio de los dados por
 * el usuario
 *
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson.
 */
public class MayorMedioMenorCondiciones {

    /**
     * 
     * @param pregunta es la pregunta que le vamos a hacer al usuario
     * @return es el entero que nos da el usuario
     */
    public static int leerEntero( String pregunta )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * 
     * @param a es el entero "N°1"
     * @param b es el entero "N°2"
     * @param c es el entero "N°3"
     */
    public static void calcularMayorMenorMedio(int a, int b, int c)
    {
        if( a > b ){
            if( a > c ){
                if( c < b ){
                   imprimir("El Mayor es: " + a + "\nEl Medio es: " + b + 
                           "\nEl Menor es: " + c);
                }
                else{
                    imprimir("El Mayor es: " + a + "\nEl Medio es: " + c + 
                           "\nEl Menor es: " + b);
                }
            }
            else if ( c > b){
                imprimir("El Mayor es: " + c + "\nEl Medio es: " + a + 
                           "\nEl Menor es: " + b);
            }
        }
        else if( b > c ){
            if( a > c ){
            imprimir("El Mayor es: " + b + "\nEl Medio es: " + a + 
                           "\nEl Menor es: " + c);
            }
            else{
                imprimir("El Mayor es: " + b + "\nEl Medio es: " + c + 
                           "\nEl Menor es: " + a);
            }
        }
        else{
            imprimir("El Mayor es: " + c + "\nEl Medio es: " + b + 
                           "\nEl Menor es: " + a);
        }
    }
    public static void imprimir ( String texto )
    {   
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * @param args linea de comando
     */
    public static void main(String[] args) {
        int a, b, c;
        
        JOptionPane.showMessageDialog(null, "Comparando los enteros.");
        
        a = leerEntero("Entero N°1: ");
        b = leerEntero("Entero N°2: ");
        c = leerEntero("Entero N°3: ");
        
        calcularMayorMenorMedio( a ,b, c );
    }
    
}
