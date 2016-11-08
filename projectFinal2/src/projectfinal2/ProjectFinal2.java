package projectfinal2;

import javax.swing.*;

/**
 * Este juego es un programa donde el jugador prueba su suerte al intentar
 * obtener el mayor puntaje posible haciendo lanzamientos de flechas hacia el
 * blanco con sus respectivas divisiones y puntuaciones especificas.
 * En estaa version contamos con 10 blancos distintos con sus respectivos
 * puntajes mostrando el mas alto y el mas bajo de estos asi mismo lo hacemos
 * en general, ademas por cada partida obtendremos una ganancia de 15000
 *
 * Institucion: Univerdad del Quindio. 
 * Facultad de ingenieria. 
 * Programa: Ingenieria de sistemas y computacion. 
 * Asignatura: Paradigma orientada a objetos. 
 * Fecha de Entrega: noviembre 9 2016. 
 * Profesor: Julian Esteban Gutierrez Posada.
 *
 * @author Carabali Rivera Juan Pablo.
 * @author Moral Londoño Yael Sebastian.                           
 * 
 */
public class ProjectFinal2 {

    
    /**
     * Metodo para leer un entero 
     * @param question es la pregunta que se le hace al jugador
     * @return es el numero que ingresa el jugador como respuesta
     */
    public static int readInt( String question )
    {
        while ( true )
        {
            try
            {
              return Integer.parseInt(JOptionPane.showInputDialog(question));
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog(null,"Error, Ingrese un número"
                        + ".","Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    /**
     * Metodo para imprimir un texto.
     * @param text es el texto que se va imprimir.
     */
    public static void toPrint ( String text )
    {
        JOptionPane.showMessageDialog( null, text );
    }
    
    
    
    
    /**
     * Metodo para leer un texto.
     * @param question es la pregunta que se le hace al usuario.
     * @return nos retorna el texto que el jugador da como respuesta.
     */
    public static String readString ( String question )
    {
        return JOptionPane.showInputDialog ( question );
    }
    
    
    /**
     * Metodo para imprimir un arreglo de numeros
     * @param array 
     * @param score0 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°1.
     * @param score1 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°2.
     * @param score2 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°3.
     * @param score3 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°4.
     * @param score4 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°5.
     * @param score5 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°6.
     * @param score6 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°7.
     * @param score7 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°8.
     * @param score8 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°9.
     * @param score9 en este se encuentran el puntaje mas alto y mas
     *               bajo de el blaco N°10.
     * @param scoreFinalT en este se encuentran el puntaje mas alto y mas
     *               bajo del club en general.
     * @param goodGames son las personas por blanco que obtuvieron buena 
     *                  partida superando los 600 puntos.
     */
    public static void toPrintIntegers ( int[]array,String[]score0,
            String[]score1,String[]score2,String[]score3,String[]score4,
            String[]score5,String[]score6,String[]score7,String[]score8,
            String[]score9,String[] scoreFinalT,int[] goodGames )
    {
        String departure;
        int i,j=0,sum=0,k;
        
        departure = "Numero de veces escojido un blanco para jugar.\n\n";
    
        for( i=0; i < array.length; i++ )
        {
            departure +=  ( i + 1 ) + ". " + array[i];
            if( array[i] == 1 )
            {
                departure += " vez. Dinero total: "+( array[i]* 15000 )
                        +", "+goodGames[i]+" jugadores tuvieron una "
                        + "buena partida."+"\n";
            }
            else
            {
                departure += " veces. Dinero total: "+
                        ( array[i]* 15000 )+", "+goodGames[i]+" jugadores "
                        + "tuvieron una buena partida."+"\n";
            }
            switch(j)
            {
                case 0: 
                    if( score0[0] != null )
                    {
                        departure += score0[0];
                        departure += score0[1] + "\n";
                    }
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                        
                case 1: 
                    if( score1[0] != null )
                    {
                        departure += score1[0];
                        departure += score1[1] + "\n";
                    }   
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                
                case 2: 
                    if( score2[0] != null )
                    {
                        departure += score2[0];
                        departure += score2[1] + "\n";
                    }
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                        
                case 3: 
                    if( score3[0] != null )
                    {
                        departure += score3[0];
                        departure += score3[1] + "\n";
                        
                    }   
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                case 4: 
                    if( score4[0] != null )
                    {
                        departure += score4[0];
                        departure += score4[1] + "\n";
                    }
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                        
                case 5: 
                    if( score5[0] != null )
                    {
                        departure += score5[0];
                        departure += score5[1] + "\n";
                    }
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                        
                case 6: 
                    if( score6[0] != null )
                    {
                        departure += score6[0];
                        departure += score6[1] + "\n";
                    }
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                        
                case 7: 
                    if( score7[0] != null )
                    {
                        departure += score7[0];
                        departure += score7[1] + "\n";
                    }
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                        
                case 8: 
                    if( score8[0] != null )
                    {
                        departure += score8[0];
                        departure += score8[1] + "\n";
                    }
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                        
                case 9: 
                    if( score9[0] != null )
                    {
                        departure += score9[0];
                        departure += score9[1] + "\n";
                    }
                    else
                    {
                        departure += "Puntaje Mayor: 0\nPuntaje Menor: 0"
                                + "\n";
                    }
                        break;
                        
                default:
                    break;
              
            }
            j++;
           
            
        }
        for(k=0; k<array.length; k++ )
            {
                sum+= array[k];
            }
        if( scoreFinalT[0] != null )
        {
            departure += "\nEl puntaje mas alto y mas bajo en general.\n";
            departure += scoreFinalT[0];
            departure += scoreFinalT[1];
            departure += "\nTotal de jugadores en todo el club es de: " +
                    sum + "\nEl dinero total recaudado es: " + (sum * 15000);
        }
        else
        {
            departure += "\nEl puntaje mas alto y mas bajo en general.\n";
            departure += "Puntaje Mayor: 0 , Puntaje Menor: 0";
            departure += "\nTotal de jugadores en todo el club es de: " +
                    sum + "\nEl dinero total recaudado es: " + (sum * 15000);
        }
        toPrint( departure );
    }
    
    
    /**
     * Metodo para imprimir una imagen.
     * @param text es el texto que se mostrara en la imagen.
     * @param type es el texto que aparece en la barra superior de la
     *             ventana que sale con la imagen.
     * @param image es la imagen que vamos a mostrar.
     */
    public static void toPrintImage (String text, String type, String image)
    {
        JOptionPane.showMessageDialog( null, text, type, JOptionPane.
                INFORMATION_MESSAGE,new ImageIcon(ProjectFinal2.class.
                        getResource( image )));
    }
    
    
    
    /**
     * Metodo para procesar la tabla de puntajes de todos los jugadores
     *        que han jugado en el club
     * @param names es el nombre del jugador
     * @param score es el puntaje del jugador
     * @param games es donde se encuentra de como le fue al jugador al 
     *              terminar la partida bien, mal o normal.
     * @param money es el dinero que recauda el club por cada jugador o 
     *              cada partida para ser mas especificos.
     * @param j es la cantidad de jugadores en total en el juego.
     * @return nos retorna una cadena de de textos con todos los datos
     *         dados.
     */
    public static String processStatics ( String[] names, int[] score, 
                                        String[] games, int money, int j )
    {
        String departure;
        int i;
        
        departure = "   Puntajes de los jugadores.\n\n";
        departure += "N° de jugadores en total: " + j + "\n";
        
        
        for( i = 0; i < names.length; i++ )
        {
            if( names[i] == null )
            {
                return departure;
            }
            if ( games[i] == null )
            {
                departure += i + 1 + "."+names[i] + ": no a terminado la "
                        + "partida";
                departure += "\n";
            }
            else
            {
            departure += i + 1 + "."+names[i] + " Puntaje: " + score[i] + " "
                    + games[i];
            departure += "\n";
            }            
        }
        
        
        
        
        return departure;
    }
    
    
 
    /**
     * Metodo para generar un numero aleatorio entre un rango dado.
     * @param min es el numero menor del rango dado.
     * @param max es el numero mayor del rango dado.
     * @return nos retorna un numero entre el rango dado.
     */
    public static int generateNumber ( int min, int max )
    {
        int number = ( int ) ( Math.random() * ( min - ( max + 1 )) + 
                ( max + 1 ));
        
        return number;
    
    }
    
    
    /**
     * Metodo para procesar el tiro e identificar la imagen y en donde a 
     * caido el tiro ejecutado.
     * @param threw este es el lugar en donde cae el lanzamiento.
     * @param text es el texto que sale en la barra de la venta superior.
     */
    public static void processThrew ( int threw, String text )
    {
        int score;

        switch ( threw ) {
            case 0:
                score = 5;
                toPrintImage( "Has acertado en la Linea Doble\n            "
                        + "Tu Puntaje es de: " + score, text,
                        "1.jpg" );
                break;
            case 1:
                score = 10;
                toPrintImage( "Has acertado en la Linea Singular\n         "
                        + "Tu puntaje es de: " + score, text, "2.jpg" );
                break;
            case 2:
                score = 15;
                toPrintImage( "Has acertado en la Linea Triple\n         "
                        + "Tu puntaje es de: " + score, text, "3.jpg" );
                break;
            case 3:
                score = 30;
                toPrintImage( "Has acertado en la Linea Sencillo\n         "
                        + "Tu puntaje es de: " + score, text, "4.jpg" );
                break;
            case 4:
                score = 50;
                toPrintImage( "Has acertado en la Bull Sencillo\n          "
                        + "Tu Puntajes es de: " + score, text, "5.jpg" );
                break;
            case 5:
                score = 100;
                toPrintImage( "Has acertado en la Bull Doble\n            "
                        + "Tu Puntaje es de: " + score, text, "6.jpg" );
                break;
            default:
                score = 0;
                toPrintImage( "Has fallado has dado fuera del blanco\n      "
                        + "  Tu puntaje es de: " + score, text, "7.jpg" );
                break;
        }
    }
    
    
    /**
     * Metodo para ejecutar o avisar al jugador que a terminado la partida
     * @param name nombre del jugador.
     * @param scoreFinal es el puntaje total que saco el jugador en la
     *                   partida
     * @return retorna el resultado de la partida.
     */
    public static String processGameOver ( String name, int scoreFinal )
    {
        String game;
        
        game = "";
        
        if ( scoreFinal <= 300 ) 
        {
            toPrint( "Nombre: " + name + "\nPuntaje: " + scoreFinal + 
                        "\nPARTIDA MALA." );
            return game += "PARTIDA MALA.";
        } 
        else if ( scoreFinal > 300 && scoreFinal <= 600 ) 
        {
            toPrint( "Nombre: " + name + "\nPuntaje: " + scoreFinal + 
                        "\nPARTIDA NORMAL" );
            return game += "PARTIDA NORMAL.";
        }
        else 
        {
            toPrint( "Nombre: " + name + "\nPuntaje: " + scoreFinal + 
                        "\nPARTIDA BUENA" );
            return game += "PARTIDA BUENA.";
        }

    }
    
    
    /**
     * Merodo para saber cuanto saco de puntaje en el tiro indicado.
     * @param i es el tiro o lanzamieto qu se va a ejecutar a continuacion.
     * @return devuelve el putaje que saco el jugaodor en ese tiro
     */
    public static int processGame ( int i )
    {
        int  threw, score;
        
        
       
            threw = generateNumber( 0, 6 );
            processThrew ( threw, "Tiro " + i );
            switch ( threw ) {
                case 0:
                    score = 5;
                    break;
                case 1:
                    score = 10;
                    break;
                case 2:
                    score = 15;
                    break;
                case 3:
                    score = 30;
                    break;
                case 4:
                    score = 50;
                    break;
                case 5:
                    score = 100;
                    break;
                default:
                    score = 0;
                    break;
            }

        

        return score;
    }
    
   
    /**
     * Metodo por el cual me va a procesar el menu ademas tambien tiene 
     * otras operaciones internas que van a ayudar al juego el conteo
     * de jugadores puntaje entre otros.
     */
    public static void processMenu ()
    {
        String menu, names[], games[], name, statics;
        int option, i, j, p, score, scoreFinal[], sum, target, score0[];
        int money, score1[], score2[], score3[], score4[], score5[], 
                score6[], goodGames[], k;
        int score7[], score8[], score9[],a, targets[], max, min;
        String[] target1, target2, target3, target4, target5, target6, 
                target7,target8, target9, target10, scoreFinalT;
        
        menu = "Seleccione la opcion que deseea ejecutar.\n\n";
        menu += "Presione 1. Para Jugar.\n";
        menu += "Presione 2. Para ver Puntaje.\n";
        menu += "Presione 3. Para ver las estadisticas.\n";
        menu += "presione 4. Para Salir.";
        
        
        p = 1;
        i = 1;
        j = 0;
        k=0;
        score = 0;
        target = 0;
        money = 0;
        max = 0;
        min = 1000;
        
        goodGames = new int[ 10 ];
        scoreFinalT = new String[ 2 ];
        targets = new int[ 10 ];
        names = new String[ 200 ];
        scoreFinal = new int[ 200 ];
        games = new String[ 200 ];
        score0 = new int[2];
        score0[1] = 100000;
        score1 = new int[2];
        score1[1] = 100000;
        score2 = new int[2];
        score2[1] = 100000;
        score3 = new int[2];
        score3[1] = 100000;
        score4 = new int[2];
        score4[1] = 100000;
        score5 = new int[2];
        score5[1] = 100000;
        score6 = new int[2];
        score6[1] = 100000;
        score7 = new int[2];
        score7[1] = 100000;
        score8 = new int[2];
        score8[1] = 100000;
        score9 = new int[2];
        score9[1] = 100000;
        target1 = new String[2];
        target2 = new String[2];
        target3 = new String[2];
        target4 = new String[2];
        target5 = new String[2];
        target6 = new String[2];
        target7 = new String[2];
        target8 = new String[2];
        target9 = new String[2];
        target10 = new String[2];
        
        do{
            
            
            sum = score;
            
            if( p == 1 )
            {
                
                name = readString( "Nombre" );
                do
                {
                target=readInt("Blancos disponibles [1 - 10] del 1 al 10 ");
                }while ( target < 1 || target > 10 );
                money+=15000;
                targets[ target - 1 ] += 1;
                names[j] = name;
                p++;
                k++;
               
            }
            option = readInt ( menu );
        
            switch ( option )
            {
                case 1:
               
                    score = processGame( i );
                    score += sum;
                    i++;
                    
                    if( i > 10 )
                    {
                        
                        scoreFinal[j] = score;
                        games[j] = processGameOver(names[j] ,scoreFinal[j]);
                        if(max<scoreFinal[j])
                        {
                            max = scoreFinal[j];
                            scoreFinalT[0]= "Nombre: "+names[j]+", puntaje "
                                    + "mayor: " + max + "\n";
                        }
                        if(min>scoreFinal[j])
                        {
                            min = scoreFinal[j];
                            scoreFinalT[1]= "Nombre: "+names[j]+", puntaje "
                                    + "minimo: " + min;
                        }
                        i = 1;
                        p = 1 ;
                        switch ( target - 1 )
                        {
                            case 0: a = scoreFinal[j];
                            if(scoreFinal[j] > score0[0])
                            {
                                score0[0] = scoreFinal[j];
                                target1[0] = "Nombre: "+names[j]+", Puntaje"
                                        + " mayor: " + score0[0] + "\n";
                            }
                            if( scoreFinal[j] < score0[1] )
                            {
                                score0[1] = scoreFinal[j];
                                target1[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje Menor: " + score0[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[0] = goodGames[0] + 1;
                            }
                                
                            break;
                            
                            case 1: a = scoreFinal[j];
                            if( scoreFinal[j] > score1[0] )
                            {
                                score1[0] = scoreFinal[j];
                                target2[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score1[0]+"\n";
                            }
                            if( scoreFinal[j] < score1[1] )
                            {
                                score1[1] = scoreFinal[j];
                                target2[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: " + score1[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[1] = goodGames[1] + 1;
                            }
                            break;
                            
                            case 2: a = scoreFinal[j];
                            if( scoreFinal[j] > score2[0] )
                            {
                                score2[0] = scoreFinal[j];
                                target3[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score2[0]+"\n";
                            }
                            if( scoreFinal[j] < score2[1] )
                            {
                                score2[1] = scoreFinal[j];
                                target3[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: "+ score2[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[2] = goodGames[2] + 1;
                            }
                            break;
                            case 3: a = scoreFinal[j];
                            if( scoreFinal[j] > score3[0] )
                            {
                                score3[0] = scoreFinal[j];
                                target4[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score3[0]+"\n";
                            }
                            if( scoreFinal[j] < score3[1] )
                            {
                                score3[1] = scoreFinal[j];
                                target4[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: " + score3[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[3] = goodGames[3] + 1;
                            }
                            break;
                            case 4: a = scoreFinal[j];
                            if( scoreFinal[j] > score4[0] )
                            {
                                score4[0] = scoreFinal[j];
                                target5[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score4[0]+"\n";
                            }
                            if( scoreFinal[j] < score4[1] )
                            {
                                score4[1] = scoreFinal[j];
                                target5[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: " + score4[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[4] = goodGames[4] + 1;
                            }
                            break;
                            
                            case 5: a = scoreFinal[j];
                            if( scoreFinal[j] > score5[0] )
                            {
                                score5[0] = scoreFinal[j];
                                target6[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score5[0]+"\n";
                            }
                            if( scoreFinal[j] < score5[1] )
                            {
                                score5[1] = scoreFinal[j];
                                target6[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: " + score5[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[5] = goodGames[5] + 1;
                            }
                            break;
                            
                            case 6: a = scoreFinal[j];
                            if( scoreFinal[j] > score6[0] )
                            {
                                score6[0] = scoreFinal[j];
                                target7[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score6[0]+"\n";
                            }
                            if( scoreFinal[j] < score6[1] )
                            {
                                score6[1] = scoreFinal[j];
                                target7[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: " + score6[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[6] = goodGames[6] + 1;
                            }
                            break;
                            
                            case 7: a = scoreFinal[j];
                            if( scoreFinal[j] > score7[0] )
                            {
                                score7[0] = scoreFinal[j];
                                target8[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score7[0]+"\n";
                            }
                            if( scoreFinal[j] < score7[1] )
                            {
                                score7[1] = scoreFinal[j];
                                target8[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: " + score7[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[7] = goodGames[7] + 1;
                            }
                            break;
                            
                            case 8: a = scoreFinal[j];
                            if( scoreFinal[j] > score8[0] )
                            {
                                score8[0] = scoreFinal[j];
                                target9[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score8[0]+"\n";
                            }
                            if( scoreFinal[j] < score8[1] )
                            {
                                score8[1] = scoreFinal[j];
                                target9[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: " + score8[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[8] = goodGames[8] + 1;
                            }
                            break;
                            
                            case 9: a = scoreFinal[j];
                            if( scoreFinal[j] > score9[0] )
                            {
                                score9[0] = scoreFinal[j];
                                target10[0] = "Nombre: " + names[j] + ", "
                                        + "Puntaje mayor: "+score9[0]+"\n";
                            }
                            if( scoreFinal[j] < score9[1] )
                            {
                                score9[1] = scoreFinal[j];
                                target10[1] = "Nombre: " + names[j] + ", "
                                        + "Puntaje menor: " + score9[1];
                            }
                            if( a > 600 )
                            {
                                goodGames[9] = goodGames[9] + 1;
                            }
                            break;
                            
                            default: 
                                break;
                        }
                        score = 0;
                        j++;
                        do
                        {
                        option = readInt("Que desea hacer a continuacion\n\n"
                             + "1. Volver a comenzar.\n2. Retirase en el "
                             + "juego.\n3. Ver estadisticas.\n4. salir de la"
                             + " aplicacion.");
                        if( option == 1 )
                        {
                            money+=15000;
                            names[j]=names[j-1];
                            targets[target - 1] += 1; 
                            p++;
                            k++;
                        }
                        if( option == 3 )
                        {
                            statics = processStatics(names,scoreFinal,games, 
                                    money, k );
                            toPrint( statics );
                            toPrintIntegers( targets,target1,target2,target3,
                                    target4,target5,target6,target7,target8,
                                    target9,target10,scoreFinalT,goodGames);
                        }
                        if ( option > 4 )
                        {
                            toPrint("Opcion Invalida.");
                        }
                        }while( option == 3 || option > 4 );
                        
                    }
                    
                    break;
                
                case 2:
                    
                    toPrint( "El puntaje acumulado en esta partida es de: "+ 
                            score );
                    break;
                
                case 3:
                    statics = processStatics(names,scoreFinal,games,money,k);
                    toPrint( statics );
                    toPrintIntegers( targets,target1,target2,target3,
                                   target4,target5,target6,target7,target8,
                                   target9,target10,scoreFinalT,goodGames);
                    break;
                
                case 4: 
                    break;
                
                default:
                    toPrint ( "Opcion invalida." );
                    break;
            }
        }while ( option != 4 );
    }
    
    
    
    /**
     * @param args linea de comandos.
     * 
     */
    public static void main( String[] args ) {
        
        processMenu();
        
    }
    
}
