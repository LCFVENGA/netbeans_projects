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



public class MatrizBotones extends JFrame implements ActionListener
{
	
	private JPanel contenedorSuperior, contenedorInferior, contenedorCentral;
	private JLabel titulo;
	private JButton matrizBotones[][];
	private JButton  regresar;
	private int tamanio1, tamanio2, preferenciales;
	private VentanaPrincipal miVentanaPrincipal;
//	private SeleccionaAvion miSeleccionarAvion;
	private VentanaReserva miReserva;
	private String idAvion;

	private int numeroVehiculo;

	
	public MatrizBotones(int tamanio1,int tamanio2, VentanaPrincipal miVentanaPrincipal, int numeroSala, String idAvion)
	{
		this.idAvion=idAvion;
		this.tamanio1=tamanio1;
		this.tamanio2=tamanio2;
		this.numeroVehiculo = numeroSala;
		this.miVentanaPrincipal=miVentanaPrincipal;
		
		panelSuperior();
		panelCentral();
		panelInferior();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		
	}
	
	public void panelSuperior()
	{
		contenedorSuperior=new JPanel();
	
		titulo=new JLabel(idAvion);//miVentanaPrincipal.getAvion(idAvion).getIdAvion());
		
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
				int tipo=miVentanaPrincipal.devolverSilla(miVentanaPrincipal.getAvion(numeroVehiculo),i,j ).getTipo();
				
				matrizBotones[i][j]=new JButton(""+miVentanaPrincipal.devolverSilla(miVentanaPrincipal.getAvion(numeroVehiculo),i,j ).getCodPuesto());
				if(tipo==0){
				matrizBotones[i][j].setBackground(Color.yellow);
				}
				else if(tipo==1){
					matrizBotones[i][j].setBackground(Color.gray);
				}
				else
				{
					matrizBotones[i][j].setBackground(Color.white);
				}
				this.matrizBotones[i][j].addActionListener(this);
				contenedorCentral.add(matrizBotones[i][j]);
				
			}
		}
		
		this.add(contenedorCentral, BorderLayout.CENTER);
	}
	
	public void panelInferior()
	{
		contenedorInferior=new JPanel();
		
		regresar=new JButton("Regresar");
		this.regresar.addActionListener(this);
		
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
                                               miReserva = new VentanaReserva(miVentanaPrincipal,i,j,numeroVehiculo,this);
                                               miReserva.setVisible(true);
                                                
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
                                                            miVentanaPrincipal.eliminarUsuario(i, j, numeroVehiculo,miVentanaPrincipal.devolverPuestoSala(i,j,numeroVehiculo).getMiUsuario() );
                                                        despintarCasilas(i, j, numeroVehiculo, preferenciales);
                                                        
                                                 //       }
                                                
                                            }
                                        }
					
					if(miVentanaPrincipal.verificarDisponibilidadPuesto(i, j,numeroVehiculo)==true && numeroVehiculo == 1)
					{
                                            if("s".equalsIgnoreCase(JOptionPane.showInputDialog(null, "Campo vacio\n Desea Reservar Esta Silla. \n (si) o (no)")))
                                            {
                                            	// miReserva = new VentanaReserva(miVentanaPrincipal,i,j,numeroSala);
                                                //miReserva.setVisible(true);
                                                
                                               Usuario miU=new Usuario(JOptionPane.showInputDialog("nombre"),JOptionPane.showInputDialog("id"),Integer.parseInt(JOptionPane.showInputDialog("targeta cinePuntos")));
                                                miVentanaPrincipal.reservarSillas(miU, Integer.parseInt(JOptionPane.showInputDialog("cantidad")), i, j, numeroVehiculo, JOptionPane.showInputDialog("direccion"));
                                               //miVentanaPrincipal.agregarCliente(miU);
                                                pintarCasillas();
                                            }
                                                
					}
                                        else if(numeroVehiculo==1)
					{
                                            if("s".equalsIgnoreCase(JOptionPane.showInputDialog("Este puesto se encuentra Ocupado.Desea Eliminar esta reserva?\ns(si) n(no)")))
                                            {
                                            	 if(miVentanaPrincipal.devolverPuestoSala(i,j,numeroVehiculo).getMiUsuario().getId().equals(JOptionPane.showInputDialog("ingrese el id del ciente a eliminar si va a eliminar mas de una reserva.")))
                                                 {
                                                     miVentanaPrincipal.eliminarUsuario(i, j, numeroVehiculo,miVentanaPrincipal.devolverPuestoSala(i,j,numeroVehiculo).getMiUsuario() );
                                                 despintarCasilas(i, j, numeroVehiculo, preferenciales);
                                                 
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
		
		
			
		
		if(e.getSource()==regresar){
			miSeleccionarAvion = new SeleccionaAvion(miVentanaPrincipal, tamanio1, tamanio2, preferenciales);
			miSeleccionarAvion.setVisible(true);
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
