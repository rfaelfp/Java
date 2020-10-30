package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable // adiciona nas entidades que possuem declarada o Endereco os atributos dessa classe.
public class Endereco {

	private String logradouro;
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
