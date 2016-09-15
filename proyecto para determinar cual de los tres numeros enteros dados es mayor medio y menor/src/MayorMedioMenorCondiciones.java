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
     * @return es el Numero mayor de los tres
     */
    public static int calcularMayor(int a, int b, int c)
    {
        if( a > b ){
            if ( a > c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if( b > c ){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static int calcularMedio (int a, int b, int c)
      {
        if( a > b ){
            if ( a < c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if( b < c ){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static int calcularMenor (int a, int b, int c)
       {
        if( a < b ){
            if ( a < c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if( b < c ){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static void imprimir ( int a, int b, int c, int mayor, int medio, 
                                  int menor)
    {
       
        String texto;
        
        texto = "Entero "
                + "N°1: " + a + "\n";
        texto += "Entero N°2: " + b + "\n";
        texto += "Entero N°3: " + c + "\n\n";
        texto += "Entero Mayor: " + mayor + "\n";
        texto += "Entero Medio: " + medio + "\n";
        texto += "Entero Menor: " + menor;
        
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * @param args linea de comando
     */
    public static void main(String[] args) {
        int a, b, c, mayor, medio, menor;
        JOptionPane.showMessageDialog(null, "Comparando los enteros.");
        
        a = leerEntero("Entero N°1: ");
        b = leerEntero("Entero N°2: ");
        c = leerEntero("Entero N°3: ");
        mayor = calcularMayor(a, b, c);
        medio = calcularMedio(a, b, c);
        menor = calcularMenor(a, b, c);
        
        imprimir(a, b, c, mayor, medio, menor);
    }
    
}
