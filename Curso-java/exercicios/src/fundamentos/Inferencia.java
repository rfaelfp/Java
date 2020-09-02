package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		// A infer�ncia surgiu a partir do java 10.
		double a = 4.5;
		System.out.println(a);
		
		// Inferir � deixar para o java atribuir o tipo da vari�vel de acordo com o valor presente na mesma.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		// N�o se pode inferir um valor de outro tipo em uma vari�vel j� definida
		//  c = 4.5;
		
		double d; // Vari�vel foi declarada.
		d = 123.65; // Vari�vel foi iniciada. 
		System.out.println(d); // usada
		
		/* 
		N�o consegue declarar em uma linha e inicializar em outra quando utilizado a infer�ncia.
		var e;
		e = 123.45;
		*/
		
		var f = 12; // inteiro
		// f = 12.01; // flutuante
		// Apresenta problema, pois est� sendo alterado o tipo.
		System.out.println(f);
		
		
	}

}
