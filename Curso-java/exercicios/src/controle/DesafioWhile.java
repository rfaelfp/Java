package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double total = 0;
		double nota = 0;
		int contador = 0;
		
		do {
			System.out.println("Digite a nota: ");
			nota = entrada.nextInt();
			if (nota >= 0 && nota <= 10) {
				total += nota;
				contador++;
			}
			else {
				System.out.println("Não é uma nova válida");
			}
		} while (nota != -1);
		
		System.out.println("Soma total das notas: " + total);
		System.out.println("Quantidade de notas válidas: " + contador);
		System.out.println("A média é: " + (total / contador));
		
		entrada.close();
	}

}
