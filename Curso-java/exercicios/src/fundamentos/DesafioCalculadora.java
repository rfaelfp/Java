package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// Ler numero 1 
		// Ler numero 2
		// Opera��o do usu�rio
		
		double num1;
		double num2;
		String operacao;
		double resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		
		System.out.print("Digite a opera��o (+, -, *, /, %: ");
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
