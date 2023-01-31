package Ejercicio1;

import java.math.*;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[] = new int[20];
		int media = 0, cont = 0, mayores = 0, iguales = 0, menores = 0;
		double ayuda;
		for (int i = 0; i < vector.length; i++) {
			ayuda = Math.random() * 10 + 1;
			cont++;
			vector[i] = (int) ayuda;
			media += vector[i];
		}
		media = media / cont;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == media) {
				iguales++;
			} else if (vector[i] > media) {
				mayores++;
			} else
				menores++;
		}

		System.out.println("los numeros introducidos son: " + cont);
		System.out.println("la media de los numeros es: " + media);
		System.out.println("los numeros mayores que la media son: " + mayores);
		System.out.println("los numeros menores que la media son: " + menores);
		System.out.println("los numeros iguales que la media son: " + iguales);
	}

}
