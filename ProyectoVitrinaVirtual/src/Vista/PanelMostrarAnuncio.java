package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Modelo.Anuncio;

public class PanelMostrarAnuncio extends JPanel {
    JLabel titulo,textotitulo, descripcion, textodescrip;
    
    Anuncio anuncio;
    JPanel encabezado ;
    JButton tituloencabezado;
    JLabel cabeza;
    JPanel cuerpo;
    JRadioButton seleccionado;
   public  JButton mostrarImagen;
    
	public PanelMostrarAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
		inicializarComponentes();
	}
	public void inicializarComponentes() {
		encabezado = new JPanel();
		encabezado.setBackground(Color.white);
		
		tituloencabezado = new JButton();
		tituloencabezado.setBorder(null);
		tituloencabezado.setBackground(Color.WHITE);
		mostrarImagen = new JButton("mostrar");
		ponerEncabezado();
		setLayout(new BorderLayout());
		setOpaque(false);
		
		//seleccionado opcion
//		 seleccionado = new JRadioButton("Marca para eliminar");
		
		//cabeza = new JLabel("ANUNCIO");
		
		
		cuerpo = new JPanel();
		cuerpo.setLayout(null);
		cuerpo.setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		
		setBackground(Color.WHITE);
		seleccionado = new JRadioButton();
		seleccionado.setBackground(Color.white);
		seleccionado.setSize(50, 50);
		
		titulo = new JLabel("TITULO  :");
		textotitulo = new JLabel(anuncio.getTitulo());
		descripcion = new JLabel("DESCRIPCION  :");
		textodescrip = new JLabel(anuncio.getDescripcion());
		titulo.setFont(new Font("Stencil", Font.ROMAN_BASELINE, 10));
		descripcion.setFont(new Font("Stencil", Font.ROMAN_BASELINE, 10));
		seleccionado.setBounds(10, 10, 30, 30);
		titulo.setBounds(20, 20, 300, 24);
		textotitulo.setBounds(20, 40, 300, 24);
		descripcion.setBounds(20, 60, 300, 24);
		textodescrip.setBounds(20, 80, 600, 24);
		mostrarImagen.setBounds(20, 110, 160, 30);
		
		
		//cuerpo.setBorder(new LineBorder(new Color(155, 89, 182 )));
		cuerpo.setBorder(new LineBorder(Color.BLACK));
	    encabezado.add(tituloencabezado);
		cuerpo.add(seleccionado);
		cuerpo.add(titulo);
		cuerpo.add(textotitulo);
		cuerpo.add(descripcion);
		cuerpo.add(textodescrip);
		//cuerpo.add(mostrarImagen);
		
		
		
		add(cuerpo, BorderLayout.CENTER);
		add(encabezado, BorderLayout.NORTH);
		visibilidad(false);
		
	}
	public void visibilidad(boolean estado) {
	
		seleccionado.setVisible(estado);
	}
	public void ponerEncabezado() {
	    String cate= anuncio.getCategoria();
		switch(cate) {
		case "IMPORTANTE":
			tituloencabezado.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/importantetitulo.png")));
			break;
		case "SOCIAL":
			tituloencabezado.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/socialtitulo.png")));

			break;
		case "ADMINISTRATIVO":
			tituloencabezado.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/administrativotitulo.png")));

			break;
		case "ESTUDIANTIL":
			tituloencabezado.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/estudiantiltitulo.png")));

			break;
		case "GENERAL":
			tituloencabezado.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/generaltitulo.png")));

			break;
			
		
		
		}
	}
	public void abrirarchivo(String archivo){

	     try {

	            File objetofile = new File (archivo);
	            Desktop.getDesktop().open(objetofile);

	     }catch (IOException ex) {

	            System.out.println(ex);

	     }

	}                         

}
