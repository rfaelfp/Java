package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		// A inferência surgiu a partir do java 10.
		double a = 4.5;
		System.out.println(a);
		
		// Inferir é deixar para o java atribuir o tipo da variável de acordo com o valor presente na mesma.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		// Não se pode inferir um valor de outro tipo em uma variável já definida
		//  c = 4.5;
		
		double d; // Variável foi declarada.
		d = 123.65; // Variável foi iniciada. 
		System.out.println(d); // usada
		
		/* 
		Não consegue declarar em uma linha e inicializar em outra quando utilizado a inferência.
		var e;
		e = 123.45;
		*/
		
		var f = 12; // inteiro
		// f = 12.01; // flutuante
		// Apresenta problema, pois está sendo alterado o tipo.
		System.out.println(f);
		
		
	}

}
