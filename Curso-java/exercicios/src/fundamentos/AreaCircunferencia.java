package fundamentos;

public class AreaCircunferencia {
	
	// O main é a porta de entrada de qualquer programa é o primeiro a ser executado
	public static void main(String[] args) {
		double raio = 3.4;
		// O 'final' representa uma atribuição de constante.
		// Uma convenção no java é utilizar constantes com letra maiuscula.
		final double PI = 3.14159;
		
		// Apresenta um erro ao atribuir novo valor para uma constante.
		// pi = 1;
		double area = PI * raio * raio;
		 
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + " m².");
		
	}

}
