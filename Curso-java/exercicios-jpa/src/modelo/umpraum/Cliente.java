package modelo.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@OneToOne(cascade = CascadeType.PERSIST) // Referencia na tabela que a FK será alocada na presente classe. Deve identificar a preferencia da informação na tabela requerida. A anotation é colocada na tabela de origem.
											// O parametro cascade permite realizar ações no momento da transação indicando a dependencia de outra classe para a persistencia. obs.: há outras opções.
	@JoinColumn(name = "assento_id", unique = true) // Especifica a junção da tabela, definindo a constraint de unique.
	private Assento assento;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
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

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	
	
}
