package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa (String nome, int peso) {
		this.nome = nome; 
		this.peso = peso; 
	}
	
	void comer(Comida a) {
		if (a != null) {
			this.peso += a.peso;
		}
	}
	
	String apresentar () {
		return "Ola eu sou o " + nome + " e tenho " + peso + "kg";
		
	}

}