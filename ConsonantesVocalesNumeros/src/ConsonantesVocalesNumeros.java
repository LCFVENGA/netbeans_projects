import javax.swing.JOptionPane;
/**
 * programa que dado un caracter identifica si este es una vocal, consonante, 
 * numero o un simbolo
 * 
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos andres,
 *         Valencia Romero Kevin Edilson, Reyes Cuero Walter Andres.
 */
public class ConsonantesVocalesNumeros {

    /**
     * Metodo para leer un caracter
     * @param pregunta es la pregunta que se le hace al usuario
     * @return es la respuesta del usuario convertida en caracter
     */
    public static char leerCaracter( String pregunta )
    {
        return (JOptionPane.showInputDialog(pregunta)).toUpperCase().charAt(0);
    }
    /**
     * Metodo para imprimir o mostrar ne la pantalla un texto
     * @param texto es el texto que se desa imprimir o mostrar en la pantalla
     */
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * Metodo por el cual identificamos si el caracter dado por el usuario
     * es una vocal, consonante, numero o Simbolo.
     */
    public static void identificarCaracter()
    {
        
        char a;
      
        a = leerCaracter("Ingresa un caracter");
      
        switch(a)
        {
            case 'A':   imprimir("El Caracter ingresado es una Vocal.");
                        break;
            case 'B':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'C':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'D':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'E':   imprimir("El Caracter ingresado es una Vocal.");
                        break;
            case 'F':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'G':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'H':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'I':   imprimir("El Caracter ingresado es una Vocal.");
                        break;
            case 'J':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'K':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'L':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'M':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'N':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'Ñ':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'O':   imprimir("El Caracter ingresado es una Vocal.");
                        break;
            case 'P':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'Q':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'R':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'S':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'T':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'U':   imprimir("El Caracter ingresado es una Vocal.");
                        break;
            case 'V':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'W':   imprimir("El Caracter ingresado es una Consonante.");
                        break;
            case 'X':   imprimir("El Caracter ingresado es una consonante.");
                        break;
            case 'Y':   imprimir("El Caracter ingresado es una consonante.");
                        break;
            case 'Z':   imprimir("El Caracter ingresado es una consonante.");
                        break;
            case '0':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '1':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '2':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '3':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '4':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '5':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '6':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '7':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '8':   imprimir("El Caracter ingresado es un Número.");
                        break;
            case '9':   imprimir("El Caracter ingresado es un Número.");
                        break;
            default:    imprimir("El Caracter ingresado es un Signo.");
                        break;
        }
        
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
       identificarCaracter();
    }
    
}
