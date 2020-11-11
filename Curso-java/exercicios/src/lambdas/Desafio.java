package lambdas;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		DecimalFormat f = new DecimalFormat("#.##");
		
		BinaryOperator<Double> precoReal = (n1, n2) -> n1 * (1 - n2);
		
		Function<Double, Double> impostoMunicipal = (preco) -> preco < 2500 ? preco : preco * (1 + 0.085);
		
		Function<Double, Double> frete = (preco) -> preco < 3000 ? preco + 50.0 : preco + 100.0; 
		
		double resultado = precoReal.andThen(impostoMunicipal).andThen(frete).apply(p.preco, p.desconto);
		
		System.out.println(f.format(resultado));
		System.out.println(resultado);
		
	}

}
