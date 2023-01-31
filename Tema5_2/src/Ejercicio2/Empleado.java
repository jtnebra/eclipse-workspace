package Ejercicio2;

import java.util.Scanner;

public class Empleado {
	String nombre;
	int numero;

	public Empleado(int numero, String nombre) {
		this.nombre = nombre;
		this.numero = numero;
	}

	public String getnombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getnumero() {
		return numero;
	}

	public void setnumero(int numero) {
		this.numero = numero;
	}

	public void leerDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("DIME EL NOMBRE DEL EMPLEADO: ");
		nombre = teclado.nextLine();
		System.out.print("DIME EL NUMERO DE EMPLEADO: ");
		numero = teclado.nextInt();
	}

	public void verDatos() {
		System.out.println("EL NOMBRE DEL EMPLEADO ES " + nombre + " Y SU NUMERO D EEMPLEADO ES " + numero);
	}
}
