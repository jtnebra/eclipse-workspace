package Disco1;

public class Disco {
	String titulo,fecha;
	int numero, precio;
	public Disco (int numero, int precio, String titulo, String fecha) {
		this.numero=numero;
		this.precio=precio;
		this.titulo=titulo;
		this.fecha=fecha;
	}
	public int getnumero() {
		return numero;
	}
	public void setnumero(int numero) {
		this.numero=numero;
	}
	public int getprecio() {
		return precio;
	}
	public void setprecio(int precio) {
		this.precio=precio;
	}
	public String gettitulo() {
		return titulo;
	}
	public void settitulo(String titulo) {
		this.titulo=titulo;
	}
	public String getfecha() {
		return fecha;
	}
	public void setfecha(String fecha) {
		this.fecha=fecha;
	}
	public String toString()  {
		return " " + numero + " " + precio + " " + titulo + " " + fecha; 
	}
	

}
