package projectfinal2;

import javax.swing.*;

/**
 *
 * @author Carabali Rivera Juan Pablo.
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
    
    
    
    public static void toPrintIntegers ( int[]array )
    {
        String departure;
        int i;
        
        departure = "Numero de veces escojido un blanco para jugar.\n\n";
        
        for(i=0; i < array.length; i++ )
        {
            departure +=  (i+1) + ". " + array[i];
            if(array[i]==1)
            {
                departure += " vez.\n";
            }
            else
            {
                departure += " veces.\n";
            }
        }
        
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
    
    
    
    public static String processStatics ( String[] names, int[] score, String[] games )
    {
        String departure;
        int i;
        
        departure = "";
        
        for( i = 0; i < names.length; i++ )
        {
            if( names[i] == null )
            {
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
                toPrintImage("Has acertado en la Linea Doble\n            "
                        + "Tu Puntaje es de: " + score, text,
                        "1.jpg");
                break;
            case 1:
                score = 10;
                toPrintImage("Has acertado en la Linea Singular\n         "
                        + "Tu puntaje es de: " + score, text, "2.jpg");
                break;
            case 2:
                score = 15;
                toPrintImage("Has acertado en la Linea Triple\n         "
                        + "Tu puntaje es de: " + score, text, "3.jpg");
                break;
            case 3:
                score = 30;
                toPrintImage("Has acertado en la Linea Sencillo\n         "
                        + "Tu puntaje es de: " + score, text, "4.jpg");
                break;
            case 4:
                score = 50;
                toPrintImage("Has acertado en la Bull Sencillo\n          "
                        + "Tu Puntajes es de: " + score, text, "5.jpg");
                break;
            case 5:
                score = 100;
                toPrintImage("Has acertado en la Bull Doble\n            "
                        + "Tu Puntaje es de: " + score, text, "6.jpg");
                break;
            default:
                score = 0;
                toPrintImage("Has fallado has dado fuera del blanco\n        "
                        + "Tu puntaje es de: " + score, text, "7.jpg");
                break;
        }
    }
    
    
    
    public static String processGameOver ( String name, int scoreFinal )
    {
        String game;
        
        game ="";
        
        if (scoreFinal <= 300) {
            toPrint("Nombre: " + name + "\nPuntaje: " + scoreFinal + 
                        "\nPARTIDA MALA.");
            return game += "PARTIDA MALA.";
        } else if (scoreFinal > 300 && scoreFinal <= 600) {
            toPrint("Nombre: " + name + "\nPuntaje: " + scoreFinal + 
                        "\nPARTIDA NORMAL");
            return game += "PARTIDA NORMAL.";
        } else {
            toPrint("Nombre: " + name + "\nPuntaje: " + scoreFinal + 
                        "\nPARTIDA BUENA");
            return game += "PARTIDA BUENA.";
        }

    }
    
    
    
    public static int processGame ( int i )
    {
        int  threw, score;
        
        
       
            threw = generateNumber(0, 6);
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
    
    
    
    /*public static void processStatics ( String[] name, int[] score, String[] games, int j )
    {
        int i;
        String statics;
        statics = "";
        for(i=0;i<j;i++)
        {
            statics += i+1 + "." + name[i] + " " + score[i] + " " + games[i] 
                    + "\n";
        }
        statics += i+1 + "." + name[i] + " " + score[i] + " " + games[i];
        
        toPrint( statics );
    }*/
    
    
    
    public static void processMenu ()
    {
        String menu, names[], games[], name, statics;
        int option,i,j,p,score,scoreFinal[],sum, targets[],target;
        
        menu = "Seleccione la opcion que deseea ejecutar.\n\n";
        menu += "Presione 1. Para Jugar.\n";
        menu += "Presione 2. Para ver Puntaje.\n";
        menu += "Presione 3. Para ver las estadisticas.\n";
        menu += "presione 4. Para Salir.";
        
        p = 1;
        i = 1;
        j = 0;
        score = 0;
        target=0;
        
        targets = new int[10];
        names = new String[5];
        scoreFinal = new int[5];
        games = new String[5];
        
        do{
            
            
            sum = score;
            
            if( p == 1 )
            {
                name = readString( "Nombre" );
                do
                {
                target = readInt( "Blancos disponibles [1 - 10] del 1 al 10 " );
                }while (target < 1 || target > 10 );
                
                targets[(target-1)] = +1;
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
                        i = 1;
                        p = 1 ;
                        score = 0;
                        j++;
                        
                    }
                    
                    break;
                
                case 2:
                    
                    toPrint("El puntaje acumulado en esta partida es de: " + 
                            score );
                    break;
                
                case 3:
                    statics = processStatics( names, scoreFinal, games );
                    toPrint( statics );
                    toPrintIntegers( targets );
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
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        processMenu();
    }
    
}
