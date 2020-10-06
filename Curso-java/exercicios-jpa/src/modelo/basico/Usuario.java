package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Estou dizendo que essa classe usuário ela é uma entidade do banco de dados.
public class Usuario { // Por convenção nome da classe é o mesmo do nome da tabela do banco de dados
	
	@Id // Anotation para referencia o campo do id - chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define diretamente no banco que o campo é autoincremento e não usa outra tabela auxiliar.
	private Long id;
	private String nome; 
	// Por padrão qualquer atributo presente em uma classe está mapeada no banco de dados.
	// @Transient annotation para criar atributo sem ser mapeado para o banco de dados. 
	private String email;
	public Usuario () {
		

	}
	
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}