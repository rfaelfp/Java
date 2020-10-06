package teste.basico;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); // Respons�vel por criar a conex�o
		EntityManager em = emf.createEntityManager(); // Interface respons�vel por fazer o CRUD � tamb�m encapsula a conex�o com o banco de dados e realiza a persist�ncia.
		
		Usuario novoUsuario = new Usuario("Rafael", "rafael@lanche.com.br");
		
		
		em.getTransaction().begin();;
		em.persist(novoUsuario); // M�todo utilizado para inserir o objeto no banco de dados.
		em.getTransaction().commit();// O persist s� funcina no contexto de transa��o e ao final realizar um commit. 
		
		System.out.println("O Id gerado foi: " + novoUsuario.getId());
		
		em.close();
		emf.close();
	}

}
