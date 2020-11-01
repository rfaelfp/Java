package lambdas;

public class Produto extends Object { // toda classe herda de object que � a maior classe do java.

	final String nome;
	final double preco;
	final double desconto;

	public Produto(String nome, double preco, double desconto) {
		super(); // o construtor declara por padr�o o super() que faz referencia ao object quando
					// n�o estiver em um contexto que a heran�a esteja declarada.
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + "tem pre�o de R$" + precoFinal;
	}
}
