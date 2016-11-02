package projectfinal2;

import javax.swing.*;

/**
 * Este juego es un programa donde el jugador prueba su suerte al intentar
 * obtener el mayor puntaje posible haciendo lanzamientos de flechas hacia el
 * blanco con sus respectivas divisiones y puntuaciones especificas.
 *
 * Institucion: Univerdad del Quindio. 
 * Facultad de ingenieria. 
 * Programa: Ingenieria de sistemas y computacion. 
 * Asignatura: Paradigma orientada a objetos. 
 * Fecha de Entrega: noviembre 9 2016. 
 * Profesor: Julian Esteban Gutierrez Posada.
 *
 * @author Carabali Rivera Juan Pablo.
 * @author 
 * 
 */
public class ProjectFinal2 {

    
    
    public static int readInt( String question )
    {
        while ( true )
        {
            try
            {
                return Integer.parseInt(JOptionPane.showInputDialog( question ));
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( null, "Error, Ingrese un número."
                ,"Ventana de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    
    public static void toPrint ( String text )
    {
        JOptionPane.showMessageDialog( null, text );
    }
    
    
    
    
    
    public static String readString ( String question )
    {
        return JOptionPane.showInputDialog ( question );
    }
    
    
    
    public static void toPrintIntegers ( int[]array,String[]score0,String[]score1,
            String[]score2,String[]score3,String[]score4,String[]score5,String[]score6,
            String[]score7,String[]score8,String[]score9,String[] scoreFinalT )
    {
        String departure;
        int i,j=0;
        
        departure = "Numero de veces escojido un blanco para jugar.\n\n";
        
        for( i=0; i < array.length; i++ )
        {
            departure +=  ( i + 1 ) + ". " + array[i];
            if( array[i] == 1 )
            {
                departure += " vez.\n";
            }
            else
            {
                departure += " veces.\n";
            }
            switch(j)
            {
                case 0: departure += score0[0];
                        departure += score0[1] + "\n";
                        break;
                        
                case 1: departure += score1[0];
                        departure += score1[1] + "\n";
                        break;
                
                case 2: departure += score2[0];
                        departure += score2[1] + "\n";
                        break;
                        
                case 3: departure += score3[0];
                        departure += score3[1] + "\n";
                        break;
                        
                case 4: departure += score4[0];
                        departure += score4[1] + "\n";
                        break;
                        
                case 5: departure += score5[0];
                        departure += score5[1] + "\n";
                        break;
                        
                case 6: departure += score6[0];
                        departure += score6[1] + "\n";
                        break;
                        
                case 7: departure += score7[0];
                        departure += score7[1] + "\n";
                        break;
                        
                case 8: departure += score8[0];
                        departure += score8[1] + "\n";
                        break;
                        
                case 9: departure += score9[0];
                        departure += score9[1] + "\n";
                        break;
                        
                default:
                    break;
              
            }
            j++;
           
            
        }
        departure += "\nEl puntaje mas alto y mas bajo en general.\n";
        departure += scoreFinalT[0];
        departure += scoreFinalT[1];
        toPrint( departure );
    }
    
    
    
    public static void toPrintImage ( String text, String type, String image )
    {
        JOptionPane.showMessageDialog( null, text, type, JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(ProjectFinal2.class.getResource( image )));
    }
    
    
    
    public static String[] readStrings ( String question, int quantity, int position )
    {
        String strings[];
        
        
        strings = new String[ quantity ];
        
        while( position < quantity )
        {
            strings[ position ] = readString ( question );
        }
        
        return strings;
        
    }
    
    
    
    public static String processStatics ( String[] names, int[] score, String[] games, int money )
    {
        String departure;
        int i;
        
        departure = "";
        
        for( i = 0; i < names.length; i++ )
        {
            if( names[i] == null )
            {
                departure += "Dinero total: " + money;
                return departure;
            }
            departure += i + 1 + "." + names[i] + " Puntaje: " + score[i] + " "
                    + games[i];
            departure += "\n";
            
        }
        
        
        
        
        return departure;
    }
    
    
    
    public static int[] readIntegers ( int quantity, int position, int score )
    {
        int number[];
        
        number = new int[ quantity ];
        
        while( position < quantity )
        {
            number[ position ] = score;
        }
        
        return number;
        
    }
    
    
    
    public static int generateNumber ( int min, int max )
    {
        int number = ( int ) ( Math.random() * ( min - ( max + 1 )) + ( max + 1 ));
        
        return number;
    
    }
    
    
    
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
                toPrintImage( "Has fallado has dado fuera del blanco\n        "
                        + "Tu puntaje es de: " + score, text, "7.jpg" );
                break;
        }
    }
    
    
    
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
    
    
    
    public static int[] burbuja ( int integers[] )            

    {
        

        for( int i = 0; i < integers.length - 1; i++ )

        {

            for( int j = 0; j < integers.length - 1; j++ )

            {

                if ( integers[j] < integers[j + 1] )

                {

                    int tmp = integers[j + 1];

                    integers [j+1] = integers[j];
                    integers[j] = tmp;

                }

            }

        }

        return integers;

    }
    
    
    
    public static void processMenu ()
    {
        String menu, names[], games[], name, statics;
        int option, i, j, p, score, scoreFinal[], sum, target, score0[];
        int money, score1[], score2[], score3[], score4[], score5[], score6[];
        int score7[], score8[], score9[],a, targets[], max, min;
        String[] target1, target2, target3, target4, target5, target6, target7, 
                target8, target9, target10, scoreFinalT;
        
        menu = "Seleccione la opcion que deseea ejecutar.\n\n";
        menu += "Presione 1. Para Jugar.\n";
        menu += "Presione 2. Para ver Puntaje.\n";
        menu += "Presione 3. Para ver las estadisticas.\n";
        menu += "presione 4. Para Salir.";
        
        
        a = 0;
        p = 1;
        i = 1;
        j = 0;
        score = 0;
        target = 0;
        money = 0;
        max = 0;
        min = 1000;
        
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
                target = readInt( "Blancos disponibles [1 - 10] del 1 al 10 " );
                }while ( target < 1 || target > 10 );
                money+=15000;
                targets[ target - 1 ] += 1;
                names[j] = name;
                p++;
               
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
                        games[j] = processGameOver( names[j] , scoreFinal[j] );
                        if(max<scoreFinal[j])
                        {
                            max = scoreFinal[j];
                            scoreFinalT[0]= "Nombre: " + names[j] + ", puntaje "
                                    + "mayor: " + max + "\n";
                        }
                        if(min>scoreFinal[j])
                        {
                            min = scoreFinal[j];
                            scoreFinalT[1]= "Nombre: " + names[j] + ", puntaje "
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
                                target1[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score0[0] + "\n";
                            }
                            if( scoreFinal[j] < score0[1] )
                            {
                                score0[1] = scoreFinal[j];
                                target1[1] = "Nombre: " + names[j] + ", Puntaje Menor: "
                                        + score0[1];
                            }
                                
                            break;
                            
                            case 1: a = scoreFinal[j];
                            if( scoreFinal[j] > score1[0] )
                            {
                                score1[0] = scoreFinal[j];
                                target2[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score1[0] + "\n";
                            }
                            if( scoreFinal[j] < score1[1] )
                            {
                                score1[1] = scoreFinal[j];
                                target2[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score1[1];
                            }
                            break;
                            
                            case 2: a = scoreFinal[j];
                            if( scoreFinal[j] > score2[0] )
                            {
                                score2[0] = scoreFinal[j];
                                target3[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score2[0] + "\n";
                            }
                            if( scoreFinal[j] < score2[1] )
                            {
                                score2[1] = scoreFinal[j];
                                target3[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score2[1];
                            }
                            break;
                            case 3: a = scoreFinal[j];
                            if( scoreFinal[j] > score3[0] )
                            {
                                score3[0] = scoreFinal[j];
                                target4[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score3[0] + "\n";
                            }
                            if( scoreFinal[j] < score3[1] )
                            {
                                score3[1] = scoreFinal[j];
                                target4[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score3[1];
                            }
                            break;
                            case 4: a = scoreFinal[j];
                            if( scoreFinal[j] > score4[0] )
                            {
                                score4[0] = scoreFinal[j];
                                target5[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score4[0] + "\n";
                            }
                            if( scoreFinal[j] < score4[1] )
                            {
                                score4[1] = scoreFinal[j];
                                target5[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score4[1];
                            }
                            break;
                            
                            case 5: a = scoreFinal[j];
                            if( scoreFinal[j] > score5[0] )
                            {
                                score5[0] = scoreFinal[j];
                                target6[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score5[0] + "\n";
                            }
                            if( scoreFinal[j] < score5[1] )
                            {
                                score5[1] = scoreFinal[j];
                                target6[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score5[1];
                            }
                            break;
                            
                            case 6: a = scoreFinal[j];
                            if( scoreFinal[j] > score6[0] )
                            {
                                score6[0] = scoreFinal[j];
                                target7[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score6[0] + "\n";
                            }
                            if( scoreFinal[j] < score6[1] )
                            {
                                score6[1] = scoreFinal[j];
                                target7[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score6[1];
                            }
                            break;
                            
                            case 7: a = scoreFinal[j];
                            if( scoreFinal[j] > score7[0] )
                            {
                                score7[0] = scoreFinal[j];
                                target8[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score7[0] + "\n";
                            }
                            if( scoreFinal[j] < score7[1] )
                            {
                                score7[1] = scoreFinal[j];
                                target8[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score7[1];
                            }
                            break;
                            
                            case 8: a = scoreFinal[j];
                            if( scoreFinal[j] > score8[0] )
                            {
                                score8[0] = scoreFinal[j];
                                target9[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score8[0] + "\n";
                            }
                            if( scoreFinal[j] < score8[1] )
                            {
                                score8[1] = scoreFinal[j];
                                target9[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score8[1];
                            }
                            break;
                            
                            case 9: a = scoreFinal[j];
                            if( scoreFinal[j] > score9[0] )
                            {
                                score9[0] = scoreFinal[j];
                                target10[0] = "Nombre: " + names[j] + ", Puntaje mayor: "
                                        + score9[0] + "\n";
                            }
                            if( scoreFinal[j] < score9[1] )
                            {
                                score9[1] = scoreFinal[j];
                                target10[1] = "Nombre: " + names[j] + ", Puntaje menor: "
                                        + score9[1];
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
                                + "1. Volver a comenzar.\n2. Retirase en el juego.\n"
                                + "3. Ver estadisticas.\n4. salir de la aplicacion.");
                        if( option == 1 )
                        {
                            money+=15000;
                            names[j]=names[j-1];
                            targets[target - 1] += 1; 
                            p++;
                        }
                        if( option == 3 )
                        {
                            statics = processStatics( names, scoreFinal, games, money );
                            toPrint( statics );
                            toPrintIntegers( targets,target1,target2,target3,
                                    target4,target5,target6,target7,target8,
                                    target9,target10,scoreFinalT);
                        }
                        }while( option == 3 );
                        
                    }
                    
                    break;
                
                case 2:
                    
                    toPrint( "El puntaje acumulado en esta partida es de: " + 
                            score );
                    break;
                
                case 3:
                    statics = processStatics( names, scoreFinal, games, money );
                    toPrint( statics );
                    toPrintIntegers( targets,target1,target2,target3,
                                    target4,target5,target6,target7,target8,
                                    target9,target10,scoreFinalT);
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
