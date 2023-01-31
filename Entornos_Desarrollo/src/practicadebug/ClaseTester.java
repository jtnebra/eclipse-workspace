package practicadebug;

public class ClaseTester {
	private String palabra;

	public ClaseTester(String string) {
		palabra = string;
	}

	public char primerCaracterRepetido() {
		for (int i = 0; i < palabra.length(); i++) {
			char caracter = palabra.charAt(i);
			char caracter_siguiente = palabra.charAt(i + 1);
			if (caracter == caracter_siguiente)
				return caracter;
		}
		return 0;
	}
}
