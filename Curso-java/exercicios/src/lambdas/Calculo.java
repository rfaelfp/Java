package lambdas;

// A anotation abaixo somente permite que a interface tenha somente um m�todo. 
// Conceito que ajuda a criar as lambdas.
// A implemnta��o de um m�todo default n�o inviabiliza a interface funcional.
// A funcionalidade est� ligado a um m�todo abstract que no caso do executar � impl�cito.
// A implementa��o de um m�todo static tamb�m n�o inviabiliza a interface funcional.
@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}

}
