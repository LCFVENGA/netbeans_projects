import javax.swing.JOptionPane;
/**
 * Proyecto para identificar el precio del lavado segun el tipo de auto, 
 * modelo y el tipo de vehiculo e imprimir el precio. Nota si el carro tiene mas 
 * de 8 años o mas, el costo se incrementa un 20% 
 * ______________________________________________________
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
 *         Valencia Romero Kevin Edilson.
 *         
 */
public class PrecioLavaAutosCondicion {

    /**
     * Metodo para leer un entero
     * @param pregunta es la pregunta que se le va a hacer al usuario
     * @return es el numero dado por el usuario.
     */
    public static int leerEntero( String pregunta )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( pregunta ));
    }
    /**
     * Metodo para mostrar un mensaje 
     * @param texto es el mensaje que queremos mostrar
     */
    public static void imprimir( String texto )
    {
        JOptionPane.showMessageDialog( null, texto );
    }
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
     int pregunta1, pregunta2, pregunta3, valor;

     imprimir("Lava Autos Carabalyus S.A");
     imprimir("A la hora de escojer porfavor solo presiona el numero "
             + "correspondiente");
     pregunta1 = leerEntero("Que Tipo de vehiculo es: \n 1. Automovil." + 
             "\n 2. Campero \n 3. Camioneta.");
     if( pregunta1 == 1 ){
         pregunta2 = leerEntero("Es: \n 1. Pequeño \n 2. Mediano \n 3. De lujo");
         if(pregunta2 == 1 ){
             pregunta3 = leerEntero("Cuantos años tiene Actualmente su carro ?");
             if( pregunta3 >= 8 ){
                valor = 16000 + ( 16000 * 20 ) / 100;
                imprimir("El Valor Total a Pagar es: $" + valor);
             }
             else{
                 valor = 16000;
                 imprimir("El Valor Total a Pagar es: $" + valor);
             }
         }
       if(pregunta2 == 2 ){
             pregunta3 = leerEntero("Cuantos años tiene Actualmente su carro ?");
             if( pregunta3 >= 8 ){
                valor = 20000 + ( 20000 * 20 ) / 100;
                imprimir("El Valor Total a Pagar es: $" + valor);
             }
             else{
                 valor = 20000;
                 imprimir("El Valor Total a Pagar es: $" + valor);
             }
         
      }
       if(pregunta2 == 3 ){
             pregunta3 = leerEntero("Cuantos años tiene Actualmente su carro ?");
             if( pregunta3 >= 8 ){
                valor = 27000 + ( 27000 * 20 ) / 100;
                imprimir("El Valor Total a Pagar es: $" + valor);
             }
             else{
                 valor = 27000;
                 imprimir("El Valor Total a Pagar es: $" + valor);
             }
    }
    
 }
     if( pregunta1 == 2 ){
         pregunta2 = leerEntero("Es: \n 1. Sencillo. \n 2. De lujo.");
         if(pregunta2 == 1 ){
             pregunta3 = leerEntero("Cuantos años tiene Actualmente su carro ?");
             if( pregunta3 >= 8 ){
                valor = 22000 + ( 22000 * 20 ) / 100;
                imprimir("El Valor Total a Pagar es: $" + valor);
             }
             else{
                 valor = 22000;
                 imprimir("El Valor Total a Pagar es: $" + valor);
             }
         }
       if(pregunta2 == 2 ){
             pregunta3 = leerEntero("Cuantos años tiene Actualmente su carro ?");
             if( pregunta3 >= 8 ){
                valor = 32000 + ( 32000 * 20 ) / 100;
                imprimir("El Valor Total a Pagar es: $" + valor);
             }
             else{
                 valor = 32000;
                 imprimir("El Valor Total a Pagar es: $" + valor);
             }
         
      }
}
     if( pregunta1 == 3 ){
         pregunta2 = leerEntero("Es: \n 1. Sencillo. \n 2. Doble Cabina. ");
         if(pregunta2 == 1 ){
             pregunta3 = leerEntero("Cuantos años tiene Actualmente su carro ?");
             if( pregunta3 >= 8 ){
                valor = 30000 + ( 30000 * 20 ) / 100;
                imprimir("El Valor Total a Pagar es: $" + valor);
             }
             else{
                 valor = 30000;
                 imprimir("El Valor Total a Pagar es: $" + valor);
             }
         }
       if(pregunta2 == 2 ){
             pregunta3 = leerEntero("Cuantos años tiene Actualmente su carro ?");
             if( pregunta3 >= 8 ){
                valor = 35000 + ( 35000 * 20 ) / 100;
                imprimir("El Valor Total a Pagar es: $" + valor);
             }
             else{
                 valor = 35000;
                 imprimir("El Valor Total a Pagar es: $" + valor);
                 
             }
         
      }
     }
     
     imprimir("Gracias por Venir");
     imprimir("¡¡Vuelva Pronto!!");
    
   }
    
    
}