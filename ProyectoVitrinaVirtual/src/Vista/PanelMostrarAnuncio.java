package Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Modelo.Anuncio;

public class PanelMostrarAnuncio extends JPanel{
    JLabel titulo,textotitulo, descripcion, textodescrip;
    Anuncio anuncio;
    JPanel encabezado ;
    JLabel cabeza;
    JPanel cuerpo;
	public PanelMostrarAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
		inicializarComponentes();
	}
	public void inicializarComponentes() {
		encabezado = new JPanel();
		encabezado.setLayout(new BorderLayout());
		
		//cabeza = new JLabel("ANUNCIO");
		
		
		cuerpo = new JPanel();
		cuerpo.setLayout(null);
		cuerpo.setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		setBorder(new TitledBorder(" ANUNCIO "));
		setBackground(Color.WHITE);
		
		titulo = new JLabel("TITULO  :");
		textotitulo = new JLabel(anuncio.getTitulo());
		descripcion = new JLabel("DESCRIPCION  :");
		textodescrip = new JLabel(anuncio.getDescripcion());
		titulo.setBounds(20, 40, 300, 24);
		textotitulo.setBounds(20, 80, 300, 24);
		descripcion.setBounds(20, 120, 300, 24);
		textodescrip.setBounds(20, 160, 300, 24);
		add(encabezado, BorderLayout.CENTER);
		cuerpo.add(titulo);
		cuerpo.add(textotitulo);
		cuerpo.add(descripcion);
		cuerpo.add(textodescrip);
		//encabezado.add(cabeza);
		add(cuerpo, BorderLayout.CENTER);
		add(encabezado, BorderLayout.NORTH);
		
	}
}
