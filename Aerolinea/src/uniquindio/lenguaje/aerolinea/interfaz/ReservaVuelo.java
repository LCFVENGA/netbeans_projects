package uniquindio.lenguaje.aerolinea.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ReservaVuelo extends JFrame implements ActionListener {

	private JPanel contentPane,contenedorSuperior,contenedorCentral,contenedorInferior;
	private VentanaPrincipal miVP;
	private JButton btnAvion;
	private JButton[] vectorBotones;
	private MatrizBotones miMa;
	private int numerosVehiculos;
	private JLabel titulo;
	

	/**
	 * Create the frame.
	 */
	public ReservaVuelo(VentanaPrincipal miVP,int numerosDeVehiculos) {
		this.miVP=miVP;
		this.numerosVehiculos=numerosDeVehiculos;
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		btnAvion = new JButton("aVION");
//		btnAvion.setBounds(177, 85, 89, 23);
//		btnAvion.addActionListener(this);
//		contentPane.add(btnAvion);
		setBounds(100, 100, 450, 300);
		panelSuperior();
		panelCentral();
		panelInferior();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public void panelSuperior()
	{
		contenedorSuperior=new JPanel();
		
		titulo=new JLabel("Aviones");
		contenedorSuperior.add(titulo);
		this.add(contenedorSuperior , BorderLayout.NORTH);
	}
	
	public void panelCentral()
	{
		vectorBotones=new JButton[numerosVehiculos];
		
		contenedorCentral=new JPanel();
		contenedorCentral.setLayout(new GridLayout(numerosVehiculos, numerosVehiculos));
		
		for (int i = 0; i < numerosVehiculos; i++) {
			vectorBotones[i]=new JButton("Avion "+miVP.devolverVehiculos(i).getId());
//			vectorBotones[i].setBackground(Color.white);
			this.vectorBotones[i].addActionListener(this);
			contenedorCentral.add(vectorBotones[i]);
		}
		this.add(contenedorCentral, BorderLayout.CENTER);
		
	}
	
	public void panelInferior()
	{
		contenedorInferior=new JPanel();
		btnAvion=new JButton("Regresar");
		this.btnAvion.addActionListener(this);
		contenedorInferior.add(btnAvion);
		this.add(contenedorInferior,BorderLayout.SOUTH);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnAvion)
		{
			miVP.setVisible(true);
			dispose();
		}
		
		
		for (int i = 0; i < vectorBotones.length; i++) 
		{
			if(e.getSource()==vectorBotones[i])
			{
				miMa=new MatrizBotones(miVP.getAvion(i).getMisSillasA().length,miVP.getAvion(i).getMisSillasA()[0].length, miVP, i,miVP.devolverVehiculos(i).getId(),this);
				miMa.setVisible(true);
				dispose();
			}
		}
	}

}
