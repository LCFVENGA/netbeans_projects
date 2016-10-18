import java.text.DecimalFormat;
import javax.swing.*;

/**
 * programa para calcular definitiva de un estudiante dadas n notas imprimir 
 * mayor nota menor nota y definitiva de este.
 * @author jp
 */
public class CalcularDefi {

    
    public static double leerDouble ( String pregunta )
    {
        while( true )
        {
            try
            {
               return Double.parseDouble(JOptionPane.showInputDialog(pregunta));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error,Ingrese un numero", 
                        "Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    
    public static int leerEntero ( String pregunta )
    {
        while( true )
        {
            try
            {
                return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"ERROR, Ingrese un numero",
                        "Ventana de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    
    public static void imprimir(String texto)
    {
        JOptionPane.showMessageDialog(null,texto);
    }
    
    
    
    
    public static void calcularDefinitiva ( int n )
    {
        DecimalFormat decimal = new DecimalFormat("#.##");
        double promedio, mayor, menor, a;
        int i;
        mayor = 0;
        menor = 5;
        promedio = 0;
        i = 1;
        do{
            do{
                a = leerDouble("Nota N°" + i);
                if(a < 0 || a > 5)
                {
                    imprimir("recuerdo que la nota debe ser de '0.0' a '5.0'");
                }
            }while(a<0||a>5);
            if(mayor < a)
            {
                mayor = a;
            }
            if(menor > a)
            {
                menor = a;
            }
            promedio +=a;
            i++;
        } while(i<=n);
        
        promedio /= n;
        
        imprimir("La definitiva es: " + decimal.format(promedio) + "\nLa nota "
                + "mayor es: " + decimal.format(mayor) + "\nLa nota menor es: " 
                + decimal.format(menor));
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int n;                             
        
        n = leerEntero("ingrese el numero de notas que tiene: ");
        
        calcularDefinitiva(n);
    }
    
}
