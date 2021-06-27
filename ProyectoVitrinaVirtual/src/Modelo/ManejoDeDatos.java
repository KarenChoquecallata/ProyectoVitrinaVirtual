package Modelo;

import java.util.ArrayList;

public class ManejoDeDatos {
	  //Guardamos datos en arraylist
    ArrayList <Anuncio> listaanuncios;
    ArrayList <Anuncio> importantes;
    ArrayList <Anuncio> administrativos;
    ArrayList <Anuncio> estudiantiles;
    ArrayList <Anuncio> generales;
    ArrayList <Anuncio> sociales;
	public ManejoDeDatos() {
		listaanuncios = new ArrayList<>();
		importantes = new ArrayList<>();
		administrativos = new ArrayList<>();
		estudiantiles = new ArrayList<>();
		generales = new ArrayList<>();
		sociales = new ArrayList<>();
	}
	public void addAnuncio(Anuncio anuncio) {
		
		switch (anuncio.getCategoria()) {
		case "SOCIAL": 
			sociales.add(anuncio);
			break;
		case "ESTUDIANTIL":
			estudiantiles.add(anuncio);
			break;
		
		case "ADMINISTRATIVO":
			administrativos.add(anuncio);
			break;
		
		case "IMPORTANTE":
			importantes.add(anuncio);
			break;

		case "GENERAL":
			generales.add(anuncio);
			break;

		default:
			System.out.println("no existe opcion");
		}
		
	}

}
