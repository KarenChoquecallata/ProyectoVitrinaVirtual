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
	
	public JButton crear_anuncio ;
	public JButton borrar_anuncio;
	public JButton confirmarEliminar;
	public PanelOpciones() {
		setLayout(null);
		setBackground(Color.BLACK);
		crear_anuncio = new JButton();
	 	borrar_anuncio = new JButton();
	 	confirmarEliminar = new JButton();
	   
	    crear_anuncio.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonmas2.png")));
	    borrar_anuncio.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonborrar.png")));
	    confirmarEliminar.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonconfirmar.png")));
	  
	    crear_anuncio.setBackground(Color.WHITE);
	    borrar_anuncio.setBackground(Color.white);
	    confirmarEliminar.setBackground(Color.WHITE);
	    crear_anuncio.setBounds(380, 0, 65,65);
	    borrar_anuncio.setBounds(480, 0, 65,65);
	    confirmarEliminar.setBounds(580, 0, 65, 65);
//	   
	    crear_anuncio.setBorder(null);
	    borrar_anuncio.setBorder(null);
	    confirmarEliminar.setBorder(null);
	   
	    add(confirmarEliminar);
		add(crear_anuncio);
		add(borrar_anuncio);
		visibilidad(false);
	}

	public void setControlador(ControladorIngresoAnuncios controlador) {
		crear_anuncio.addActionListener(controlador);
		borrar_anuncio.addActionListener(controlador);
	}
	public void visibilidad(boolean estado) {
		
	  confirmarEliminar.setVisible(estado);
	}
	
}
