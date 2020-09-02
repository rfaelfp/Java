package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
	
		java.lang.String b = "Boa tarde!";
		java.lang.System.out.println(b); // Demonstra que as classes utilizadas são puxados do java.lang, não precisa colocar pois é o pacote mais básico do java.
		
		Date d = new Date();
		System.out.println(d);
		
		// JButton botao = new JButton();
	}
}


// HOT KEY = Ctrl + Shift + o