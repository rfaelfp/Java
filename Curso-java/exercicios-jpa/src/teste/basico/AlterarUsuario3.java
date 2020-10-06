package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 7L);
		
		em.detach(usuario); // Tira o objeto do estado gerenciado e não realiza a persistencia.
		
		usuario.setNome("Pedro");
				
		// em.merge(usuario); // Utilizando o merge no mesmo contexto do detach obriga o estado gerenciado e realiza a transação.
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
