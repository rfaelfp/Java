package classe;

public class PrimeiroTrauma {
	
	int a = 3; // n�o pode mexer aqui.
	static int b = 4; // A segunda resolu��o � transformar em static. static pode acessar static
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); // A primeira forma de resolver �: mesmo estando na mesma classe � necess�rio realizar o instanciamento. 
		System.out.println(p.a);
		
		
		System.out.println(b);
	}

} 
