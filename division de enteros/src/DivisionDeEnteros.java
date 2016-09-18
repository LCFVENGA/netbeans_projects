import javax.swing.JOptionPane;


/**
 *este programa es para dividir dos enteros y imprimir sus resultados
 *D=a/b
 * @author jp
 */
public class DivisionDeEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      int d,a,b;
      String texto;
      
      a=Integer.parseInt(JOptionPane.showInputDialog("a"));
      b=Integer.parseInt(JOptionPane.showInputDialog("b"));
      
      d= a/b;
      
      texto="valor a: "+a+"\n";
      texto+="valor b: "+b+"\n";
      texto+= "operacion: " + a + "/" + b + "\n";
      texto+="resultado: "+d;
      
      JOptionPane.showMessageDialog(null,texto);
      
      
        
    }
    
}
