package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Controlador.ControladorIngresoAnuncios;
import Modelo.Administrador;
import Modelo.Anuncio;
import Modelo.ManejoDeDatos;



public class PanelPrincipal extends JPanel  implements ActionListener{
    Image portada = new ImageIcon(getClass().getResource("/imagenes/fondorosa.png")).getImage();
	public PanelOpciones opciones;
    public PanelCentralAnuncios anuncios ;
    JScrollPane contenedorDePaneles;
    PanelAnuncio panelanuncio;
    
    //menu
    MenuLateral menu;
   
    ManejoDeDatos menejoDatos;
    //zona de login
    Login panellogin ;
    Invalido panelinvalido;
 
    ArrayList<PanelMostrarAnuncio> plistanuncios;
    ArrayList<PanelMostrarAnuncio> psociales;
    ArrayList<PanelMostrarAnuncio> pestudiantiles;
    ArrayList<PanelMostrarAnuncio> padministrativos;
    ArrayList<PanelMostrarAnuncio> pimportantes;
    ArrayList<PanelMostrarAnuncio> pgenerales;
    
    //paneles 
    PanelCentralAnuncios paneltodo;
	PanelCentralAnuncios panelestudiantil;
	PanelCentralAnuncios panelgenerales;
	PanelCentralAnuncios paneladmi ;
	 PanelCentralAnuncios panelimportante ;
	 PanelCentralAnuncios panelsociales ;
    
    //datos globales para guardar un anuncio
    String titulo;
    String descripcion;
    String categoria;
    
    
    
	public PanelPrincipal() {
		
		inicializarComponentesGraficos();
		inicializarEstilos();
	    inicializarComponentes();
		
		
	}
	public void inicializarComponentesGraficos() {
	 opciones = new PanelOpciones();
	 anuncios = new PanelCentralAnuncios();
	 panellogin = new Login();
	 panelinvalido = new Invalido();
	 panelanuncio = new PanelAnuncio();
	 menu = new MenuLateral();
     
	 contenedorDePaneles = new JScrollPane();
	 paneltodo=  new PanelCentralAnuncios();
		
	}
	public void inicializarEstilos() {
		setBackground(Color.white);
		setLayout(null);
		panelanuncio.setBounds(27,27, 820, 500);
		menu.setBounds(850, 27, 170, 360);
		menu.setLayout(new GridLayout(0,1,0,10));
	    opciones.setBounds(0,540,1050,110);
	    
	    menu.setBackground(Color.white);

	    contenedorDePaneles.setBackground(Color.WHITE);
	    contenedorDePaneles.setAutoscrolls(false);
	    contenedorDePaneles.setBorder(null);
	    contenedorDePaneles.setBounds(27, 27, 820, 500);
        setBackground(Color.WHITE);
	    
	    opciones.setOpaque(false);
	    contenedorDePaneles.setOpaque(false);
		   
	}
	public void inicializarComponentes() {
		plistanuncios = new ArrayList<>();
		psociales = new ArrayList<>();
		pestudiantiles = new ArrayList<>();
		padministrativos = new ArrayList<>();
		pimportantes = new ArrayList<>();
		pgenerales = new ArrayList<>();

	    // anadiendo accion a los botones
		
	    menejoDatos = new ManejoDeDatos();
	   
	    panelinvalido.iniciarAccion(this);
	    panellogin.iniciarAccion(this);
	    menu.iniciarAccion(this);
	    opciones.iniciarAccion(this);
	    panelanuncio.iniciarAccion(this);
   
	    //generando datos por defecto
	    Anuncio anun1= new Anuncio("Fechas de examenes de mesa", "Los examenes se realizaran en fecha 12/03/21", "ESTUDIANTIL");
	    Anuncio anun2= new Anuncio("Kermesse realizado en colaboracion con la umss", "Se realizaran en la plaza sucre", "SOCIAL");
	    Anuncio anun3= new Anuncio("No existe atencion en ventanillas", "Todas las actividades se detienen por el motivo...", "ADMINISTRATIVO");
	    Anuncio anun4= new Anuncio("Fechas de examenes de mesa 2 opcion", "Los examenes se realizaran en fecha 12/10/21", "ESTUDIANTIL");
		
		insertarAnuncio(anun4);
		insertarAnuncio(anun3);
		insertarAnuncio(anun2);
		insertarAnuncio(anun1);
    
	    add(menu);
	    add(contenedorDePaneles);
	    opciones.setVisible(false);
	    add(opciones);
	  
	    paneltodo.enlistarLista(plistanuncios);
	    definirPanel(paneltodo);
   
	}

	public void insertarAnuncio(Anuncio anuncio) {
		PanelMostrarAnuncio mostrar = new PanelMostrarAnuncio(anuncio);
		String categoria = anuncio.getCategoria();
		switch (categoria) {
		case "SOCIAL": 
			psociales.add(mostrar);
			break;
		case "ESTUDIANTIL":
			pestudiantiles.add(mostrar);
			break;
		
		case "ADMINISTRATIVO":
			padministrativos.add(mostrar);
			break;
		
		case "IMPORTANTE":
			pimportantes.add(mostrar);
			break;

		case "GENERAL":
			pgenerales.add(mostrar);
			break;

		default:
			System.out.println("no existe opcion");
		}
		
		plistanuncios.add(mostrar);
		
	}
	public void ordenarAnuncios(String categoria) {
		switch (categoria) {
		case "SOCIAL": 
			anuncios.enlistarLista(psociales);
			break;
		case "ESTUDIANTIL":
			anuncios.enlistarLista(pestudiantiles);
			break;
		
		case "ADMINISTRATIVO":
			anuncios.enlistarLista(padministrativos);
			break;
		
		case "IMPORTANTE":
			anuncios.enlistarLista(pimportantes);
			break;

		case "GENERAL":
			anuncios.enlistarLista(pgenerales);
			break;

		default:
			System.out.println("no existe opcion");
		}
		
	}
    
