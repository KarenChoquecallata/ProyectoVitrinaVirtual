package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import Controlador.ControladorIngresoAnuncios;
import Modelo.Anuncio;

public class PanelPrincipal extends JPanel  implements ActionListener{
	//Image portada = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")).getImage();
	public PanelOpciones opciones;
    public PanelCentralAnuncios anuncios ;
    JScrollPane contenedorDePaneles;
    PanelAnuncio panelanuncio;
    
    //Guardamos datos en arraylist
    ArrayList <Anuncio> listaanuncios;
    String titulo;
    String descripcion;
    
    
    
    
	public PanelPrincipal() {
		// TODO Auto-generated constructor stub
		setBackground(Color.white);
		setLayout(null);
		
	    inicializarComponentes();
		//add(anuncios);
		
	}
	public void inicializarComponentes() {
		listaanuncios = new ArrayList<>();
		opciones = new PanelOpciones();
	    anuncios = new PanelCentralAnuncios();
	    panelanuncio = new PanelAnuncio();
	    contenedorDePaneles = new JScrollPane();
	    contenedorDePaneles.setBackground(Color.WHITE);
	    contenedorDePaneles.setAutoscrolls(false);
	    contenedorDePaneles.setBorder(null);
	    setBackground(Color.WHITE);
	    anuncios.setBounds(27,27, 980, 500);
	    opciones.setBounds(0,550,1050,100);
	    opciones.setOpaque(false);
	    opciones.crear_anuncio.addActionListener(this);
	    panelanuncio.cancelar.addActionListener(this);
	    panelanuncio.aceptar.addActionListener(this);
	 //   add(contenedorDePaneles,BorderLayout.CENTER);
	    contenedorDePaneles.setBounds(27, 27, 980, 500);
	    add(contenedorDePaneles);
	    add(opciones, BorderLayout.SOUTH);
	    definirPanel(anuncios);
		
	}
//	public void setControlador(ControladorIngresoAnuncios controlador) {
//		opciones.crear_anuncio.addActionListener(controlador);
//		
//	}
	
//	public void paint(Graphics g) {
//		g.drawImage(portada, 0, 0, getWidth(), getHeight(), this);
//		setOpaque(false);
//		super.paint(g);
//	}
	public void definirPanel(JPanel panel) {
		contenedorDePaneles.setViewportView(panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== opciones.crear_anuncio) {
		   panelanuncio.titulo.setText(null);
		   panelanuncio.descripcion.setText(null);
			definirPanel(panelanuncio);
			
			
		}else {
			if(e.getSource()== panelanuncio.aceptar) {
				
				titulo = panelanuncio.titulo.getText();
				descripcion = panelanuncio.descripcion.getText();
				Anuncio anuncio1 = new Anuncio(titulo, descripcion,1);
				listaanuncios.add(anuncio1);
				anuncios.insertarAnuncio(anuncio1);
				anuncios.ordenarAnuncios();
				definirPanel(anuncios);
			}else {
				if(e.getSource()== panelanuncio.cancelar) {
					definirPanel(anuncios);
				}
			}
			
		}
		
	}
}
