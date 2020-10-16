package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Uno;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro uno = new Uno();
		Ferrari ferrari = new Ferrari();
		
		System.out.println(uno);
		System.out.println(ferrari);
		
		ferrari.ligarTurbo();
		
		System.out.println(ferrari.velocidadeAr());
		
		uno.acelerar();
		ferrari.acelerar();
		uno.acelerar();
		ferrari.acelerar();
		ferrari.desligarTurbo();
		uno.acelerar();
		ferrari.acelerar();
		
		
		System.out.println(uno);
		System.out.println(ferrari);
	}

}
