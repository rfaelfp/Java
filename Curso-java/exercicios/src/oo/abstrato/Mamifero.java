package oo.abstrato;

public abstract class Mamifero extends Animal{

	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	public  String mamar() {
		return "Usando leite";
	};
}
