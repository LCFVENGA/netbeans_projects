
package suma;
import javax.swing.JOptionPane;
/**
 *
 * @author jp
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,b,z;
       String texto;
       
       a=Double.parseDouble(JOptionPane.showInputDialog("a"));
       b=Double.parseDouble(JOptionPane.showInputDialog("b"));
    
    
    z=a+b;
texto="resultado"+z;

 JOptionPane.showMessageDialog(null,texto);
    
           
              
    }
    
}
