package Ejercicio5;

import java.util.Scanner;

public class Indicador {
	int nivel, velocidad, tacometro;

	public Indicador(int nivel, int velocidad, int tacometro) {
		this.nivel = nivel;
		this.velocidad = velocidad;
		this.tacometro = tacometro;
	}

	public int getNivel() {
		return nivel;
	}

	public void SetNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getTacometro() {
		return tacometro;
	}

	public void setTacometro(int tacometro) {
		this.tacometro = tacometro;
	}

	public void leerValores() {
		System.out.println(nivel);
		System.out.println(velocidad);
		System.out.println(tacometro);
	}

	public void operarValores() {
		Scanner teclado = new Scanner(System.in);
		int nivelm, velocidadm, tacometrom;
		System.out.println("Cuanto quieres modificar el nivel: ");
		nivelm = teclado.nextInt();
		nivel += nivelm;
		System.out.println("Cuanto quieres modificar la velocidad: ");
		velocidadm = teclado.nextInt();
		velocidad += velocidadm;
		System.out.println("Cuanto quieres modificar el tacometro: ");
		tacometrom = teclado.nextInt();
		tacometro += tacometrom;
		System.out.println("el valor de nivel es: " + nivel);
		System.out.println("el valor de velocidad es: " + velocidad);
		System.out.println("el valor del tacometro es: " + tacometro);

	}

}
