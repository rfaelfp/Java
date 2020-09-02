package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// Ler numero 1 
		// Ler numero 2
		// Operação do usuário
		
		double num1;
		double num2;
		String operacao;
		double resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		num2 = entrada.nextDouble();
		
		System.out.print("Digite a operação (+, -, *, /, %: ");
		operacao = entrada.next();		
		
		resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.println(resultado);
		
		entrada.close();
	}

}
