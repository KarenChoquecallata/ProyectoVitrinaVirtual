package Vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	public VentanaPrincipal() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Vitrina Virtual");
		setResizable(false);
		setSize(1037,650);
		PanelPrincipal panel = new PanelPrincipal();
		add(panel);
	}

}
