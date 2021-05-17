package Vista;

import javax.swing.JFrame;

import Controlador.ControladorIngresoAnuncios;

public class VentanaPrincipal extends JFrame{

	public VentanaPrincipal() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("VITRINA VIRTUAL ESTUDIANTIL");
		setResizable(false);
		setSize(1050,650);
		PanelPrincipal panel = new PanelPrincipal();
		add(panel);
	}

}
