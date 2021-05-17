package Controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Modelo.Anuncio;
import Vista.PanelAnuncio;
import Vista.PanelPrincipal;

public class ControladorIngresoAnuncios implements ActionListener{
    ArrayList <Anuncio> listaAnuncios;
    PanelAnuncio panelanuncio;
    PanelPrincipal principal;
    JScrollPane contenedorDePaneles;
	public ControladorIngresoAnuncios(PanelPrincipal principal) {
		this.principal = principal;
		listaAnuncios = new ArrayList<>();
		panelanuncio = new PanelAnuncio();
		principal = new PanelPrincipal();
		panelanuncio.setControlador(this);
		//principal.setControlador(this);
		
		
	}
	public void definirPanel(JPanel panel) {
		contenedorDePaneles.setViewportView(panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == principal.opciones.crear_anuncio) {
			principal.add(panelanuncio, BorderLayout.CENTER);
		    System.out.println("Entra aqui");
		}
		
	}

}
