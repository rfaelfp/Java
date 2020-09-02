package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		// Quando se faz uma conversão explicita há ciência que pode-se perder informação.
		float b = (float) 1.1234567; // explícita (CAST).
		System.out.println(b);
		
		int c = 240;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // Conversão explicita mas para um tipo que não aceita ponto flutuante o java vai ignorar as casas decimais.
		System.out.println(f);
		
	}

}
