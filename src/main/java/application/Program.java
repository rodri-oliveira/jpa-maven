package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Program {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 4);
		if(p != null) {	
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
		}else {
			System.out.println("Pessoa não encontrada.");
		}
		System.out.println(p);

		System.out.println("Pronto");
		em.clear();

		emf.close();
		em.close();
	}

}
