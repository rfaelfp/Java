package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsusario1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Pedro");
		usuario.setEmail("pedro@lanche.com.br");
		
		em.merge(usuario); // Responsável pelo update no banco de dados != persist
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
