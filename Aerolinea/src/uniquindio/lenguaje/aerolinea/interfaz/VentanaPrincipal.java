package uniquindio.lenguaje.aerolinea.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uniquindio.lenguaje.aerolinea.mundo.Aerolinea;
import uniquindio.lenguaje.aerolinea.mundo.Avion;
import uniquindio.lenguaje.aerolinea.mundo.Pasajero;
import uniquindio.lenguaje.aerolinea.mundo.Silla;
import uniquindio.lenguaje.aerolinea.mundo.UsuarioInexistenteException;
import uniquindio.lenguaje.aerolinea.mundo.UsuarioRepetidoException;
import uniquindio.lenguaje.aerolinea.mundo.Vehiculo;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private Aerolinea miAero=new Aerolinea();
	private JPanel contentPane;
	private JButton btnCrearAvion;
	private JButton btnRegsitrarUsuario;
	private JButton btnModificarUsuario;
	private JButton btnReservarVuelo;
	private AgregarUsuario agregarU;
	private ModificarUsuario modifiU;
	private ReservaVuelo reserVu;
	private VentanaReserva vtnR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCrearAvion = new JButton("Crear Avion");
		btnCrearAvion.setBounds(137, 43, 144, 23);
		btnCrearAvion.addActionListener(this);
		contentPane.add(btnCrearAvion);
		
		btnRegsitrarUsuario = new JButton("Regsitrar Usuario");
		btnRegsitrarUsuario.setBounds(137, 91, 144, 23);
		btnRegsitrarUsuario.addActionListener(this);
		contentPane.add(btnRegsitrarUsuario);
		
		btnModificarUsuario = new JButton("Modificar Usuario");
		btnModificarUsuario.setBounds(137, 125, 144, 23);
		btnModificarUsuario.addActionListener(this);
		contentPane.add(btnModificarUsuario);
		
	    btnReservarVuelo = new JButton("Reservar Vuelo");
		btnReservarVuelo.setBounds(137, 178, 144, 23);
		btnReservarVuelo.addActionListener(this);
		contentPane.add(btnReservarVuelo);
	}
	public Silla devolverSilla(Avion miA,int i,int j)
	{
		return miAero.devolverSilla(miA, i, j);
	}
	
	public int getNumeroVehiculos()
	{
		return miAero.getNumeroVehiculos();
	}
	
	public Pasajero getMisPersonas(Pasajero miP)
	{
		return miAero.getMisPersonas(miP);
	}
	
	public void agregarUsuario(Pasajero mip)
	{
		try {
			miAero.AgregarUsuario(mip);
		}
		catch (UsuarioRepetidoException e)
		{
			e.printStackTrace();
		}
	}
	
	public Vehiculo devolverVehiculos(int i)
	{
		return miAero.devolverVehiculos(i);
	}
	
	public Avion getAvion(int id)
	{
		return miAero.getAvion(id);
	}
	
	public void modificarUsuario(Pasajero miP)
	{
		try {
			miAero.ModificarUsuario(miP);
		} catch (UsuarioInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRegsitrarUsuario)
		{
			agregarU=new AgregarUsuario(this);
			agregarU.setVisible(true);
		}
		else if(e.getSource()==btnCrearAvion)
		{
			miAero.CrearAvion();
			JOptionPane.showMessageDialog(null, "Se a creado el avion satisfactoriamente.\nNumero de Aviones creados: "+getNumeroVehiculos());
		}
		else if(e.getSource()==btnModificarUsuario)
		{
			modifiU=new ModificarUsuario(this);
			modifiU.setVisible(true);
		}
		else
		{
			reserVu=new ReservaVuelo(this,getNumeroVehiculos());
			reserVu.setVisible(true);
		}
		
	}

	public void impriPer(Pasajero misPersonas) {
		JOptionPane.showMessageDialog(null, misPersonas);
		
	}
}
