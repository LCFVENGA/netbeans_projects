package uniquindio.lenguaje.aerolinea.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import uniquindio.lenguaje.aerolinea.mundo.Pasajero;
import uniquindio.lenguaje.aerolinea.mundo.UsuarioInexistenteException;



public class MatrizBotones extends JFrame implements ActionListener
{
	
	private JPanel contenedorSuperior, contenedorInferior, contenedorCentral;
	private JLabel titulo;
	private JButton matrizBotones[][];
	private JButton  regresar;
	private int tamanio1, tamanio2, preferenciales;
	private VentanaPrincipal miVentanaPrincipal;
	private ReservaVuelo miSeleccionarAvion;
	private VentanaReserva miReserva;
	private String idAvion;

	private int numeroVehiculo;

	
	public MatrizBotones(int tamanio1,int tamanio2, VentanaPrincipal miVentanaPrincipal, int numeroSala, String idAvion, ReservaVuelo miSeleccionarAvion)
	{
		this.idAvion=idAvion;
		this.tamanio1=tamanio1;
		this.tamanio2=tamanio2;
		this.numeroVehiculo = numeroSala;
		this.miSeleccionarAvion = miSeleccionarAvion;
		this.miVentanaPrincipal=miVentanaPrincipal;
		setBounds(100, 100, 450, 300);
		panelSuperior();
		panelCentral();
		panelInferior();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		
	}
	
	public void panelSuperior()
	{
		contenedorSuperior=new JPanel();
	
		titulo=new JLabel("Avion "+idAvion);//miVentanaPrincipal.getAvion(idAvion).getIdAvion());
		
		contenedorSuperior.add(titulo);
		
		this.add(contenedorSuperior, BorderLayout.NORTH);
	}
	
	/**
	 * Método que crea un panel central en una interfaz 
	 */
	public void panelCentral()
	{	
		
		matrizBotones=new JButton[tamanio1][tamanio2];
		
		contenedorCentral=new JPanel();
		contenedorCentral.setLayout(new GridLayout(tamanio1, tamanio2));

		for(int i=0; i<tamanio1; i++)
		{
			for(int j=0; j<tamanio2; j++)
			{

				if(i<2||i>4)
				{
					int tipo=miVentanaPrincipal.devolverSilla(numeroVehiculo,i,j ).getTipo();
					matrizBotones[i][j]=new JButton(""+miVentanaPrincipal.devolverSilla(numeroVehiculo,i,j ).getCodPuesto());
					if(tipo==0){
						matrizBotones[i][j].setBackground(Color.yellow);
						this.matrizBotones[i][j].addActionListener(this);
					}
					else if(tipo==1){
						matrizBotones[i][j].setBackground(Color.gray);
						this.matrizBotones[i][j].addActionListener(this);
					}
					else
					{
						matrizBotones[i][j]=new JButton();
						matrizBotones[i][j].setBackground(Color.white);
					}
					
					contenedorCentral.add(matrizBotones[i][j]);
				}
				else
				{
					matrizBotones[i][j]=new JButton();
					matrizBotones[i][j].setBackground(Color.white);
					contenedorCentral.add(matrizBotones[i][j]);
				}
			}
		}
		
		this.add(contenedorCentral, BorderLayout.CENTER);
	}
	
	public void panelInferior()
	{
		contenedorInferior=new JPanel();
		
		regresar=new JButton("Regresar");
		regresar.addActionListener(this);
		
		contenedorInferior.add(regresar);
		

		
		this.add(contenedorInferior, BorderLayout.SOUTH);
		
	}
	
