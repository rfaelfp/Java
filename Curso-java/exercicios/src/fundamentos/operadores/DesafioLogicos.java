package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F) 
		// Trabalho na quinta (V ou F)
		
		Scanner entrada = new Scanner(System.in);
		
		boolean trabalho1 = false;
		boolean trabalho2 =  false;
		int cond1;
		int cond2;
		
		System.out.println("Iniciou trabalho na ter�a?");
		System.out.println("Digite 0 para falso e 1 para verdadeiro: ");
		cond1 = entrada.nextInt();
		
		System.out.println("Iniciou trabalho na quinta?");
		System.out.println("Digite 0 para falso e 1 para verdadeiro: ");
		cond2 = entrada.nextInt();
		
		if (cond1 == 1)
			trabalho1 = true;
		if (cond2 == 1)
			trabalho2 = true;
				
		
		if (trabalho1 == true && trabalho2 == true)
			System.out.println("Comprar televis�o de 50 polegadas");
		else if (trabalho1 == true && trabalho2 == false)
			System.out.println("Comprar televis�o de 32 polegadas");
		else if (trabalho1 == false && trabalho2 == true)
			System.out.println("Comprar televis�o de 32 polegadas");
		else
			System.out.println("Ficar em casa!");
		
			
		if (trabalho1 == true || trabalho2 == true)
			System.out.println("Tomar sorvete");
		
		entrada.close();
		
		
	}

}
