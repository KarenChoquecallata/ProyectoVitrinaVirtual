package Vista;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuLateral extends JPanel{
	 JButton botonMenu,social, estudiantil, administrativo,importante,general, todo;
	public MenuLateral() {
		 social = new JButton();
		 estudiantil = new JButton();
		 administrativo = new JButton();
		 importante = new JButton();
		 general =  new JButton();
		 todo = new JButton();
		 botonMenu= new JButton();
		 
		 social.setBackground(Color.white);
		    estudiantil.setBackground(Color.white);
		    administrativo.setBackground(Color.white);
		    importante.setBackground(Color.white);
		    general.setBackground(Color.white);
		    todo.setBackground(Color.white);
		    botonMenu.setBackground(Color.white);
		    
		    todo.setBorder(null);
		    administrativo.setBorder(null);
		    estudiantil.setBorder(null);
		    general.setBorder(null);
		    botonMenu.setBorder(null);
		    social.setBorder(null);
		    importante.setBorder(null);
		    
		    todo.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonto.png")));
		    importante.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonimportante.png")));
		    general.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botongeneral.png")));
		    botonMenu.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botoningresar.png")));
		    estudiantil.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonestudiantil.png")));
		    administrativo.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonadminis.png")));
		    social.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonsocial.png")));
		    
		  //agregar grafico  a cada boton
		    addGraficosALosBotones(social, "/imagenes/bsocial2.png", "/imagenes/botonsocial.png");
		    addGraficosALosBotones(administrativo, "/imagenes/badministrativo2.png", "/imagenes/botonadminis.png");
		    addGraficosALosBotones(todo, "/imagenes/todo2.png","/imagenes/botonto.png");
		    addGraficosALosBotones(estudiantil, "/imagenes/estudiantil2.png", "/imagenes/botonestudiantil.png");
		    addGraficosALosBotones(general, "/imagenes/general2.png", "/imagenes/botongeneral.png");
		    addGraficosALosBotones(importante, "/imagenes/importante2.png", "/imagenes/botonimportante.png");
		    addGraficosALosBotones(botonMenu, "/imagenes/ingresar2.png", "/imagenes/botoningresar.png");
		    
		    add(botonMenu);
		    add(social);
		    add(estudiantil);
		    add(administrativo);
		    add(importante);
		    add(general);
		    add(todo);
	}

	public void addGraficosALosBotones(JButton buton, String imagen1, String imagen2){
		
		buton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				buton.setIcon(new ImageIcon(PanelPrincipal.class.getResource(imagen1)));
			}
			
			public void mouseExited(MouseEvent e) {
				 buton.setIcon(new ImageIcon(PanelPrincipal.class.getResource(imagen2)));
			}
		});
	}
	
	 public void iniciarAccion(PanelPrincipal panel) {
	    	
		 botonMenu.addActionListener(panel);
		    social.addActionListener(panel);
		    estudiantil.addActionListener(panel);
		    administrativo.addActionListener(panel);
		    importante.addActionListener(panel);
		    general.addActionListener(panel);
		    todo.addActionListener(panel);
		    botonMenu.addActionListener(panel);
			
	}
}
