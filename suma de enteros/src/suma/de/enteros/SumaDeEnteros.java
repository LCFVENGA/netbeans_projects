
package suma.de.enteros;

import javax.swing.JOptionPane;

/**
 *
 * @author jp
 */
public class SumaDeEnteros {

    /**
     * @param args lienea de comandos
     */
    public static void main(String[] args) {
        int a,b,r;
        String tsu;
        
        a= Integer.parseInt(JOptionPane.showInputDialog("valor a: "));
        b= Integer.parseInt(JOptionPane.showInputDialog("valor b: "));
        
        r = a + b;
        
        tsu = "el valor de a: " + a + "\n";
        tsu += "el valor de b: " + b + "\n";
        tsu += "el resultado es: " + r;
        
        JOptionPane.showMessageDialog(null, tsu );
    }
    
}
