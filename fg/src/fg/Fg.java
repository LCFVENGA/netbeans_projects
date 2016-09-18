
package fg;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 * este programa es paa convertir  tf a tc
 * temperaturaCentigrados = 5.0 / 9.0 * ( temperaturaFahrenheit − 32.0 )
 * @author jp
 */
public class Fg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    DecimalFormat decimal = new DecimalFormat("#.##");    
    double tf,tc;
    String texto;
    
    tf=Double.parseDouble(JOptionPane.showInputDialog("temperatura fahrenheit"));
    tc=5.0/9.0*(tf-32.0);
    
    texto="temperatura Fahrenheit "+tf+"\n";
    texto+="temperatura centigrado"+decimal. format (tc);
    
    
   JOptionPane.showMessageDialog(null,texto);
   
   
    
   
            
        
        
    }
    
    
}
