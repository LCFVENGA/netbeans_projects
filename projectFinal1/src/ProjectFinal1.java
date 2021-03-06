
import javax.swing.*;

/**
 * Este juego es un programa donde el jugador prueba su suerte al intentar
 * obtener el mayor puntaje posible haciendo lanzamientos de flechas hacia el
 * blanco con sus respectivas divisiones y puntuaciones especificas.
 *
 * Institucion: Univerdad del Quindio. Facultad de ingenieria Programa:
 * Ingenieria de sistemas y computacion. Asignatura: Paradigma orientada a
 * objetos. Fecha de Entrega: octubre 7 2016. Profesor: Julian Esteban Gutierrez
 * Posada.
 *
 * @author Carabali Rivera Juan Pablo.
 * @author Giraldo Patiño Carlos Andres.
 *
 */
public class ProjectFinal1 {

    
    
    /**
     * Metodo para leer un entero
     *
     * @param pregunta es la pregunta que se le hace al usuario
     * @return es el entero que ingresa el usuario
     */
    public static int leerEntero(String pregunta) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(pregunta));
            } catch (Exception e) {
/* si el usuario ingresa otro caracter diferente al de un numero esto sera 
 * ejecutado.
 */
                JOptionPane.showMessageDialog(null, "ERROR, INGRESE UN NUMERO",
                            "Ventana de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    
    /**
     * Metodo para leer un String
     *
     * @param pregunta es la pregunta que se le hace al usuario
     * @return es la respuesta del usuario
     */
    public static String leerString(String pregunta) {
        return JOptionPane.showInputDialog(pregunta);
    }

    
    
    /**
     * Metodo para imprimir una imagen
     *
     * @param texto es el texto que le saldra al lado derecho de la imagen
     * @param tipo es el texto o mensaje que saldra en la barra superior
     * @param imagen es la imagen que se va a mostrar o a imprimir
     */
    public static void imprimirImagen(String texto, String tipo, String imagen) 
    {
        JOptionPane.showMessageDialog(null, texto, tipo,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ProjectFinal1.
                            class.getResource(imagen)));
    }

    
    
    /**
     * Metodo para que la maquina nos de un numero aleatorio que se encuentre en
     * el rango dado.
     *
     * @param minimo es el numero menor que se encuentra en el rango
     * @param maximo es el nuumero mayor que se encuentra en el rango
     * @return es el numero aleatorio que se encuentra en el rango que nos da.
     */
    public static int numeroAleatorio(int minimo, int maximo) {
        int numero = (int) Math.floor(Math.random() * (minimo - (maximo + 1))
                + (maximo + 1));
        return numero;

    }

    
    
    /**
     * Metodo para identificar en donde cayo el tiro que hizo el jugador
     *
     * @param tiro
     * @param texto1
     */
    public static void procesarTiro(int tiro, String texto1) {
/* Este metodo se encargara de identificar el tiro y la imagen que le 
 * corresponde y el puntaje.
 */
        int puntaje;

        switch (tiro) {
            case 0:
                puntaje = 5;
                imprimirImagen("Has acertado en la Linea Doble\n            "
                        + "Tu Puntaje es de: " + puntaje, texto1,
                        "1.jpg");
                break;
            case 1:
                puntaje = 10;
                imprimirImagen("Has acertado en la Linea Singular\n         "
                        + "Tu puntaje es de: " + puntaje, texto1, "2.jpg");
                break;
            case 2:
                puntaje = 15;
                imprimirImagen("Has acertado en la Linea Triple\n         "
                        + "Tu puntaje es de: " + puntaje, texto1, "3.jpg");
                break;
            case 3:
                puntaje = 30;
                imprimirImagen("Has acertado en la Linea Sencillo\n         "
                        + "Tu puntaje es de: " + puntaje, texto1, "4.jpg");
                break;
            case 4:
                puntaje = 50;
                imprimirImagen("Has acertado en la Bull Sencillo\n          "
                        + "Tu Puntajes es de: " + puntaje, texto1, "5.jpg");
                break;
            case 5:
                puntaje = 100;
                imprimirImagen("Has acertado en la Bull Doble\n            "
                        + "Tu Puntaje es de: " + puntaje, texto1, "6.jpg");
                break;
            default:
                puntaje = 0;
                imprimirImagen("Has fallado has dado fuera del blanco\n        "
                        + "Tu puntaje es de: " + puntaje, texto1, "7.jpg");
                break;
        }
    }

    
    
    /**
     * Metodo para que el juego empiese a contar los puntos.
     *
     * @param n son los tiros que se hacen al ejecutar la opcion de jugar
     * @param p es el que me va a identificar que numero o que tiro es.
     * @param puntaje es el puntaje que optiene el jugador
     * @return es el puntaje
     */
    public static int juego(int n, int p, int puntaje) {

        int i, tiro;
       
        for (i = 1; i <= n; i++) {
            tiro = numeroAleatorio(0, 6);
            procesarTiro(tiro, "Tiro " + p);
            switch (tiro) {
                case 0:
                    puntaje = 5;
                    break;
                case 1:
                    puntaje = 10;
                    break;
                case 2:
                    puntaje = 15;
                    break;
                case 3:
                    puntaje = 30;
                    break;
                case 4:
                    puntaje = 50;
                    break;
                case 5:
                    puntaje = 100;
                    break;
                default:
                    puntaje = 0;
                    break;
            }

        }

        return puntaje;
    }

    
    
    /**
     * Metodo para identificar si la partida es buena o mala
     * @param nombre el nombre del usuario
     * @param puntaje es el puntaje que lleva el usuario
     */
    public static void procesarPuntaje(String nombre, int puntaje) {

        if (puntaje <= 300) {
            imprimir("Nombre: " + nombre + "\nPuntaje: " + puntaje + 
                        "\nPARTIDA MALA.");
        } else if (puntaje > 300 && puntaje <= 600) {
            imprimir("Nombre: " + nombre + "\nPuntaje: " + puntaje + 
                        "\nPARTIDA NORMAL");
        } else {
            imprimir("Nombre: " + nombre + "\nPuntaje: " + puntaje + 
                        "\nPARTIDA BUENA");
        }

    }

    
    
    /**
     * Metodo para imprimir un texto
     *
     * @param texto el texto que se desea imprimir
     */
    public static void imprimir(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    
    
    /**
     * Metodo para procesar menu
     *
     * @param nombre es el nombre ingresado por el jugador
     * @param puntaje es el puntaje que lleva el jugador
     */
    public static void procesarMenu(String nombre, int puntaje) {
        String menu;
        int opcion, c, i = 1;

        menu = "INGRESE LA OPCION QUE DESEAS EJECUTAR \n\n";
        menu += "Marque  1.  Para Jugar \n";
        menu += "Marque  2.  Para ver tus Puntajes \n";
        menu += "Marque  3.  para Salir";

        do {
            opcion = leerEntero(menu);
            c = puntaje;
            switch (opcion) {
                case 1:
                    puntaje = juego(1,i, puntaje);
                    puntaje += c;
                    i++;
                    if (i > 10) {
                        procesarPuntaje(nombre, puntaje);
                        puntaje = 0;
                        i = 1;
                    }
                    break;

                case 2:
                    imprimir("Tu puntaje acumulado es: " + puntaje);
                    break;

                case 3:
                    break;

                default:
                    imprimir("Opcion no Valida.");
                    break;
            }
        } while (opcion != 3);
    }

    
    
    /**
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        String nombre;
        int puntaje;
        imprimirImagen("Prueba tu suerte lanzando \nflechas hacia el blanco, "
                + "le \nrecuerdo que hay un \nlimite de tiros el cual es 10, "
                + "\ndespues de eso el puntaje \nse reiniciara.","Inicio",
                    "inicio.jpg");
        nombre = leerString("Nombre: ");
        puntaje = 0;
        procesarMenu(nombre, puntaje);
    }

}
