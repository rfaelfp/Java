package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		// Domingo -> 1
		// Quarta -> 4
		// Ter�a -> 3
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva o dia da semana: ");
		String dia = entrada.next().toLowerCase();
		
		if (dia.equals("domingo")) {
			System.out.println(dia + " = 1");
		}
		else if (dia.equals("segunda")) {
			System.out.println(dia + " = 2");
		}
		else if (dia.equals("ter�a") || dia.equals("terca")) {
			System.out.println(dia + " = 3");
		}
		else if (dia.equals("quarta")) {
			System.out.println(dia + " = 4");
		}
		else if (dia.equals("quinta")) {
			System.out.println(dia + " = 5");
		}
		else if (dia.equals("sexta")) {
			System.out.println(dia + " = 6");
		}
		else if (dia.equals("sabado") || dia.equals("s�bado")) {
			System.out.println(dia + " = 7");
		}
		else {
			System.out.println("N�o � um dia v�lido!");
		}
		
		entrada.close();
		
		
	}

}
