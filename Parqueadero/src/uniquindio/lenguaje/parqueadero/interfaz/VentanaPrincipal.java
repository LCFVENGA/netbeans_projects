package uniquindio.lenguaje.parqueadero.interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uniquindio.lenguaje.parqueadero.mundo.Parqueadero;
import uniquindio.lenguaje.parqueadero.mundo.Propietario;
import uniquindio.lenguaje.parqueadero.mundo.Puesto;
import uniquindio.lenguaje.parqueadero.mundo.Vehiculo;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class VentanaPrincipal extends JFrame implements ActionListener 
{
	
	private JPanel contenedorSuperior, contenedorCentral, contenedorInferior;
	private JLabel titulo, lblTamanio;
	private JButton btnGuardar;
	private JTextField tamanio;
	private Parqueadero miParqueadero;
	private GenerarMatrizBotones ventanaMatriz;
	
	public VentanaPrincipal() 
	{
		panelSuperior();
		panelCentral();
		panelInferior();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setFont(new java.awt.Font("Arial",0,6));
	}

	public void panelSuperior()
	{
		contenedorSuperior=new JPanel();
		
		titulo=new JLabel("Ingrese el tama�o de la matriz");		
		contenedorSuperior.add(titulo);
		
		this.add(contenedorSuperior, BorderLayout.NORTH);
	}
	
	public void panelCentral()
	{
		contenedorCentral=new JPanel();
		contenedorCentral.setLayout(new GridLayout(1, 2));
		
		lblTamanio=new JLabel("Tama�o");
		tamanio=new JTextField();
		
		contenedorCentral.add(lblTamanio);
		contenedorCentral.add(tamanio);
		
		this.add(contenedorCentral, BorderLayout.CENTER);
	}
	
	public void panelInferior()
	{
		contenedorInferior=new JPanel();
		
		btnGuardar=new JButton("Enviar");
		this.btnGuardar.addActionListener(this);
		
		contenedorInferior.add(btnGuardar);
		
		this.add(contenedorInferior, BorderLayout.SOUTH);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	    if(e.getSource()==btnGuardar)
	    {
	    	if(tamanio.getText().equals(""))
	    	{
	    		JOptionPane.showMessageDialog(null, "Por favor llene los campos requeridos");
	    	}
	    	else
	    	{
	    		
	    		miParqueadero=new Parqueadero(Integer.parseInt(tamanio.getText()));
	    		ventanaMatriz=new GenerarMatrizBotones(Integer.parseInt(tamanio.getText()), this);
	    		
	    		//SE PUEDE HACER DE LA FORMA COMO ESTA EN LA LINEA ANTERIOS QUE ES MANDANDO LA VENTANA 
	    		//POR UN PARAMETRO, Y LA OTRA FORMA ES NO ENVIANDOLA POR CONSTRUCTOR SINO POR
	    		//ESTA FORMA (LA LINEA COMENTADA DE ABAJO).
	    		
	    		//ventanaMatriz.setMiVentanaPrincipal(this);
	    		this.setVisible(false);
	    		
	    		ventanaMatriz.setBounds(0, 0, 800, 800);
	    		ventanaMatriz.setLocationRelativeTo(null);
	    		ventanaMatriz.setVisible(true);
	    	}
	    }
	}
	
	
   
	public Parqueadero getMiParqueadero() {
		return miParqueadero;
	}


	public GenerarMatrizBotones getVentanaMatriz() {
		return ventanaMatriz;
	}

	public void setVentanaMatriz(GenerarMatrizBotones ventanaMatriz) {
		this.ventanaMatriz = ventanaMatriz;
	}

   /**
    * Metodo para agregar el vehiculo
    * @param miVehiculo El vehiculo, miVehiculo!=null
    */
	public void agregarVehiculo(Vehiculo miVehiculo)
	{
		miParqueadero.agregarVehiculo(miVehiculo);
	}
	/**
	 * Devuelve le propietario del vehiculo ubicado en la posicion i, j
	 * @param i La fila del puesto solicitado
	 * @param j La columna del puesto solicitado
	 * @return El propietario del vehiculo en el puesto solicitado
	 */
	
	public Propietario getPropietario (int i, int j )
	 {
		return miParqueadero.getPropietario(i, j);
	 }
     /**
      * Devuelve el vehiculo en la posicion i j
      * @param i La fila
      * @param j La columna
      * @return el vehiculo, null si no hay nada
      */
	 public Vehiculo getMiVehiculo (int i, int j )
	 {
	  return miParqueadero.getMiVehiculo(i, j);
	 }
	 /**
	  * Permite eliminar un vehiculo del puesto i,j
	  * @param guardaI La posicion en I
	  * @param guardaJ La posicion en J
	  */
	 public void eliminarVehiculo(int guardaI, int guardaJ)
	 { 
	   miParqueadero.eliminarVehiculo(guardaI, guardaJ);
	 }
	 /**
	  * Verifica si el puesto i, j est� disponible
	  * @param i La posicion en i
	  * @param j La posicion en j
	  * @return Un boolean, true si el puesto esta disponible, false en caso contrario
	  */
	 public boolean verificarDisponibilidadPuesto(int i, int j)
	 {
	  return miParqueadero.verificarDisponibilidadPuesto(i, j);
	 }
	 
	 public Puesto devolverPuesto(int i, int j)
	 {
		 return miParqueadero.getMiPuesto(i, j);
	 }
	
}
