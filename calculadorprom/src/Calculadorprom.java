import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 * Programa para preguntar el nombre de n estudiantes y m notas calcular 
 * promedio de ellos ver si ganan o pierden la nota mas alta las mas baja y 
 * el promedio del grupo en general
 * 
 * @author Carabali Rivera Juan Pablo
 */


public class Calculadorprom {

    
    
    
    /**
     * Metodo para leer un numero Double.
     * @param pregunta es la pregunta que se le hará al usuario.
     * @return es el numero que el usuario ingrese.
     */
    public static double leerDouble(String pregunta)
    {
        while( true ){
            try
            {
                return Double.parseDouble(JOptionPane.showInputDialog(pregunta));
            }
            catch( Exception e)
            {
                JOptionPane.showMessageDialog(null,"ERROR, ingrese un Numero",
                      "Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
   
    
    
    /**
     * Metodo para leer un entero.
     * @param pregunta es la pregunta que se le hará al usuario.
     * @return es el numero que ingreso el usuario.
     */
    public static int leerEntero(String pregunta)
    {
        while( true ){
            try
            {
                return Integer.parseInt(JOptionPane.showInputDialog(pregunta));
            }
            catch( Exception e)
            {
                JOptionPane.showMessageDialog(null,"ERROR, ingrese un Numero",
                      "Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    
    /**
     * Metodo para imprimir un texto.
     * @param texto es el texto que vamos a imprimir.
     */
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog(null,texto);
    }
    
    
    
    
    /**
     * Metodo para calcular el promedio de un estudiante.
     * @param n es el numero de estudiantes. 
     * @param m es el numero de notas.
     * @return nos retorna un texto en el cual tenemos una lista con los nombres
     *         promedio de cada alumno, si aprobo o reprobo segun nota y el 
     *         promedio general de curso.
     */
    public static String calcularPromedio( int n, int m)
    {
        DecimalFormat decimal = new DecimalFormat("#.##");
        String lista,nombre;
        double nota, promedio, promediof, mayor, menor;
        int i,j;
        
    
        lista = "";
        promediof = 0;
        mayor = 0.0;
        menor = 5.0;
        for( i=1; i<=n; i++)
        {
            nombre = JOptionPane.showInputDialog("Nombre estudiante");
           
            lista += i +". " + nombre + ": ";
            promedio = 0;
            for( j=1; j<=m; j++)
            {  do{
                nota = leerDouble("Nota " + j + ":");
                if (nota < 0 || nota > 5){
                    imprimir("solo se puede de 0.0 a 5.0.");
                }
                }while(nota < 0.0 || nota > 5.0) ;
                promedio += nota;
                if(j == m)
                {
                    promedio = promedio/m;   
                    promediof += promedio;
                  
                    if (promedio >= 3.0){
                        lista += decimal. format(promedio) + "  Aprobo";
                    }
                    else{
                        lista += decimal. format(promedio) + "  Reprobo";
                    }
                    if( promedio < menor)
                    {
                        menor = promedio;
                        
                    }
                    if( promedio > mayor )
                    {
                        mayor = promedio;
                    }
                }
               
            }
            lista +="\n";
             if( i == n ){
                promediof = promediof / n;
                lista +="El promedio del curso es: " + decimal.format(promediof);
                lista +="\n\nEl promedio mayor fue de: " + decimal.format(mayor);
                lista +="\nEl promedio menor fue de: " + decimal.format(menor);
            }
        }
        return lista;
    }
            
            
    /**
     * @param args linea de comandos 
     */
    public static void main(String[] args) {
       int n,m;
       String lista;
       
       n = leerEntero("Numero de estudiantes: ");
       m = leerEntero("Total notas: ");
       
       lista = calcularPromedio(n,m);
       
       imprimir(lista);
    }
    
}
