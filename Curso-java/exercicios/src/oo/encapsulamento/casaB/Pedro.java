package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar); // somente acessado por meio de heran�a, n�o pode atrav�s de instancia.
		System.out.println(todosSabem);
	}

}
