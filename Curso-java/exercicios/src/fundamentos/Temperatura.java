package fundamentos;

public class Temperatura {
	// Tem que haver o método main como ponto de entrada para o nosso programa, sem o método o códgio apresentará um erro.
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		double fahrenheit = 86;
		double resultado  = (fahrenheit - AJUSTE) * FATOR;

		System.out.println("O resultado é " + resultado + "ºC.");
		
		fahrenheit = 150;
		resultado  = (fahrenheit - AJUSTE) * FATOR;

	}

}
