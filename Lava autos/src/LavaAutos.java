import javax.swing.JOptionPane;
/**
 * Proyecto para identificar el precio del lavado segun el tipo de auto, 
 * modelo y el tipo de vehiculo e imprimir el precio. Nota si el carro tiene mas 
 * de 8 años o mas, el costo se incrementa un 20% 
 * _______________________________________________________
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
 *         
 */
public class LavaAutos {

    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    public static int leerEntero( String pregunta )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    public static void calcularResultadoA(int opcion)
    {
        int a ; double valor = 16000;
        switch (opcion) {
            case 1:
                a = leerEntero("cuantos años tiene su automovil actualmente");
                if( a >= 8 ){
                    valor = 16000 + (16000 * 0.2);
                }
                else{
                    valor = 16000;
                }   break;
            case 2:
                a = leerEntero("cuantos años tiene su automovil actualmente");
                if( a >= 8 ){
                    valor = 20000 + (20000 * 0.2);
                }
                else{
                    valor = 20000;
                }   break;
            case 3:
                a = leerEntero("cuantos años tiene su automovil actualmente");
                if( a >= 8){
                    valor = 27000 + (27000 * 0.2);
                }
                else{
                    valor = 27000;
                }   break;
            default:
                break;
        }
      imprimir("el valor a pagar es:"+valor);
      
    }
    public static void procesarSubMenA()
    {
        String submenu;
        int opcion,a;
        
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
        }while( opcion != 1 || opcion != 2 || opcion != 3 );
    }
    public static void procesarMenu()
    {
        String menu;
        int opcion;
        
        menu = "LAVAAUTOS CARABALYUS S.A \n\n";
        menu += "Marque 1. Si es Automovil.\n";
        menu += "Marque 3. Si es Campero.\n";
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
                case 4: break;
                
                default: imprimir("Opcion invalida.");
                         break;
            }
        }while( opcion != 4 );
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        procesarMenu();
      
    }
    
}
