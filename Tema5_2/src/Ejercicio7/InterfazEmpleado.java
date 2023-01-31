package Ejercicio7;

import java.util.Scanner;

public class InterfazEmpleado {
	static private Scanner teclado = new Scanner(System.in);
	Empleado e;

	public InterfazEmpleado(Empleado e) {
		this.e = e;
	}

	public void verDatos() {
		System.out.println("EL NOMBRE DEL EMPLEADO ES " + e.getnombre() + " Y SU NUMERO D EEMPLEADO ES " + e.getnumero());
	}
	public void leerDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("DIME EL NOMBRE DEL EMPLEADO: ");
		e.setNombre(teclado.nextLine());
		System.out.print("DIME EL NUMERO DE EMPLEADO: ");
		e.setnumero(teclado.nextInt());
		teclado.nextLine();
	}
}
