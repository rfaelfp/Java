package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
