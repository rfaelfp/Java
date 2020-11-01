package lambdas;

// A anotation abaixo somente permite que a interface tenha somente um método. 
// Conceito que ajuda a criar as lambdas.
// A implemntação de um método default não inviabiliza a interface funcional.
// A funcionalidade está ligado a um método abstract que no caso do executar é implícito.
// A implementação de um método static também não inviabiliza a interface funcional.
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
