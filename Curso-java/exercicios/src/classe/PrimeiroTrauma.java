package classe;

public class PrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui.
	static int b = 4; // A segunda resolução é transformar em static. static pode acessar static
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); // A primeira forma de resolver é: mesmo estando na mesma classe é necessário realizar o instanciamento. 
		System.out.println(p.a);
		
		
		System.out.println(b);
	}

} 
