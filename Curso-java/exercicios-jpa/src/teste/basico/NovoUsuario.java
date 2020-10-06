package teste.basico;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); // Responsável por criar a conexão
		EntityManager em = emf.createEntityManager(); // Interface responsável por fazer o CRUD é também encapsula a conexão com o banco de dados e realiza a persistência.
		
		Usuario novoUsuario = new Usuario("Rafael", "rafael@lanche.com.br");
		
		
		em.getTransaction().begin();;
		em.persist(novoUsuario); // Método utilizado para inserir o objeto no banco de dados.
		em.getTransaction().commit();// O persist só funcina no contexto de transação e ao final realizar um commit. 
		
		System.out.println("O Id gerado foi: " + novoUsuario.getId());
		
		em.close();
		emf.close();
	}

}
