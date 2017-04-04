package uniquindio.lenguaje.parqueadero.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import uniquindio.lenguaje.parqueadero.mundo.Parqueadero;
import uniquindio.lenguaje.parqueadero.mundo.Puesto;

public class GenerarMatrizBotones extends JFrame implements ActionListener
{
	
	private JPanel contenedorSuperior, contenedorCentral, contenedorInferior;
	private JLabel titulo;
	private JButton matrizBotones[][], agregarVehiculo;
	private int tamanio;
	private VentanaPrincipal miVentanaPrincipal;
	private AgregarVehiculo miVentanaAgregar;
	private EliminarVehiculo miVentanaEliminar;
	
	public GenerarMatrizBotones(int tamanio, VentanaPrincipal miVentanaPrincipal)
	{
		this.tamanio=tamanio;
		this.miVentanaPrincipal=miVentanaPrincipal;
		panelSuperior();
		panelCentral();
		panelInferior();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public void panelSuperior()
	{
		contenedorSuperior=new JPanel();
		
		titulo=new JLabel("MATRIZ DE BOTONES");
		
		contenedorSuperior.add(titulo);
		
		this.add(contenedorSuperior, BorderLayout.NORTH);
	}
	
	public void panelCentral()
	{	
		
		matrizBotones=new JButton[tamanio][tamanio];
		
		contenedorCentral=new JPanel();
		contenedorCentral.setLayout(new GridLayout(tamanio, tamanio));

		for(int i=0; i<tamanio; i++)
		{
			for(int j=0; j<tamanio; j++)
			{
				int tipo=miVentanaPrincipal.devolverPuesto(i,j).getTipo();
				matrizBotones[i][j]=new JButton(""+tipo);
				matrizBotones[i][j].setBackground(Color.white);
				this.matrizBotones[i][j].addActionListener(this);
				contenedorCentral.add(matrizBotones[i][j]);
			}
		}
		
		this.add(contenedorCentral, BorderLayout.CENTER);
	}
	
	public void panelInferior()
	{
		contenedorInferior=new JPanel();
		
		agregarVehiculo=new JButton("Agregar Vehiculo");
		this.agregarVehiculo.addActionListener(this);
		
		contenedorInferior.add(agregarVehiculo);
		
		this.add(contenedorInferior, BorderLayout.SOUTH);
		
	}
	
	public void pintarCasillas()
	{
		for(int s=0; s<tamanio; s++)
		{
			for(int m=0; m<tamanio; m++)
			{
				if(miVentanaPrincipal.verificarDisponibilidadPuesto(s, m)==false)
				{
					matrizBotones[s][m].setBackground(Color.red);
					matrizBotones[s][m].setFont(new java.awt.Font("Arial",0,6));
					matrizBotones[s][m].setText("OCUPADO");
				}
			}
		}	
	}
	
	public void despintarCasilas(int i, int j)
	{	
		String mostrar=Integer.toString(miVentanaPrincipal.getMiParqueadero().getMisPuestos()[i][j].getTipo());
		matrizBotones[i][j].setBackground(Color.white);
		matrizBotones[i][j].setText(mostrar);	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		for(int i=0; i<tamanio; i++)
		{
			for(int j=0; j<tamanio; j++)
			{
				if(e.getSource()==matrizBotones[i][j])
				{
					if(miVentanaPrincipal.verificarDisponibilidadPuesto(i, j)==true)
					{
						JOptionPane.showMessageDialog(null, "Campo vacio");
					}
					else
					{
					    this.setVisible(false);
					    miVentanaEliminar=new EliminarVehiculo(i, j, this, miVentanaPrincipal);
					    miVentanaEliminar.setBounds(0, 0, 300, 300);
					    miVentanaEliminar.setLocationRelativeTo(null);
					    miVentanaEliminar.setVisible(true);					    
					}
				}
			}
		}
		
		if(e.getSource()==agregarVehiculo)
		{
			this.setVisible(false);
			miVentanaAgregar=new AgregarVehiculo(this, miVentanaPrincipal);
			miVentanaAgregar.setBounds(0, 0, 500, 250);
			miVentanaAgregar.setLocationRelativeTo(null);
			miVentanaAgregar.setVisible(true);
		}
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
