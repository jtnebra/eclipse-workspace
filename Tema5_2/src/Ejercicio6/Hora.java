package Ejercicio6;
import java.util.Scanner;
public class Hora {
	int hora, minutos, segundos;
	public Hora(int minutos, int segundos) {
		
		this.minutos=minutos;
		this.segundos=segundos;
	}
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public void iniciarHora() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("a que hora quieres iniciar la hora: ");
		hora=teclado.nextInt();
	}
	public void sumarHora() {
		Scanner teclado = new Scanner(System.in);
		int horascambio, horafin;
		System.out.println("cuantas horas quieres sumar o restar: ");
		horascambio=teclado.nextInt();
		horafin=hora+(horascambio);
		if(horafin>23) {
			horafin=(hora+(horascambio))-24;
		}else if(horafin<0) {
			horafin=(hora+(horascambio))+24;
		}
		System.out.println("son las "+ horafin+":"+minutos+":"+segundos);
				
	}
	public
	void leerHora() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("a que hora quieres iniciar la hora: ");
		hora=teclado.nextInt();
		System.out.println("son las "+ hora+":"+minutos+":"+segundos);
	}

}
