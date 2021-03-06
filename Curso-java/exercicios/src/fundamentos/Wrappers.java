package fundamentos;
public class Wrappers {

	public static void main(String[] args) {



		// Ctrl + shif + f = formatar/identar
		// Para converter de um primitivo para uma classe base colocar o maiusculo no
		// come�o.
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3.0); // Somente mostra casas decimais se colocar o .0
		
		// Pontos flutuantes:
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
	}

}
