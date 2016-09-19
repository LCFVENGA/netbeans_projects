import javax.swing.JOptionPane;
/**
 * programa que dado un caracter identifica si este es una vocal, consonante, 
 * numero o un simbolo
 * 
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos andres,
 *         Valencia Romero Kevin Edilson.
 */
public class ConsonantesVocalesNumeros {

    public static char leerCaracter( String pregunta )
    {
        return (JOptionPane.showInputDialog(pregunta)).toUpperCase().charAt(0);
    }
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    public static void identificarCaracter()
    {
        String texto;
        char a;
        
        a = leerCaracter("ingresa un caracter");
        
        imprimir("Es una Vocal " + a);
        
        switch(a){
            case 1: if(a == 'a'){
                    imprimir("Es una Vocal");
                    }
                    break;
            default:         
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       identificarCaracter();
    }
    
}
