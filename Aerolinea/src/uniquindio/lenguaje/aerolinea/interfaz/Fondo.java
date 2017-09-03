package uniquindio.lenguaje.aerolinea.interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import uniquindio.lenguaje.aerolinea.mundo.Aerolinea;

public class Fondo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon fondo;
	
	/**
	 * Create the panel.
	 */
	public Fondo(String name) {

		initialize();
		fondo = new ImageIcon(Aerolinea.class.getResource(name));
		setSize(fondo.getIconWidth(),fondo.getIconHeight());
	}
	
	protected void paintComponent(Graphics g)
	{
		Dimension d= getSize();
		g.drawImage(fondo.getImage(),0, 0, d.width,d.height,null);
		this.setOpaque(false);
		super.paintComponent(g);
	}

	private void initialize() {
		this.setSize(300,200);
		this.setLayout(new GridBagLayout());
	}

}
