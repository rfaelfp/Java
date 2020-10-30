package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>(); // Resolve o tipo do generics quando instanciado. 
		caixaA.guardar("Segredo");
		
		String coisa = caixaA.abrir();
		System.out.println(coisa);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(9.9);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
