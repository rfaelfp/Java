package fundamentos.operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		double primeiraParte = Math.pow(6 * (3 + 2), 2) / (3 * 2);
		double segundaParte = Math.pow((1 - 5) * (2 - 7) / 2, 2);
		double terceiaParte = Math.pow(10, 3);
		
		double resultado = Math.pow((primeiraParte - segundaParte), 3) / terceiaParte;
		System.out.printf("O resultado da equa��o �: %.2f", resultado);
		
	}

}