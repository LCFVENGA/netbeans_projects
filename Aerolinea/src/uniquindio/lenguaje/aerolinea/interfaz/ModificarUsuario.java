package uniquindio.lenguaje.aerolinea.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uniquindio.lenguaje.aerolinea.mundo.Pasajero;
import uniquindio.lenguaje.aerolinea.mundo.UsuarioInexistenteException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ModificarUsuario extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaPrincipal miVP=new VentanaPrincipal();
	private JTextField txtId;
	private JButton btnAtrs;
	private JButton btnModificar;
	private JTextField txtNom;
	private JTextField txtNum;
	private JLabel lblNombrePasajero;
	private JLabel lblNmeroTiquete;
	

	/**
	 * Create the frame.
	 */
	public ModificarUsuario(VentanaPrincipal miVP) {
		setTitle("Modificar Pasajero");
		this.miVP=miVP;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdDelPersonaje = new JLabel("Id del personaje: ");
		lblIdDelPersonaje.setBounds(51, 42, 124, 14);
		contentPane.add(lblIdDelPersonaje);
		
		txtId = new JTextField();
		txtId.setBounds(239, 39, 142, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(10, 227, 89, 23);
		btnAtrs.addActionListener(this);
		contentPane.add(btnAtrs);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(335, 227, 89, 23);
		btnModificar.addActionListener(this);
		contentPane.add(btnModificar);
		
		txtNom = new JTextField();
		txtNom.setBounds(239, 89, 142, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtNum = new JTextField();
		txtNum.setBounds(239, 137, 142, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		lblNombrePasajero = new JLabel("Nombre Pasajero:");
		lblNombrePasajero.setBounds(51, 92, 106, 14);
		contentPane.add(lblNombrePasajero);
		
		lblNmeroTiquete = new JLabel("Edad:");
		lblNmeroTiquete.setBounds(51, 140, 106, 14);
		contentPane.add(lblNmeroTiquete);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnModificar)
		{
			String id=txtId.getText();
			String nombre=txtNom.getText();
			int tiquete=Integer.parseInt(txtNum.getText());
			Pasajero miP=new Pasajero(nombre,id,tiquete);
			miVP.modificarUsuario(miP);
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
