package arrays;

import java.util.Scanner;

public class ArrayDesafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas: ");
		int notasQtd = entrada.nextInt();

		double[] notas = new double[notasQtd];
		double total = 0;
		for(int i = 0; i < notas.length; i++) {
			
			System.out.printf("Digite a %dª a nota: ", (i + 1));
			notas[i] = entrada.nextDouble();
		}
		entrada.close();

		for(double nota: notas) {
			total += nota;
			System.out.println(nota);
		}
		System.out.println("A média é " + total/notas.length);
		
	}

}
