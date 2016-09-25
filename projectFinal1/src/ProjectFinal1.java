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

    /*
     * Metodo para calcalcular el puntaje total del jugador
     * @param a es el tiro inicial
     * @param b es el tiro final
     * @return es el total de puntos que obtuvo el jugador
     */
    /*public static int calcularPuntaje(int a, int b) 
    {
        int puntaje, tiro;
        puntaje = 0;
        tiro = a;
        do{
        
        puntaje += tiro;
        tiro ++;
        
    }while(tiro >= b);
        
      return puntaje;  
        
    }*/
    
    
    /**
     * 
     * @param pregunta
     * @return 
     */
    public static int leerEntero( String pregunta )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    
    
    
    /**
     * 
     * @param pregunta
     * @return 
     */
    public static String leerString(String pregunta)
    {
        return JOptionPane.showInputDialog(pregunta);
    }
    
    
    
    /**
     * 
     * @param texto
     * @param tipo
     * @param imagen 
     */
    public static void imprimirImagen(String texto, String tipo, String imagen)
    {
        JOptionPane.showMessageDialog(null,texto , tipo , 
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon( imagen ));
    }
    
    
    
    /**
     * 
     * @param minimo
     * @param maximo
     * @return 
     */
    public static int numeroAleatorio(int minimo, int maximo)
    {
        int numero = (int) Math.floor(Math.random() * ( minimo - ( maximo + 1 ))
                + ( maximo + 1));
        return numero;
        
    }
    
    
    
    /**
     * Metodo para identificar en donde cayo el tiro que hizo el jugador
     * @param tiro
     * @param texto1 
     */
    public static void procesarTiro(int tiro, String texto1)
    {
        int puntaje;
     
          switch(tiro){
            case 0: puntaje = 5; 
                    imprimirImagen("Has acertado en la Linea Doble\n            "
                            + "Tu Puntaje es de: " + puntaje,texto1,
                    "/home/jp/NetBeansProjects/projectFinal1/src/1.jpg");
                    break;
            case 1: puntaje = 10;
                    imprimirImagen("Has acertado en la Linea Singular\n         "
                            + "Tu puntaje es de: "+puntaje,texto1,
                    "/home/jp/NetBeansProjects/projectFinal1/src/2.jpg");
                    break;
            case 2: puntaje = 15;
                    imprimirImagen("Has acertado en la Linea Triple\n         "
                            + "Tu puntaje es de: "+puntaje,texto1,
                    "/home/jp/NetBeansProjects/projectFinal1/src/3.jpg");
                    break;
            case 3: puntaje = 30;
                    imprimirImagen("Has acertado en la Linea Sencillo\n         "
                            + "Tu puntaje es de: "+puntaje,texto1,
                    "/home/jp/NetBeansProjects/projectFinal1/src/4.jpg");
                    break;
            case 4: puntaje = 50;
                    imprimirImagen("Has acertado en la Bull Sencillo\n          "
                            + "Tu Puntajes es de: "+puntaje,texto1,
                    "/home/jp/NetBeansProjects/projectFinal1/src/5.jpg");
                    break;
            case 5: puntaje = 100;
                    imprimirImagen("Has acertado en la Bull Doble\n            "
                            + "Tu Puntaje es de: "+puntaje,texto1,
                    "/home/jp/NetBeansProjects/projectFinal1/src/6.jpg");
                    break;
            default:puntaje=0;
                    imprimirImagen("Has fallado has dado fuera del blanco\n        "
                    + "Tu puntaje es de: "+puntaje,texto1,
                    "/home/jp/NetBeansProjects/projectFinal1/src/7.jpg");
                    break;
        }
    }
    
    
    
    /**
     * Metodo para que corra el juego
     * @param n son los tiros que se hacen al ejecutar la opcion de jugar
     * @param puntaje es el puntaje que optiene el jugador
     * @return es el puntaje
     */
    public static int juego(int n, int puntaje)
    {
        int i, tiro;
        puntaje = 0;
        for(i=1;i<=n;i++)
        {
            tiro = numeroAleatorio(0,5);
            procesarTiro(tiro,"Tiro");
            switch(tiro){
                case 0: puntaje = 5;
                    break;
                case 1: puntaje = 10;
                    break;
                case 2: puntaje = 15;
                    break;
                case 3: puntaje = 30;
                    break;
                case 4: puntaje = 50;
                    break;
                default: puntaje = 0;
                    break;
            }
           
            
        }
        
        return puntaje;
    }
   /* public static int procesarJuego()
    {
        int tiro1, tiro2, tiro3, tiro4, tiro5, tiro6, tiro7, tiro8, tiro9, 
                tiro10;
     
        tiro1 = numeroAleatorio(0,5);
        procesarTiro(tiro1,"Tiro N°1");
        tiro2 = numeroAleatorio(0,6);
        procesarTiro(tiro2,"Tiro N°2");
        tiro3 = numeroAleatorio(0,6);
        procesarTiro(tiro3,"Tiro N°3");
        tiro4 = numeroAleatorio(0,6);
        procesarTiro(tiro4,"Tiro N°4");
        tiro5 = numeroAleatorio(0,6);
        procesarTiro(tiro5,"Tiro N°5");
        tiro6 = numeroAleatorio(0,6);
        procesarTiro(tiro6,"Tiro N°6");
        tiro7 = numeroAleatorio(0,6);
        procesarTiro(tiro7,"Tiro N°7");
        tiro8 = numeroAleatorio(0,6);
        procesarTiro(tiro8,"Tiro N°8");
        tiro9 = numeroAleatorio(0,6);
        procesarTiro(tiro9,"Tiro N°9");
        tiro10 = numeroAleatorio(0,6);
        procesarTiro(tiro10,"Tiro N°10");
       
        return tiro1+tiro2+tiro3+tiro4+tiro5+tiro6+tiro7+tiro8+tiro9+tiro10;
        
    }*/
    
    
    
    /**
     * Metodo para identificar si la partida es buena o mala
     * @param nombre el nombre del usuario
     * @param puntaje es el puntaje que lleva el usuario
     */
    public static void procesarPuntaje(String nombre, int puntaje)
    {
  
     if( puntaje <= 300){
         imprimir("Nombre: "+ nombre+"\nPuntaje: "+ puntaje +"\nPARTIDA MALA.");
     }
     else if( puntaje > 300 && puntaje <=600){
         imprimir("Nombre: "+ nombre+"\nPuntaje: "+ puntaje+"\nPARTIDA NORMAL");
     }
     else{
         imprimir("Nombre: "+nombre+"\nPuntaje: "+puntaje+"\nPARTIDA BUENA");
     }
     
    }
    
    
    
    /**
     * Metodo para imprimir un texto
     * @param texto el texto que se desea imprimir
     */
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    
    
    
    /**
     * 
     * @param nombre
     * @param puntaje 
     */
    public static void procesarMenu(String nombre, int puntaje){
        String menu;
        int opcion,c;
        
        menu = "INGRESE LA OPCION QUE DESEAS EJECUTAR \n\n";
        menu += "Marque  1.  Para Jugar \n";
        menu += "Marque  2.  Para ver tus Puntajes \n";
        menu += "Marque  3.  para Salir";
        
        do{
            opcion = leerEntero( menu );
            c = puntaje;
            switch(opcion){
                case 1: puntaje = juego(1,puntaje);
                        puntaje += c;
                        break;
                
                case 2:
                    procesarPuntaje(nombre,puntaje);
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
        String nombre;
        int puntaje;
       imprimirImagen("Prueba tu suerte lanzando \nflechas hacia el blanco",
             "Inicio","/home/jp/"+ "NetBeansProjects/SueldoEmpleado/src/1.jpg");
       nombre = leerString("Nombre: ");
       puntaje=0;
       procesarMenu(nombre, puntaje);
    }

}
