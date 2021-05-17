package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Modelo.Anuncio;

public class PanelCentralAnuncios extends JPanel{
    int indicadorx = 0 ;
    int indicadory = 0 ;
    ArrayList<PanelMostrarAnuncio> listanuncios;
	public PanelCentralAnuncios() {
		setBackground(Color.white);
		setLayout(new GridLayout(2,3,20,20));
		listanuncios = new ArrayList<>();

		
	}
	public void insertarAnuncio(Anuncio anuncio) {
		PanelMostrarAnuncio mostrar = new PanelMostrarAnuncio(anuncio);
		
		listanuncios.add(mostrar);
		
	}
	public void ordenarAnuncios() {
		for(int i = 0 ; i< listanuncios.size();i++) {
			add(listanuncios.get(i));
		}
	}

}
