package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor. c�pia do valor � definido na mem�ria. (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribui��o por refer�ncia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5; 
		AlterarPrimitivo(c);
		System.out.println(c);
	}
	static void voltarDataParaValorPadrao(Data d) { // A passagem sempre � da instancia/objeto, sempre ser� por refer�ncia.  
		d.dia = 1;
		d.mes = 1; 
		d.ano = 1970;
	}
	
	static void AlterarPrimitivo(int a) { // Como a passagem � por valor n�o vai haver altera��o na origem. 
		a++;
	}

}
