package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // nota��o obrigat�ria
@Table(name = "produtos", schema = "curso_java") // schema -> amarra o esquema do banco de dados na propria entidade.
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prod_nome", length = 120, nullable = false)
	private String nome;
	
	@Column(name = "pro_preco", nullable = false, precision = 11, scale = 2) // scale -> representa��o da quantidade de casas decimais - 
																			 //precision -> representa todas as casas, inclusive as decimais.
	private Double preco;

	public Produto () {
		
	}
	
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
}
