package Ejercicio3;

import java.util.Scanner;

public class Trabajador {
	int numero, titulacion, antiguedad;
	String nombre;
	char estado, turno;

	public Trabajador(int numero, int titulacion, int antiguedad, String nombre, char estado, char turno) {
		this.numero = numero;
		this.titulacion = titulacion;
		this.antiguedad = antiguedad;
		this.nombre = nombre;
		this.estado = estado;
		this.turno = turno;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(int titulacion) {
		this.titulacion = titulacion;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public void trabajadornuevo() {
		numero = 1;
		titulacion = 0;
		antiguedad = 0;
		nombre = "Juan";
		estado = 'C';
		turno = 'D';
	}

	public void modificardatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("DIME EL NOMBRE DEL EMPLEADO: ");
		nombre = teclado.nextLine();
		do {
			System.out.println("DIME LA TITULACION DEL EMPLEADO: ");
			titulacion = teclado.nextInt();
		} while (titulacion < 0 && titulacion > 4);
		System.out.println("DIME LA ANTIGUEDAD DEL EMPLEADO: ");
		antiguedad = teclado.nextInt();
		System.out.println("DIME EL ESTADO DEL EMPLEADO: ");
		estado = teclado.next().charAt(0);

		System.out.println("DIME EL TURNO DEL EMPLEADO: ");
		turno = teclado.next().charAt(0);

	}

	public void leertrabajador() {
		System.out.println("EL NUMERO IDENTIFICATIVO ES " + numero);
		System.out.println("SU TITULACION ES " + titulacion);
		System.out.println("SU ANTIGUEDAD ES " + antiguedad);
		System.out.println("SU NOMBRE ES " + nombre);
		System.out.println("SU ESTADO ES " + estado);
		System.out.println("SU TURNO ES " + turno);
	}

	public void calcularNomina() {
		int extra, noctur = 0, titu = 0;
		double retencion = 0, salario, nomina;
		salario = 425;
		if (turno == 'N') {
			noctur = 100;
		} else if (turno == 'D')
			noctur = 0;
		else
			System.out.println("no estan los datos bien");

		switch (titulacion) {
		case 0:
			titu = 250;
			break;
		case 1:
			titu = 500;
			break;
		case 2:
			titu = 1000;
			break;
		case 3:
			titu = 1250;
			break;
		case 4:
			titu = 1500;
			break;
		default:
			System.out.println("los datos no estan bien introducidos");
		}
		if (estado == 'C') {
			retencion = 0.10;
		} else if (estado == 'S')
			retencion = 0.12;
		else
			System.out.println("los datos estan mal introducidos");
		nomina = salario + noctur + titu + (75 * antiguedad)
				- (retencion * (salario + noctur + titu + (75 * antiguedad)));
		System.out.println("la nomina de "+ nombre + " es de "+nomina);
	}

}
