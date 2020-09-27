package classe;


public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data(21, 04, 1991);
		Data d3 = d2;
		
		d3.mes = 05;

		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}

}
