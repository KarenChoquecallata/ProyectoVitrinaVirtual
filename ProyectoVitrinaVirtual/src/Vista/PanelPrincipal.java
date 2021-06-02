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



public class PanelPrincipal extends JPanel  implements ActionListener{
    Image portada = new ImageIcon(getClass().getResource("/imagenes/fondorosa.png")).getImage();
	public PanelOpciones opciones;
    public PanelCentralAnuncios anuncios ;
    JScrollPane contenedorDePaneles;
    PanelAnuncio panelanuncio;
    
    //menu
    JPanel menu;
    JButton botonMenu,social, estudiantil, administrativo,importante,general, todo;
    
    //zona de login
    Login panellogin ;
    Invalido panelinvalido;
    
    
    //Guardamos datos en arraylist
    ArrayList <Anuncio> listaanuncios;
    ArrayList <Anuncio> importantes;
    ArrayList <Anuncio> administrativos;
    ArrayList <Anuncio> estudiantiles;
    ArrayList <Anuncio> generales;
    ArrayList <Anuncio> sociales;
    
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
		// TODO Auto-generated constructor stub
		setBackground(Color.white);
		setLayout(null);
		
	    inicializarComponentes();
		//add(anuncios);
		
	}
	public void inicializarComponentes() {
		listaanuncios = new ArrayList<>();
		importantes = new ArrayList<>();
		administrativos = new ArrayList<>();
		estudiantiles = new ArrayList<>();
		generales = new ArrayList<>();
		sociales = new ArrayList<>();
		
		plistanuncios = new ArrayList<>();
		psociales = new ArrayList<>();
		pestudiantiles = new ArrayList<>();
		padministrativos = new ArrayList<>();
		pimportantes = new ArrayList<>();
		pgenerales = new ArrayList<>();
		
	    
		opciones = new PanelOpciones();
	    anuncios = new PanelCentralAnuncios();
	    //Inicializando zona de logueo
	    panellogin = new Login();
	    panellogin.setBackground(Color.blue);
	    panelinvalido = new Invalido();
	    
	    //panel para crear un nuevo anuncio
	    panelanuncio = new PanelAnuncio();
	    panelanuncio.setBounds(27,27, 820, 500);
	    
	    //Configurando menu JPanel
	    menu = new JPanel();
	    menu.setBounds(850, 27, 170, 360);
	    
	 
	    // menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
	    menu.setLayout(new GridLayout(0,1,0,10));
	    social =         new JButton();
	    estudiantil =    new JButton();
	    administrativo = new JButton();
	    importante     = new JButton();
	    general =        new JButton();
	    todo           = new JButton();
	    botonMenu      = new JButton();

	   
	    menu.setBackground(Color.white);
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
	    //estudiantil.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/estudiantil.png")));
		social.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				 social.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/bsocial2.png")));
			}
			
			public void mouseExited(MouseEvent e) {
				 social.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonsocial.png")));
			}
		});
		administrativo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				 administrativo.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/badministrativo2.png")));
			}
			
			public void mouseExited(MouseEvent e) {
				 administrativo.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonadminis.png")));
			}
		});
		todo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				 todo.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/todo2.png")));
			}
			
			public void mouseExited(MouseEvent e) {
				 todo.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonto.png")));
			}
		});
		estudiantil.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				 estudiantil.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/estudiantil2.png")));
			}
			
			public void mouseExited(MouseEvent e) {
				 estudiantil.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonestudiantil.png")));
			}
		});
		general.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				 general.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/general2.png")));
			}
			
			public void mouseExited(MouseEvent e) {
				 general.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botongeneral.png")));
			}
		});
		importante.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				importante.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/importante2.png")));
			}
			
			public void mouseExited(MouseEvent e) {
				 importante.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botonimportante.png")));
			}
		});
		botonMenu.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botonMenu.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/ingresar2.png")));
			}
			
			public void mouseExited(MouseEvent e) {
				 botonMenu.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/imagenes/botoningresar.png")));
			}
		});
	    
        
        
	    menu.add(botonMenu);
	    menu.add(social);
	    menu.add(estudiantil);
	    menu.add(administrativo);
	    menu.add(importante);
	    menu.add(general);
	    menu.add(todo);
	    
	    
	    contenedorDePaneles = new JScrollPane();
	    contenedorDePaneles.setBackground(Color.WHITE);
	    contenedorDePaneles.setAutoscrolls(false);
	    contenedorDePaneles.setBorder(null);
	   
	    setBackground(Color.WHITE);
	    
	   // anuncios.setBounds(27,27, 820, 500);
	    opciones.setBounds(0,540,1050,110);
	    opciones.setOpaque(false);
	    
	    // anadiendo accion a los botones
	    
	    panelinvalido.btnNewButtonReintentar.addActionListener(this);
	    panelinvalido.btnNewButton.addActionListener(this);
	    panellogin.AtrasButton.addActionListener(this);
	    panellogin.IngresarButton.addActionListener(this);
	    botonMenu.addActionListener(this);
	    social.addActionListener(this);
	    estudiantil.addActionListener(this);
	    administrativo.addActionListener(this);
	    importante.addActionListener(this);
	    general.addActionListener(this);
	    todo.addActionListener(this);
	    botonMenu.addActionListener(this);
	    opciones.crear_anuncio.addActionListener(this);
	    opciones.borrar_anuncio.addActionListener(this);
	    panelanuncio.cancelar.addActionListener(this);
	    panelanuncio.aceptar.addActionListener(this);
	    opciones.confirmarEliminar.addActionListener(this);
	 //   add(contenedorDePaneles,BorderLayout.CENTER);
	    contenedorDePaneles.setBounds(27, 27, 820, 500);
	    //generando datos por defecto
	    Anuncio anun1= new Anuncio("Fechas de examenes de mesa", "Los examenes se realizaran en fecha 12/03/21", "ESTUDIANTIL");
	    Anuncio anun2= new Anuncio("Kermesse realizado en colaboracion con la umss", "Se realizaran en la plaza sucre", "SOCIAL");
	    Anuncio anun3= new Anuncio("No existe atencion en ventanillas", "Todas las actividades se detienen por el motivo...", "ADMINISTRATIVO");
	    Anuncio anun4= new Anuncio("Fechas de examenes de mesa 2 opcion", "Los examenes se realizaran en fecha 12/10/21", "ESTUDIANTIL");
		listaanuncios.add(anun1);
		listaanuncios.add(anun2);
		listaanuncios.add(anun3);
		listaanuncios.add(anun4);
		insertarAnuncio(anun4);
		insertarAnuncio(anun3);
		insertarAnuncio(anun2);
		insertarAnuncio(anun1);
	    
	    contenedorDePaneles.setOpaque(false);
	    add(menu);
	    add(contenedorDePaneles);
	    opciones.setVisible(false);
	    add(opciones);
	    paneltodo=  new PanelCentralAnuncios();
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
		   panelanuncio.titulo.setText(null);
		   panelanuncio.descripcion.setText(null);
			definirPanel(panelanuncio);
			
			
		}else {
			if(e.getSource()== panelanuncio.aceptar) {
				
				titulo = panelanuncio.titulo.getText();
				descripcion = panelanuncio.descripcion.getText();
				categoria=(String) panelanuncio.combo1.getSelectedItem();
				System.out.println(categoria);
				Anuncio anuncio1 = new Anuncio(titulo, descripcion,categoria);
				switch (categoria) {
				case "SOCIAL": 
					sociales.add(anuncio1);
					break;
				case "ESTUDIANTIL":
					estudiantiles.add(anuncio1);
					break;
				
				case "ADMINISTRATIVO":
					administrativos.add(anuncio1);
					break;
				
				case "IMPORTANTE":
					importantes.add(anuncio1);
					break;

				case "GENERAL":
					generales.add(anuncio1);
					break;

				default:
					System.out.println("no existe opcion");
				}
				
				
				listaanuncios.add(anuncio1);
				insertarAnuncio(anuncio1);
				ordenarAnuncios(categoria);
				definirPanel(anuncios);
			}else {
				if(e.getSource()== panelanuncio.cancelar) {
					definirPanel(paneltodo);
				}else {
					 
					if(e.getSource()== social) {
						
					     panelsociales =  new PanelCentralAnuncios();
					    panelsociales.enlistarLista(psociales);
					    definirPanel(panelsociales);
						System.out.println("ENTRO EN SOCIALES");
					}else {
						if(e.getSource()== importante) {
							 panelimportante =  new PanelCentralAnuncios();
							  panelimportante.enlistarLista(pimportantes);  
							    definirPanel(panelimportante);
								System.out.println("ENTRO EN importante");
						}else {
							
							if(e.getSource()==administrativo ) {
								paneladmi =  new PanelCentralAnuncios();
							    paneladmi.enlistarLista(padministrativos);
							    definirPanel(paneladmi);
								System.out.println("ENTRO EN admin");	
							}else {
								if(e.getSource()==general) {
									 panelgenerales =  new PanelCentralAnuncios();
								    panelgenerales.enlistarLista(pgenerales);
								    definirPanel(panelgenerales);
									System.out.println("ENTRO EN general");	
								}else {
									if(e.getSource()==estudiantil) {
								        panelestudiantil =  new PanelCentralAnuncios();
									    panelestudiantil.enlistarLista(pestudiantiles);
									    definirPanel(panelestudiantil);
										System.out.println("ENTRO EN estudiantil");
									}else {
										if(e.getSource()==todo) {
											 paneltodo=  new PanelCentralAnuncios();
											 paneltodo.setBackground(Color.WHITE);
										    paneltodo.enlistarLista(plistanuncios);
										    definirPanel(paneltodo);
										  //  paneltodo.setOpaque(false);
										    
											System.out.println("ENTRO EN todo");
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
													 if(e.getSource() == botonMenu) {
														// definirPanel(vistalogin);
														 definirPanel(panellogin);
														 panellogin.textFieldUsuario.setText("");
														 panellogin.passwordFieldContraseña.setText("");
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
																	String nom=panellogin.textFieldUsuario.getText();
																	String con=panellogin.passwordFieldContraseña.getText();
																	int tam= panellogin.Administradores.size();
																	
																		sH=panellogin.siHay(nom,con,1,false,tam);
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
