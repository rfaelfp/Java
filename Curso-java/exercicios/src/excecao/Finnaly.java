package excecao;

import java.util.Scanner;

public class Finnaly {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println(7 / entrada.nextInt());
			

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { // o bloco � chamado independente se tiver erro ou n�o.
			System.out.println("Finnaly...");
			entrada.close();
			
		}
		System.out.println("Fim");
	}

}
