package Modelo;

public class Anuncio {
	String titulo;
	String descripcion;
	String categoria;
	public Anuncio(String titulo,String descripcion, String categoria) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
