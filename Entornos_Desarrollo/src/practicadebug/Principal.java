package practicadebug;

public class Principal {

	public static void main(String[] args) {
		testea("Zoología"); // solución esperada: o
		testea("Mississippi"); // solución esperada: s
		testea("Pan"); // solución esperada: 0 (no hay repeticiones)
		testea(null); // solución esperada: No debe testearse
	}

	private static void testea(String string) {
		ClaseTester tester = new ClaseTester(string);
		char resultado = tester.primerCaracterRepetido();
		if (resultado == 0)
			System.out.println("En " + string + " no hay caracteres repetidos");
		else
			System.out.println("En " + string + " el primer caracter que se repite es " + resultado);
	}

}

