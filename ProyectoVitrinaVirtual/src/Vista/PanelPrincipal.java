package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {

	public PanelPrincipal() {
		// TODO Auto-generated constructor stub
		setBackground(Color.BLACK);
		JButton boton1 = new JButton("Publicar Anuncio");
		add(boton1);
	}

}
