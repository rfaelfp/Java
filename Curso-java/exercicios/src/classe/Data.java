package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	// Valores padr�es quando se cria uma vari�vel primitiva desde que n�o estejam no construtor ou metodos n�o precisam ser inicializadas. 
	// btye, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000' primeiro elemento da tabela unicode
	// Objetos -> valor null -> String
	
	// O static no atributo significa que o valor pertence a classe n�o mais � instancia.	
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		
		this(1, 1, 1970); // Realizando o this como m�todo.
	}
	
	
	Data(int dia, int mes, int ano) { // Utiliza-se o this para referenciar o objeto atual, acessando sempre no escopo de instancia, n�o � poss�vel utilizar em metodos statico por exemplo.
		this.dia = dia;
		this.mes = mes; 
		this.ano = ano;
		
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
}
