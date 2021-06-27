package Vista;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Invalido extends JPanel {

	/**
	 * Create the panel.
	 */
	public JButton btnNewButtonReintentar;
	public JButton btnNewButton ;
	public Invalido() {
		setLayout(null);
		setBackground(Color.WHITE);
		JTextPane txtpnUsuarioOComtrasea = new JTextPane();
		txtpnUsuarioOComtrasea.setFont(new Font("Stencil", Font.PLAIN, 17));
		txtpnUsuarioOComtrasea.setText("Usuario o contrase\u00F1a incorrectos");
		txtpnUsuarioOComtrasea.setBounds(208, 150, 400, 22);
		add(txtpnUsuarioOComtrasea);
		
		btnNewButtonReintentar = new JButton();
		btnNewButtonReintentar.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonrein.png")));
		btnNewButtonReintentar.setBackground(Color.white);
		btnNewButtonReintentar.setBorder(null);

		btnNewButtonReintentar.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnNewButtonReintentar.setBounds(200, 250, 170, 70);
		add(btnNewButtonReintentar);
		
		btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botoncancelar.png")));
		btnNewButton.setBackground(Color.white);
		btnNewButton.setBorder(null);

		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnNewButton.setBounds(380, 250, 170, 70);
		add(btnNewButton);

	}
	public void iniciarAccion(PanelPrincipal panel) {
		 btnNewButtonReintentar.addActionListener(panel);
		 btnNewButton.addActionListener(panel);
	}

}
