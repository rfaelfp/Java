package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	// Valores padrões quando se cria uma variável primitiva desde que não estejam no construtor ou metodos não precisam ser inicializadas. 
	// btye, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000' primeiro elemento da tabela unicode
	// Objetos -> valor null -> String
	
	// O static no atributo significa que o valor pertence a classe não mais à instancia.	
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		
		this(1, 1, 1970); // Realizando o this como método.
	}
	
	
	Data(int dia, int mes, int ano) { // Utiliza-se o this para referenciar o objeto atual, acessando sempre no escopo de instancia, não é possível utilizar em metodos statico por exemplo.
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
