package Ejercicio4;

import java.util.Scanner;

public class CuentaCorriente {
	String titular;
	float saldo;

	public CuentaCorriente(String titular, float saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void ingresoDinero() {
		Scanner teclado = new Scanner(System.in);
		float ingreso;
		System.out.println("Tu saldo actual es de: " + saldo);
		System.out.println("Cuanto dinero deseas ingresar");
		ingreso = teclado.nextFloat();
		saldo += ingreso;
		System.out.println("tu saldo actual es de: " + saldo);
	}

	public boolean puedoSacar(int retiro) {
		if (retiro > saldo) {
			return false;
		} else
			return true;
	}

	public void retiroDinero() {
		Scanner teclado = new Scanner(System.in);
		int retiro;
		System.out.println("cuanto dinero quieres retirar: ");
		retiro = teclado.nextInt();
		if (puedoSacar(retiro) == true) {
			saldo -= retiro;
		} else
			System.out.println("el retiro es mayor que le saldo, pulse return");
		System.out.println("Su saldo actual es de " + saldo);
	}
}