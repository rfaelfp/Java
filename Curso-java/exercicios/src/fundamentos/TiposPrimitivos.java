package fundamentos;
/*
 * O java possui 8 tipos primitivos.
 * Inteiros:
 * 	- Byte -> 1 byte -> -128 at� +127
 * 	- Short -> 2 byte -> +- 32.767 
 * 	- Int -> 4 byte
 * 	- Long -> 8 byte
 * Flutuante:
 * 	- Float - 4 bytes
 * 	- Double 8 bytes -> dobro da capacidade do flaot
 * 
 * Outros primitivos:
 * 	- Char: caractere delimitado por aspas simples.
 * 	- boolean: false ou true.
 * */
public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informa��es dos funcion�rios
		// Tipos num�ricos inteiros
		byte anosEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // O L maiusculo precisa ser indicado no final do valor, quando estourado o range de inteiro (bizarro).
		
		// Tipos num�ricos reais
		float salario = (float) 11_445.44;
		
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true - no java n�o � poss�vel colocar 0 para representar false e 1 para representar false.
			
		// Tipo caractere
		char status = 'A'; // somente aceita uma letra - \a0100 -> utiliza a tabela unicode.
		
		// Dias de empresa
		System.out.println(anosEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
 
}
