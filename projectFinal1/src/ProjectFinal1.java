import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Este juego es un programa donde el jugador prueba su suerte al intentar 
 * obtener el mayor puntaje posible haciendo lanzamientos de flechas hacia el 
 * blanco con sus respectivas divisiones y puntuaciones especificas.
 *
 *
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson
 */
public class ProjectFinal1 {

    /**
     * Metodo para calcalcular el puntaje total del jugador
     * @param tiro1  es el puntaje 1  que obtuvo el jugador
     * @param tiro2  es el puntaje 2  que obtuvo el jugador
     * @param tiro3  es el puntaje 3  que obtuvo el jugador
     * @param tiro4  es el puntaje 4  que obtuvo el jugador
     * @param tiro5  es el puntaje 5  que obtuvo el jugador
     * @param tiro6  es el puntaje 6  que obtuvo el jugador
     * @param tiro7  es el puntaje 7  que obtuvo el jugador
     * @param tiro8  es el puntaje 8  que obtuvo el jugador
     * @param tiro9  es el puntaje 9  que obtuvo el jugador
     * @param tiro10 es el puntaje 10 que obtuvo el jugador
     * @return es el total de puntos que obtuvo el jugador
     */
    public static int calcularPuntaje(int tiro1, int tiro2, int tiro3, int tiro4,
            int tiro5, int tiro6, int tiro7, int tiro8, int tiro9, int tiro10) 
    {
        return tiro1 + tiro2 + tiro3 + tiro4 + tiro5 + tiro6 + tiro7 + tiro8
                + tiro9 + tiro10;
    }
    public static int leerEntero( String pregunta )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    public static void imprimirImagen(String texto, String imagen)
    {
        JOptionPane.showMessageDialog(null,texto , "mensaje", 
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon( imagen ));
    }
    public static int numeroAleatorio(int minimo, int maximo)
    {
        int numero = (int) Math.floor(Math.random() * ( minimo - ( maximo + 1 ))
                + ( maximo + 1));
        return numero;
        
    }
    public static int procesarJuego()
    {
        int tiro1, tiro2, tiro3, tiro4, tiro5, tiro6, tiro7, tiro8, tiro9, 
                tiro10,azul,v,c,f,g,h,j,k,l,o,p,u;
        azul = 0;
        v=1;
        c=2;
        f=3;
        g=4;
        h=5;
        j=6;
        k=7;
        l=8;
        o=9;
        p=10;
        u=11;     
        tiro1 = numeroAleatorio(0,11);      
        tiro2 = numeroAleatorio(0,11);
        tiro3 = numeroAleatorio(0,11);
        tiro4 = numeroAleatorio(0,11);
        tiro5 = numeroAleatorio(0,11);
        tiro6 = numeroAleatorio(0,11);
        tiro7 = numeroAleatorio(0,11);
        tiro8 = numeroAleatorio(0,11);
        tiro9 = numeroAleatorio(0,11);
        tiro10 = numeroAleatorio(0,11);
        
    }
    public static void procesarPuntaje()
    {
     String texto;
     int tiro1,tiro2,tiro3,tiro4,tiro5,tiro6,tiro7,tiro8,tiro9,tiro10,puntaje;
     puntaje = calcularPuntaje(tiro1,tiro2,tiro3,tiro4,tiro5,tiro6,tiro7,tiro8,
             tiro9,tiro10);
     
    }
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    public static void procesarMenu(){
        String menu;
        int opcion;
        
        menu = "INGRESE LA OPCION QUE DESEAS EJECUTAR \n\n";
        menu += "Marque  1.  Para Jugar \n";
        menu += "Marque  2.  Para ver tus Puntajes \n";
        menu += "Marque  3.  para Salir";
        imprimirImagen("Prueba tu suerte lanzando flechas hacia\n el blanco","/home/jp/"
                + "NetBeansProjects/SueldoEmpleado/src/1.jpg");
        do{
            opcion = leerEntero( menu );
            
            switch(opcion){
                case 1: procesarJuego();
                        break;
                
                case 2: ProcesarPuntaje();
                        break;
                
                case 3: break;
                
                default: imprimir( "Opcion no Valida.");
                         break;
            }
        }while (opcion != 3);
    }

    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        
        procesarMenu();
    }

}
