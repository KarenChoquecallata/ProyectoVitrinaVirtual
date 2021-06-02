package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Modelo.Anuncio;

public class PanelCentralAnuncios extends JPanel{
    int indicadorx = 0 ;
    int indicadory = 0 ;
    JPanel cabecera;
    JPanel cuerpo;
    JLabel titulo;
	public PanelCentralAnuncios() {
		cabecera = new JPanel();
		cuerpo  = new JPanel();
		
		setBackground(Color.white);
		setLayout(new GridLayout(2,3,20,20));
		
	}
	public PanelCentralAnuncios(String titulop) {
		titulo = new JLabel(titulop);
		cabecera = new JPanel();
		cuerpo  = new JPanel();
		this.setLayout(new BorderLayout());
		
		setBackground(Color.white);
		cabecera.add(titulo);
		cuerpo.setLayout(new GridLayout(2,3,20,20));
		
		
		add(cabecera, BorderLayout.NORTH);
		add(cuerpo, BorderLayout.CENTER);
		
	}
	
	
	public void enlistarLista(ArrayList<PanelMostrarAnuncio> lista) {
		for(int i = 0 ; i< lista.size();i++) {
			add(lista.get(i));
		}
	}

}
