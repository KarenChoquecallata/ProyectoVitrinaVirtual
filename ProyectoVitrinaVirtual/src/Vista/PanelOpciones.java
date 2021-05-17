package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Controlador.ControladorIngresoAnuncios;

public class PanelOpciones extends JPanel{
	Image portada = new ImageIcon(getClass().getResource("/imagenes/barra.jpg")).getImage();
	public JButton crear_anuncio ;
	public JButton borrar_anuncio;
	public PanelOpciones() {
		setLayout(null);
		setBackground(Color.BLACK);
		crear_anuncio = new JButton("CREAR ANUNCIO");
	 	borrar_anuncio = new JButton("BORRAR ANUNCIO");
	    crear_anuncio.setBackground(Color.WHITE);
	    borrar_anuncio.setBackground(Color.white);
	    crear_anuncio.setBounds(325, 10, 200,40);
	    borrar_anuncio.setBounds(530, 10, 200,40);
		add(crear_anuncio);
		add(borrar_anuncio);
	}
	public void paint(Graphics g) {
		g.drawImage(portada, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
	}
	public void setControlador(ControladorIngresoAnuncios controlador) {
		crear_anuncio.addActionListener(controlador);
		borrar_anuncio.addActionListener(controlador);
	}
	
}
