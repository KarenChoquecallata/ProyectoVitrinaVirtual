package Vista;

import java.awt.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Controlador.ControladorIngresoAnuncios;

public class PanelAnuncio extends JPanel {
    JLabel labeltitulo;
    JLabel labeldescripcion;
    JLabel labelcategoria;
	public TextField titulo ;
	public TextArea descripcion;
	 JComboBox<String> combo1;
	JPanel botones ;
	public JButton aceptar;
	public JButton cancelar;
	JPanel encabezado;
	JLabel tituloencabezado;
    JPanel cuerpo;
	public PanelAnuncio() {
		
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		aceptar = new JButton();
		cancelar = new JButton();
		botones = new JPanel();
		cuerpo = new JPanel();
		encabezado = new JPanel();
		tituloencabezado = new JLabel("  PUBLICAR ANUNCION EN PLATAFORMA  ");
		setBorder(new LineBorder(Color.white));
		labeltitulo = new JLabel("TITULO");
		labeldescripcion = new JLabel("DESCRIPCION");
		labelcategoria = new JLabel("CATEGORIA");
		titulo = new TextField("nombre",40);
		descripcion = new TextArea(5,300);
		combo1=new JComboBox<String>();
		
		aceptar.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonaceptar.png")));
		cancelar.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botoncancelar.png")));
		aceptar.setBorder(null);
		cancelar.setBorder(null);
		
		combo1.setBounds(10,10,80,20);
      
        combo1.addItem("IMPORTANTE");
        combo1.addItem("ADMINISTRATIVO");
        combo1.addItem("ESTUDIANTIL");
        combo1.addItem("GENERAL");
        combo1.addItem("SOCIAL");
		inicializarComponentes();
	
		
	}
	public void inicializarComponentes() {
		setBounds(27,27, 840, 500);
		labeltitulo.setBounds(150, 40, 200, 30);
		titulo.setBounds(150, 80, 400, 30);
		labeldescripcion.setBounds(150, 120, 400, 30);
		descripcion.setBounds(150, 160, 400, 150);
		labelcategoria.setBounds(600,  40, 200, 30);
		combo1.setBounds(600, 80,200, 24);
		aceptar.setBackground(Color.WHITE);
		cancelar.setBackground(Color.WHITE);
		botones.setBackground(Color.white);
		
		encabezado.setLayout(null);
		encabezado.setBackground(Color.black);
		tituloencabezado.setBounds(279, 20,300, 24);
		
		cuerpo.setLayout(null);
		cuerpo.setBackground(Color.white);
	
		cuerpo.add(labeltitulo);
		cuerpo.add(titulo);
		cuerpo.add(labeldescripcion);
		cuerpo.add(descripcion);
		cuerpo.add(labelcategoria);
		cuerpo.add(combo1);
		//add(combo1,BorderLayout.CENTER);
		encabezado.add(tituloencabezado);
		botones.add(aceptar);
		botones.add(cancelar);
		add(cuerpo, BorderLayout.CENTER);
		add(botones, BorderLayout.SOUTH);
	   // add(encabezado, BorderLayout.NORTH);
		
	}
    public void setControlador(ControladorIngresoAnuncios controlador) {
    	aceptar.addActionListener(controlador);
    	cancelar.addActionListener(controlador);
    }
}
