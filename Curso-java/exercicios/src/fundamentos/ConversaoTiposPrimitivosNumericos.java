package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // impl�cita
		System.out.println(a);
		
		// Quando se faz uma convers�o explicita h� ci�ncia que pode-se perder informa��o.
		float b = (float) 1.1234567; // expl�cita (CAST).
		System.out.println(b);
		
		int c = 240;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // Convers�o explicita mas para um tipo que n�o aceita ponto flutuante o java vai ignorar as casas decimais.
		System.out.println(f);
		
	}

}
