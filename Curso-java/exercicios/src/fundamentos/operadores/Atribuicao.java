package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3; // Valores
		int b = a; // Outras vari�veis
		int c = a + b; // Uma express�o
		
		c += b; // = c = c + b;
		c -= a;
		c *= b;
		c /= a;
		System.out.println(c);
		c %= 2; // c = c % 2
		
		System.out.println(c);
		
		
	}

}
