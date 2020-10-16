package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	
	public Pessoa (String nome, String sobrenome, int idade){
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	// Getter
	public int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int idade) {
		if(idade >= 0) {
			this.idade = idade;	
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	public String toString () {
		return "Ola eu sou o " + nome + " e tenho " + idade + " anos.";
	}
	
}
