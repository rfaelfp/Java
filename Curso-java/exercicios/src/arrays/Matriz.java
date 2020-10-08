package arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int qtdAlunos, qtdNotas;
		double total = 0, media = 0;
				
		System.out.println("Digite a quantidade de alunos: ");
		qtdAlunos = entrada.nextInt();
		System.out.println("Digite a quantidade de notas: ");
		qtdNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		for(int i = 0; i < qtdAlunos; i++) {
			for(int j = 0; j < qtdNotas; j++) {
				System.out.println("Digite a " + (j + 1) + "º nota do " + (i + 1) + "º aluno.");
				notasDaTurma[i][j] = entrada.nextDouble(); 
				total += notasDaTurma[i][j];
			}
		}
		
		media = total / qtdAlunos;
		System.out.println("A média da turma é " + media);

		entrada.close();
	}

}
