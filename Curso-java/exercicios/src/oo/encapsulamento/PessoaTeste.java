package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Rafael", "Ferreira", 29);
		System.out.println(p1.getIdade());
		
		p1.setIdade(50);
		
		System.out.println(p1.getIdade());
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
	}

}
