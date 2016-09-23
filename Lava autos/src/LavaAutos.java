import javax.swing.JOptionPane;
/**
 * Proyecto para identificar el precio del lavado segun el tipo de auto, 
 * modelo y el tipo de vehiculo e imprimir el precio. Nota si el carro tiene mas 
 * de 8 años o mas, el costo se incrementa un 20% 
 * ________________________________________________________
 *  |      Tipo de vehiculo      |     Valor a pagar      |
 *  |____________________________|________________________|
 *  |            |  Pequeño      |       $ 16.000         |
 *  | Automovil  |  Mediano      |       $ 20.000         |
 *  |            |  de lujo      |       $ 27.000         |
 *  |____________|_______________|________________________|
 *  |            |  sencillo     |       $ 22.000         |
 *  | Campero    |  de lujo      |       $ 32.000         |
 *  |____________|_______________|________________________|
 *  |            |  sencillo     |       $ 30.000         |
 *  | Camioneta  |  Doble cabina |       $ 35.000         |
 *  |____________|_______________|________________________|
 * 
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Calros Andres,
 *         Valencia Romero Kevin Edilson, Reyes Cuero Walter Andres.
 *         
 */
public class LavaAutos {

    /**
     * Metodo para imprimir un texto
     * @param texto es el texto que queremos imprimir 
     */
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * Metodo para leer un entero
     * @param pregunta es la pregunta que se le hace al usuario
     * @return es el entero que el usuario ingreso
     */
    public static int leerEntero( String pregunta )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * Metodo para calcular el resultado a pagar segun la opcion que el usuario
     * halla escogido.
     * @param opcion es la opcion que escoje el usuario
     */
    public static void calcularResultadoA(int opcion)
    // este es el codigo a ejecutar si el usuario escoje la opcion 1 
    {
        int a,b,r ; double valor = 16000;
        switch (opcion) {
            case 1:
                a = leerEntero("Año actual.");
                b = leerEntero("Modelo actual del vehiculo.");
                r = a-b;
                if( r >= 8 ){
                    valor = 16000 + (16000 * 0.2);
                }
                else{
                    valor = 16000;
                }   break;
            case 2:
                a = leerEntero("Año actual.");
                b = leerEntero("Modelo actual del vehiculo.");
                r = a-b;
                if( r >= 8 ){
                    valor = 20000 + (20000 * 0.2);
                }
                else{
                    valor = 20000;
                }   break;
            case 3:
                a = leerEntero("Año actual.");
                b = leerEntero("Modelo actual del vehiculo.");
                r = a-b;
                if( r >= 8){
                    valor = 27000 + (27000 * 0.2);
                }
                else{
                    valor = 27000;
                }   break;
            default:
                break;
        }
      imprimir("El valor a pagar es: $"+valor);
      
    }
    /**
     * Metodo para calcular el resultado a pagar segun la opcion que el usuario
     * halla escogido
     * @param opcion es la opcion que escoje el usuario
     */
    public static void calcularResultadoC(int opcion)
    // este es el codigo a ejecutar si el usuario escoje la opcion 2
    {
        int a,b,r; double valor = 22000;
        switch(opcion){
            case 1:
                a = leerEntero("Año actual.");
                b = leerEntero("Modelo actual del vehiculo.");
                r = a-b;
                if( r >= 8 ){
                    valor = 22000 + (22000 * 0.2);
                }
                else{
                    valor = 22000;
                }   break;
            case 2:
                a = leerEntero("Año actual.");
                b = leerEntero("Modelo actual del vehiculo.");
                r = a-b;
                if( r >= 8 ){
                    valor = 32000 + (32000 * 0.2);
                }
                else{
                    valor = 32000;
                }   break;
            default: imprimir("Opcion invalida.");
                     break;
        }
        imprimir("El valor a pagar es: $"+valor);
    }
    /**
     * Metodo para calcular el resultado a pagar segun la opcion que el usuario
     * halla escogido
     * @param opcion es la opcion que escoje el usuario
     */
    public static void calcularResultadoM(int opcion)
    // este es el codigo a ejecutar si el usuario escoje la opcion 3.
    {
        int a, b,r; double valor = 30000;
        
        switch(opcion){
            case 1:
                a = leerEntero("Año actual.");
                b = leerEntero("Modelo actual del vehiculo.");
                r = a-b;
                if( r >= 8 ){
                    valor = 30000 + ( 30000 * 0.2);
                }
                else{
                    valor = 30000;
                }   break;
            case 2: 
                a = leerEntero("Año actual.");
                b = leerEntero("Modelo actual del vehiculo.");
                r = a-b;
                if( r >= 8 ){
                    valor = 35000 + ( 35000 * 0.2 );
                }
                else{
                    valor = 35000;
                }   break;
            default: imprimir("Opcion invalida.");
        }
        imprimir("El valor a pagar es: $"+valor);
    }
    /**
     * Metodo para mostrar un submenu.
     */
    public static void procesarSubMenA()
    // este el el submenu de la 1 opcion.
    {
        String submenu;
        int opcion;
        
        submenu = "TIPO DE AUTOMOVIL. \n\n";
        submenu += "Marque 1. Si es Pequeño.\n";
        submenu += "Marque 2. Si es Mediano.\n";
        submenu += "Marque 3. Si es De Lujo.\n";
        
        do{
            opcion = leerEntero(submenu);
   
            switch(opcion){
                case 1: calcularResultadoA(opcion);
                        break;
                case 2: calcularResultadoA(opcion);
                        break;
                case 3: calcularResultadoA(opcion);
                        break;
                default: imprimir("Opcion invalida.");
                         break;
            }
        }while( opcion != 3 && opcion != 2 && opcion != 1 );
    }
    /**
     * Metodo para sacar un submenu
     */
    public static void procesarSubMenC()
    // este es el submenu de la 2da opcion
    {
        String submenu;
        int opcion;
        
        submenu = "TIPO DE CAMPERO. \n\n";
        submenu += "Marque 1. Si es Sencillo.\n";
        submenu += "Marque 2. Si es De Lujo.\n";
        
        do{
            opcion = leerEntero(submenu);
   
            switch(opcion){
                case 1: calcularResultadoC(opcion);
                        break;
                case 2: calcularResultadoC(opcion);
                        break;
                default: imprimir("Opcion invalida.");
                         break;
            }
        }while( opcion != 2 && opcion != 1 );
    }
    /**
     * Metodo para mostrar un submenu
     */
    public static void procesarSubMenM()
    // este es el submenu de la 3ra opcion.
    {
        String submenu;
        int opcion;
        
        submenu = "TIPO DE CAMPERO. \n\n";
        submenu += "Marque 1. Si es Sencillo.\n";
        submenu += "Marque 2. Si es Doble Cabina.\n";
        
        do{
            opcion = leerEntero(submenu);
   
            switch(opcion){
                case 1: calcularResultadoM(opcion);
                        break;
                case 2: calcularResultadoM(opcion);
                        break;
                default: imprimir("Opcion invalida.");
                         break;
            }
        }while( opcion != 2 && opcion != 1 );
    }
    /**
     * Metodo para mostrar el menu principal
     */
    public static void procesarMenu()
            // este es el menu principal
    {
        String menu;
        int opcion;
        
        menu = "LAVAAUTOS CARABALYUS S.A \n\n";
        menu += "Marque 1. Si es Automovil.\n";
        menu += "Marque 2. Si es Campero.\n";
        menu += "Marque 3. Si es una Camioneta.\n";
        menu += "Marque 4. Si desea Salir.";
        
        do{
            opcion = leerEntero( menu );
            
            switch(opcion){
                case 1: procesarSubMenA();
                        break;
                case 2: procesarSubMenC();
                        break;
                case 3: procesarSubMenM();
                        break;
                case 4: imprimir("Muchas gracias por escojernos.");
                        imprimir("Vuelva pronto.");
                        break;
                
                default: imprimir("Opcion invalida.");
                         break;
            }
        }while( opcion != 4 );
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        procesarMenu();
      
    }
    
}
