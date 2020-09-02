package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X"; // A declara��o de string no java � com letra maiuscula. N�o � tipo primitivo e n�o � palavra reservada.
		s = s.replace("X", "Senhora");
		s = s.toUpperCase(); // O m�todo n�o � alterado ao n�o ser que fa�a a atribui��o.
		s = s.concat("!!!");
		
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase()); // Pode utilizar m�todos diretamente de uma string sem a necessidade de armazenar em uma vari�vel.
		String nome = "Rafael".toUpperCase();
		System.out.println(nome);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!"); // Poss�vel realizar v�rias chamadas em cadeia desde que seja do mesmo tipo.
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador ponto "."
	}

}
