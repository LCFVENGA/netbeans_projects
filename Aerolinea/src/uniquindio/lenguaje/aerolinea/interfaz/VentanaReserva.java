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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaReserva extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnCancelar;
	private JButton btnReservar;
	private VentanaPrincipal miVP;
	private MatrizBotones miMB;
	private int i,j,numeroVehiculo;
	
	/**
	 * Create the frame.
	 */
	public VentanaReserva(int i,int j, int numeroVehiculo,VentanaPrincipal miVP,MatrizBotones miMB) {
		this.i=i;
		this.j=j;
		this.numeroVehiculo=numeroVehiculo;
		this.miVP=miVP;
		this.miMB=miMB;
		setTitle("Ventana Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdUsuarioA = new JLabel("Id Usuario a reservar Silla: ");
		lblIdUsuarioA.setBounds(61, 98, 162, 14);
		contentPane.add(lblIdUsuarioA);
		
		textField = new JTextField();
		textField.setBounds(221, 95, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(75, 175, 89, 23);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
		
		btnReservar = new JButton("Reservar");
		btnReservar.setBounds(250, 175, 89, 23);
		btnReservar.addActionListener(this);
		contentPane.add(btnReservar);
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		
		if(a.getSource()==btnReservar)
		{
			String id=textField.getText();
			
			Pasajero miP=new Pasajero(null,id,0);
			try {
				miVP.reservarSillas(miP, i, j, numeroVehiculo);
			} catch (UsuarioInexistenteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			miMB.pintarCasillas();
			JOptionPane.showMessageDialog(null, "La informacion se a guardado satisfacoriamente.");
			dispose();
		}
		if(a.getSource()==btnCancelar)
		{
			dispose();
		}
	}
}
