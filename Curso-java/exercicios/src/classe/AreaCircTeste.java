package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		// a.pi = 100000;
		
		
		AreaCirc b = new AreaCirc(5);
		// b.pi = 5;
		
		// AreaCirc.pi = 3.1415; // A forma correta de alterar o valor static da vari�vel pertencente a classe. A vari�vel n�o pode ser uma constante.
		
		System.out.println(a.area());
		System.out.println(b.area());
		System.out.println(AreaCirc.PI);
		System.out.println(AreaCirc.area(100));
	}

}
