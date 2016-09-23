import javax.swing.JOptionPane;
/**
 * ESTE PROGRAMA NOS PERMITE SABER EL PRECIO TOTAL DE LAS SEMILLAS QUE DESEE EL 
 * CLIENTE
 * _________________________________________________________ 
 *  |             |                 |                       |
 *  |   VERDURA   |      TIPO       | VALOR DE CADA SEMILLA |
 *  |_____________|_________________|_______________________|
 *  |             | CHONTO          |         $ 15          |
 *  | TOMATE      | ENSALADA        |         $ 20          |
 *  |_____________|_________________|_______________________|
 *  |             | CRIOLLA         |          $8           |
 *  | PAPA        | PASTUSA         |          $9           |
 *  |             | SALENTUNA       |         $ 11          |
 *  |_____________|_________________|_______________________|
 *  |             | LARGA           |         $ 15          |
 *  | CEBOLLA     | DE HUEVO        |         $ 13          |
 *  |_____________|_________________|_______________________|
 *
 * @author Carabali Rivera Juan Pablo, Giraldo Patiño Carlos Andres,
 *         Valencia Romero Kevin Edilson, Reyes Cuero Walter Andres.
 */
public class VerdurasValor {

    public static int leerEntero (String pregunta)
    {
        return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    public static void imprimir(String texto)
    {
        JOptionPane.showMessageDialog(null, texto);
    }
    public static void resolverT(int opcion)
    {
        int semilla, valor = 0;
        
        switch(opcion){
            case 1: semilla = leerEntero("Cuantos semillas desea. ");
                    valor = semilla * 15;
                    break;
            case 2: semilla = leerEntero("Cuantos semillas desea. ");
                    valor = semilla * 20;
                    break;
            default: imprimir("Opcion invalida.");
                     break;
        }
        imprimir("El Valor total a pagar es de: $" + valor);
    }
    public static void resolverP(int opcion)
    {
        int semilla, valor = 0;
        
        switch(opcion){
            case 1: semilla = leerEntero("Cuantos semillas desea. ");
                    valor = semilla * 8;
                    break;
            case 2: semilla = leerEntero("Cuantos semillas desea. ");
                    valor = semilla * 9;
                    break;
            case 3: semilla = leerEntero("Cuantos semillas desea. ");
                    valor = semilla * 11;
                    break;
            default: imprimir("Opcion invalida.");
                     break;
        }
        imprimir("El Valor total a pagar es de: $" + valor);
    }
    public static void resolverC( int opcion)
    {
        int semilla, valor = 0 ;
        
        switch(opcion){
            case 1: semilla = leerEntero("Cuantos semillas desea. ");
                    valor = semilla * 15;
                    break;
            case 2: semilla = leerEntero("Cuantos semillas desea. ");
                    valor = semilla * 13;
                    break;
            default: imprimir("Opcion invalida.");
                     break;
        }
        imprimir("El valor total a pagar es de: $" + valor);
    }
    public static void procesarSubMenT()
    {
        String submenu;
        int opcion;
        
        submenu = "Tipo\n\n";
        submenu += "Marque 1. Chonto.\n";
        submenu += "Marque 2. Ensalada.";
       do{ 
        opcion = leerEntero( submenu );
         switch(opcion){
            case 1: resolverT(opcion);
                    break;
            case 2: resolverT(opcion);
                    break;
            default: imprimir("Opcion invalida");
                     break;
         }
       }while(opcion != 1 && opcion != 2);
    }
    public static void procesarSubMenP()
    {
        String submenu;
        int opcion;
        
        submenu = "Tipo\n\n";
        submenu += "Marque 1. Criolla.\n";
        submenu += "Marque 2. Pastusa.\n";
        submenu += "Marque 3. Salentuna.";
        
       do{
           
        opcion = leerEntero( submenu );
        
         switch ( opcion ){
            case 1: resolverP(opcion);
                    break;
            case 2: resolverP(opcion);
                    break;
            case 3: resolverP(opcion);
                    break;
            default: imprimir("Opcion invalida");
                     break;
         }
       }while(opcion != 1 && opcion != 2 && opcion != 3 );
    }
    public static void procesarSubMenC()
    {
        String submenu;
        int opcion;
        
        submenu = "Tipo\n\n";
        submenu += "Marque 1. Larga.\n";
        submenu += "Marque 2. De huevo.";
        
       do{ 
           
        opcion = leerEntero( submenu );
        
         switch(opcion){
            case 1: resolverC(opcion);
                    break;
            case 2: resolverC(opcion);
                    break;
            default: imprimir("Opcion invalida");
                     break;
         }
       }while(opcion != 1 && opcion !=2  );
    }
    public static void procesarMenu()
    {
        String menu;
        int opcion;
        
        menu = "LA SEMILLITA DE LA VERDURA CARABALYUS S.A\n\n";
        menu += "Marque 1. Tomate.\n";
        menu += "Marque 2. Papa.\n";
        menu += "Marque 3. Cebolla.\n";
        menu += "Marque 4. Salir.";
        
        do{
            
            opcion = leerEntero( menu );
            
            switch(opcion){
                case 1: procesarSubMenT();
                        break;
                case 2: procesarSubMenP();
                        break;
                case 3: procesarSubMenC();
                        break;
                case 4: imprimir("Muchas gracias por escogernos.");
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