	public void actualizarLista(ArrayList<PanelMostrarAnuncio> lista) {
		 for(int i = 0 ; i < lista.size();i++) {
				if(lista.get(i).seleccionado.isSelected()==true) {
					lista.remove(i);
				}
		 }
	}
	public void definirPanel(JPanel panel) {
		contenedorDePaneles.setViewportView(panel);
	}
	public void paint(Graphics g) {
		g.drawImage(portada, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== opciones.crear_anuncio) {
		    definirPanel(panelanuncio);
			panelanuncio.resetDatos();
			}else {
			if(e.getSource()== panelanuncio.aceptar) {
		        Anuncio anuncio1 = new Anuncio(panelanuncio.titulo.getText(), panelanuncio.descripcion.getText(),(String) panelanuncio.combo1.getSelectedItem());
				menejoDatos.addAnuncio(anuncio1);
				insertarAnuncio(anuncio1);
				ordenarAnuncios(categoria);
				definirPanel(anuncios);
			}else {
				if(e.getSource()== panelanuncio.cancelar) {
					definirPanel(paneltodo);
				}else {
					 
					if(e.getSource()== menu.social) {
						panelsociales =  new PanelCentralAnuncios();
					    panelsociales.enlistarLista(psociales);
					    definirPanel(panelsociales);
					}else {
						if(e.getSource()== menu.importante) {
							 panelimportante =  new PanelCentralAnuncios();
							  panelimportante.enlistarLista(pimportantes);  
							    definirPanel(panelimportante);
						}else {
							
							if(e.getSource()==menu.administrativo ) {
								paneladmi =  new PanelCentralAnuncios();
							    paneladmi.enlistarLista(padministrativos);
							    definirPanel(paneladmi);
							}else {
								if(e.getSource()==menu.general) {
									 panelgenerales =  new PanelCentralAnuncios();
								    panelgenerales.enlistarLista(pgenerales);
								    definirPanel(panelgenerales);
								}else {
									if(e.getSource()==menu.estudiantil) {
								        panelestudiantil =  new PanelCentralAnuncios();
									    panelestudiantil.enlistarLista(pestudiantiles);
									    definirPanel(panelestudiantil);
									}else {
										if(e.getSource()==menu.todo) {
											 paneltodo=  new PanelCentralAnuncios();
											 paneltodo.setBackground(Color.WHITE);
										    paneltodo.enlistarLista(plistanuncios);
										    definirPanel(paneltodo);
										}else {
											if(e.getSource()==opciones.borrar_anuncio) {
													for(int i = 0 ; i < plistanuncios.size();i++) {
													plistanuncios.get(i).visibilidad(true);
												}
												opciones.visibilidad(true);
	
											 }else {
												 if(e.getSource()==opciones.confirmarEliminar) {
													 
													 actualizarLista(plistanuncios);
													 actualizarLista(padministrativos);
													 actualizarLista(pestudiantiles);
													 actualizarLista(pgenerales);
													 actualizarLista(pimportantes);
													 actualizarLista(psociales);
													 
													 opciones.setVisible(true);
													 opciones.confirmarEliminar.setVisible(false);
													 for(int i = 0 ; i < plistanuncios.size();i++) {
															plistanuncios.get(i).visibilidad(false);
														}

												 }else {
													 if(e.getSource() == menu.botonMenu) {
														
														 definirPanel(panellogin);
														 panellogin.resetDatos();
														 opciones.setVisible(false);
													 }else {
														 if(e.getSource()==panellogin.AtrasButton) {
															 paneltodo=  new PanelCentralAnuncios();
															 paneltodo.enlistarLista(plistanuncios);
															 definirPanel(paneltodo);
															 opciones.setVisible(false);
															 
														 }else {
															 if(e.getSource()== panellogin.IngresarButton) {
																 
																 boolean sH;
																	
																		sH=panellogin.siHay(panellogin.textFieldUsuario.getText(),panellogin.passwordFieldContraseña.getText(),1,false,panellogin.Administradores.size());
																		if(sH) {
																		definirPanel(paneltodo);
																	 	opciones.setVisible(true);
																		}
																		else {
																		definirPanel(panelinvalido);
																		}
															
															 }else {
																 if(e.getSource()== panelinvalido.btnNewButtonReintentar) {
																	 definirPanel(panellogin);
																	 panellogin.textFieldUsuario.setText("");
																	 panellogin.passwordFieldContraseña.setText("");
																	 
																 }else {
																	 if(e.getSource()==panelinvalido.btnNewButton) {
																		 paneltodo=  new PanelCentralAnuncios();
																		 paneltodo.enlistarLista(plistanuncios);
																		 definirPanel(paneltodo);
																		 opciones.setVisible(false);
																	 }
																 }
																 
																 
																 
															 }
															 
														 }
														 
													 }
												 }
												
											}
										}
									}
									
								}
							}
						}
					}
				}
			}
			
		}
		
	}
}