	public void pintarCasillas()
	{
		for(int s=0; s<tamanio1; s++)
		{
			for(int m=0; m<tamanio2; m++)
			{
				if(miVentanaPrincipal.verificarDisponibilidadPuesto(s, m, numeroVehiculo)==false)
				{
					matrizBotones[s][m].setBackground(Color.red);
					//matrizBotones[s][m].setFont(new java.awt.Font("Arial",0,6));
					//matrizBotones[s][m].setText("OCUPADO");
				}
			}
		}	
	}
	
//	public void pintarCasillas(ArrayList<Posicion> misPosiciones)
//	{
//		int fil, col;
//		for(int s=0; s<misPosiciones.size(); s++)
//		{
//			        fil=misPosiciones.get(s).getI();
//			        col=misPosiciones.get(s).getJ();
//					matrizBotones[fil][col].setBackground(Color.red);
//					//matrizBotones[s][m].setFont(new java.awt.Font("Arial",0,6));
//					//matrizBotones[s][m].setText("OCUPADO");
//			
//		}	
//	}
//	public void despintarCasilas(int i, int j, int numeroSala, int preferenciales)
//	{	
//		//String mostrar=Integer.toString(miVentanaPrincipal.devolverPuestoSala(i, j, numeroSala).getCategoria());
//		//matrizBotones[i][j].setBackground(Color.white);
//		//matrizBotones[i][j].setText(mostrar);	
//		
//		for(int s=0; s<tamanio1; s++)
//		{
//			for(int m=0; m<tamanio2; m++)
//			{
//				if(miVentanaPrincipal.verificarDisponibilidadPuesto(s, m, numeroSala)==true && s<tamanio1-preferenciales)
//				{
//					matrizBotones[s][m].setBackground(Color.white);
//					
//				}
//				
//				if(miVentanaPrincipal.verificarDisponibilidadPuesto(s, m, numeroSala)==true && s>=tamanio1-preferenciales){
//					matrizBotones[s][m].setBackground(Color.gray);
//				}
//				
//			}
//		}	
//		
//		
//	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==regresar){
			miSeleccionarAvion.setVisible(true);
			dispose();
		}  
		for(int i=0; i<tamanio1; i++)
		{
			for(int j=0; j<tamanio2; j++)
			{
				if(e.getSource()==matrizBotones[i][j])
				{
					if(miVentanaPrincipal.verificarDisponibilidadPuesto(i, j,numeroVehiculo)==true && numeroVehiculo == 0)
					{
						
                                            if("s".equalsIgnoreCase(JOptionPane.showInputDialog(null, "Campo vacio\n Desea Reservar Esta o mas Sillas?. \n (si) o (no)")))
                                            {
//                                               miReserva = new VentanaReserva(miVentanaPrincipal,i,j,numeroVehiculo,this);//Aun no esta realizada...En Espera.
//                                               miReserva.setVisible(true);
                                                
                                             //Usuario miU=new Usuario(JOptionPane.showInputDialog("nombre"),JOptionPane.showInputDialog("id"),Integer.parseInt(JOptionPane.showInputDialog("targeta cinePuntos")));
                                             //miVentanaPrincipal.reservarSillas(miU, Integer.parseInt(JOptionPane.showInputDialog("cantidad")), i, j, numeroSala, JOptionPane.showInputDialog("direccion"));
                                               //miVentanaPrincipal.agregarCliente(miU);
                                               
                                                pintarCasillas();
                                                //contenedorCentral.set(WIDTH,e);
                                                
                                            }
					
					}
                                        else if(numeroVehiculo==0)
                                        {
                                            if("s".equalsIgnoreCase(JOptionPane.showInputDialog("Este puesto se encuentra Ocupado.Desea Eliminar esta reservao mas a su nombre?\ns(si) n(no)")))
                                            {
                                             //   if(miVentanaPrincipal.devolverPuestoSala(i,j,numeroSala).getMiUsuario().getId().equals(JOptionPane.showInputDialog("ingrese el id del ciente a eliminar si va a eliminar mas de una reserva.")))
                                               //         {
                                                        //   por el momento no// miVentanaPrincipal.eliminarUsuario(i, j, numeroVehiculo,miVentanaPrincipal.devolverPuestoSala(i,j,numeroVehiculo).getMiUsuario() );
                                                        //despintarCasillas(i, j, numeroVehiculo, preferenciales);
                                                        
                                                 //       }
                                                
                                            }
                                        }
					
					if(miVentanaPrincipal.verificarDisponibilidadPuesto(i, j,numeroVehiculo)==true && numeroVehiculo == 1)
					{
                                            if("s".equalsIgnoreCase(JOptionPane.showInputDialog(null, "Campo vacio\n Desea Reservar Esta Silla. \n (si) o (no)")))
                                            {
                                            	// miReserva = new VentanaReserva(miVentanaPrincipal,i,j,numeroSala);
                                                //miReserva.setVisible(true);
                                                
                                               Pasajero miP=new Pasajero(JOptionPane.showInputDialog("id"),null,Integer.parseInt(JOptionPane.showInputDialog("edad")));
                                                try {
													miVentanaPrincipal.reservarSillas(miP,  i, j, numeroVehiculo);
												} catch (UsuarioInexistenteException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
													JOptionPane.showMessageDialog(null, e1.getMessage());
												}
                                               //miVentanaPrincipal.agregarCliente(miU);
                                                pintarCasillas();
                                            }
                                                
					}
                                        else if(numeroVehiculo==1)
					{
                                            if("s".equalsIgnoreCase(JOptionPane.showInputDialog("Este puesto se encuentra Ocupado.Desea Eliminar esta reserva?\ns(si) n(no)")))
                                            {
//                                            	 if(miVentanaPrincipal.devolverSilla(i,j,numeroVehiculo).getMisPersonas().getId().equals(JOptionPane.showInputDialog("ingrese el id del ciente a eliminar si va a eliminar mas de una reserva.")))
                                                 {
//                                                     miVentanaPrincipal.eliminarUsuario(i, j, numeroVehiculo,miVentanaPrincipal.devolverSilla(i,j,numeroVehiculo).getMiUsuario() );
                                                // despintarCasillas(i, j, numeroVehiculo, preferenciales);
                                                 
                                                 }
                                            }
                                            /**
					    this.setVisible(false);
					    miVentanaEliminar=new EliminarVehiculo(i, j, this, miVentanaPrincipal);
					    miVentanaEliminar.setBounds(0, 0, 300, 300);
					    miVentanaEliminar.setLocationRelativeTo(null);
					    miVentanaEliminar.setVisible(true);	
					    */				    
					}
				}
			}
		}
		
		
			
		
		
		/*if(e.getSource()==agregarUsuario){
			
			miAgregarUsuario =new  AgregarUsuario();
			dispose();
			miAgregarUsuario.setVisible(true);
			
		}*/
	}
	
	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}

	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}

	public JButton[][] getMatrizBotones() {
		return matrizBotones;
	}

	public void setMatrizBotones(JButton[][] matrizBotones) {
		this.matrizBotones = matrizBotones;
	}
	
	
	
}
