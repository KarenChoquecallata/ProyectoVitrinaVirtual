package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import Modelo.Administrador;

import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
    Image portada = new ImageIcon(getClass().getResource("/imagenes/fondologin6.png")).getImage();

	public JTextField textFieldUsuario;
	public  JPasswordField passwordFieldContraseña;
	public ArrayList<Administrador> Administradores;
	public JButton IngresarButton;
	public JButton AtrasButton ;
	public Login() {
		setLayout(null);
		setOpaque(false);
		this.setBackground(Color.blue);
		Administradores=new ArrayList<>();
        Administrador administrador1=new Administrador("Gabibi","1234");
        Administradores.add(administrador1);
        Administrador administrador2=new Administrador("KarenCh","1234");
        Administradores.add(administrador2);
        
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(400, 190, 100, 20);
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBorder(null);
		add(textFieldUsuario);
		
		passwordFieldContraseña = new JPasswordField();
		passwordFieldContraseña.setBounds(400, 260, 300, 20);
		passwordFieldContraseña.setBorder(null);
		add(passwordFieldContraseña);
		
//		JLabel txtpnUsuario = new JLabel("Nombre de Usuario");
//		txtpnUsuario.setFont(new Font("Stencil", Font.PLAIN, 11));
//	
//		txtpnUsuario.setBounds(200, 160, 200, 20);
//		add(txtpnUsuario);
//		
//		JLabel txtpnContrasea = new JLabel("Contraseña");
//		txtpnContrasea.setFont(new Font("Stencil", Font.PLAIN, 11));
		
//		txtpnContrasea.setBounds(200, 230, 100, 20);
//		add(txtpnContrasea);
		
		IngresarButton = new JButton();
//		IngresarButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				boolean sH;
//				String nom=textFieldUsuario.getText();
//				String con=passwordFieldContraseña.getText();
//				int tam= Administradores.size();
//				
//				sH=siHay(nom,con,1,false,tam);
//			if(sH) {
//				//Se abre tu panel para borrar o crear anuncios 
//			}
//			else {
//				 Invalido inv =new Invalido();
//				}
//					}
//		});
		IngresarButton.setFont(new Font("Stencil", Font.PLAIN, 11));
		IngresarButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botoningresar.png")));
		IngresarButton.setBounds(530, 320, 170,40);
		IngresarButton.setBorder(null);
		IngresarButton.setBackground(Color.WHITE);
		add(IngresarButton);
		
	    AtrasButton = new JButton();
//		AtrasButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				//Mostrar el panel de tu pizarra
//				
//			}
//			
//		});
		AtrasButton.setFont(new Font("Stencil", Font.PLAIN, 11));
		AtrasButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botoncancelar.png")));
		AtrasButton.setBounds(340, 320, 170, 40);
		AtrasButton.setBackground(Color.WHITE);
		AtrasButton.setBorder(null);
		add(AtrasButton);
		
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setIcon(new ImageIcon("/imagenes/User96px.png"));
//		lblNewLabel.setBounds(184, 59, 95, 69);
//		add(lblNewLabel);

	}
	public void paint(Graphics g) {
		g.drawImage(portada, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
	}
	public boolean siHay(String nom, String cont, int pos,boolean si,int tam){
	   boolean respuesta= false;
		for(int i = 0 ; i< tam;i++) {
		   if(nom.equals(Administradores.get(i).getNombre())){
		         if(cont.equals(Administradores.get(i).getContraseña())){
		         respuesta =true;
		         }
		     }
				
			
	   } 
		
		
		
		
		
//		if(pos==tam){
//		     if(nom.equals(Administradores.get(pos).getNombre())){
//		         if(cont.equals(Administradores.get(pos).getContraseña())){
//		         si=true;
//		         }
//		     }
//		}
//		else{
//		     if(nom==Administradores.get(pos).getNombre()){
//		         if(cont==Administradores.get(pos).getContraseña()){
//		         si=true;
//		         }
//		     }
//		     else{
//		     si=siHay(nom, cont,pos+1,si,tam);
//		     }
//
//		}
		return respuesta;
		}
}
