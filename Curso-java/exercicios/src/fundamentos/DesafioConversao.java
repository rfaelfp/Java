package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro sal�rio: ");
		String salario1 = entrada.nextLine().replace(',', '.');
		double valor1 = Double.parseDouble(salario1);
		
		System.out.print("Digite o segundo sal�rio: ");
		String salario2 = entrada.nextLine().replace(',', '.');
		double valor2 = Double.parseDouble(salario2);
		
		System.out.print("Digite o terceiro sal�rio: ");
		String salario3 = entrada.nextLine().replace(',', '.');
		double valor3 = Double.parseDouble(salario3);
		
		double total = (valor1 + valor2 + valor3) / 3.0;
		
		System.out.printf("A m�dia salarial � %.2f", total);
		
		entrada.close();
				
	}

}