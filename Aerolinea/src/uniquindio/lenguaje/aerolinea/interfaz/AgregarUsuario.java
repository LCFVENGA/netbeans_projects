package uniquindio.lenguaje.aerolinea.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uniquindio.lenguaje.aerolinea.mundo.Pasajero;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AgregarUsuario extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaPrincipal miVP=new VentanaPrincipal();
	private JTextField txtNombre;
	private JTextField txtId;
	private JTextField txtEdad;
	private JButton btnAtrs;
	private JButton btnAgregar;

	/**
	 * Create the frame.
	 */
	public AgregarUsuario(VentanaPrincipal miVP) {
		setTitle("Agregar Usuario");
		this.miVP=miVP;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(10, 227, 89, 23);
		btnAtrs.addActionListener(this);
		contentPane.add(btnAtrs);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(335, 227, 89, 23);
		btnAgregar.addActionListener(this);
		contentPane.add(btnAgregar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(235, 64, 144, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtId = new JTextField();
		txtId.setBounds(235, 95, 144, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(235, 126, 144, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblNombrePasajero = new JLabel("Nombre Pasajero:");
		lblNombrePasajero.setBounds(53, 67, 136, 14);
		contentPane.add(lblNombrePasajero);
		
		JLabel lblIdPasajero = new JLabel("ID Pasajero:");
		lblIdPasajero.setBounds(53, 98, 120, 14);
		contentPane.add(lblIdPasajero);
		
		JLabel lblNumeroDeTiquete = new JLabel("Edad:");
		lblNumeroDeTiquete.setBounds(53, 129, 154, 14);
		contentPane.add(lblNumeroDeTiquete);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==btnAgregar)
		{
			String nombre= txtNombre.getText();
			String id=txtId.getText();
			int nt=Integer.parseInt(txtEdad.getText());
			Pasajero miP=new Pasajero(nombre,id,nt);
			miVP.agregarUsuario(miP);
			miVP.impriPer(miVP.getMisPersonas(miP));
			miVP.setVisible(true);
			dispose();
		}
		if(e.getSource()==btnAtrs)
		{
			miVP.setVisible(true);
			dispose();
		}
		
	}
}
