package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7;
		// String resultadoParcial = media >= 5.0 ? "em recupera��o." : "reprovado.";
		String resultadoFinal =  media >= 7 ? "aprovado." : media >= 5.0 ? "em recupera��o." : "reprovado."; // Pode ter uma opera��o tern�ria dentro de outra opera��o tern�ria
		System.out.printf("O aluno est� %s", resultadoFinal);
		
		
		
	}

}
