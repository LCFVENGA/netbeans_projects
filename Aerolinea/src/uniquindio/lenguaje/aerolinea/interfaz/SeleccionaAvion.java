package uniquindio.lenguaje.aerolinea.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class SeleccionaAvion extends JFrame implements ActionListener {

	private JPanel contentPane;
    private VentanaPrincipal miVentanaPrincipal;
    private JButton btnAvion;
    private JButton btnAvioneta;
    private int tamanio1;
    private int tamanio2;
    private int preferenciales;

	/**
	 * Create the frame.
	 */
	public SeleccionaAvion(VentanaPrincipal miVentanaPrincipal, int tamanio1,int tamanio2, int preferenciales) {
		this.miVentanaPrincipal = miVentanaPrincipal;
		this.tamanio1=tamanio1;
		this.tamanio2=tamanio2;
		this.preferenciales=preferenciales;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAvion = new JButton("Avion Comercial");
		btnAvion.setBounds(166, 60, 89, 23);
		btnAvion.addActionListener(this);
		contentPane.add(btnAvion);
		
		btnAvioneta = new JButton("Avioneta");
		btnAvioneta.setBounds(166, 123, 89, 23);
		btnAvioneta.addActionListener(this);
		contentPane.add(btnAvioneta);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== btnAvion){
			MatrizBotones miMatrizBotones = new;
			miMatrizBotones.setVisible(true);
			miMatrizBotones.setSize(800, 600); 
			dispose();
		}
		
		if(e.getSource()== btnAvioneta){
			MatrizBotones miMatrizBotones = new MatrizBotones(tamanio1, tamanio2, preferenciales, miVentanaPrincipal, 1);
			miMatrizBotones.setVisible(true);
			miMatrizBotones.setSize(800, 600); 
			dispose();
		}
	}

}
