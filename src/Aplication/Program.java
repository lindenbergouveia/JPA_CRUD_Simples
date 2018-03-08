package Aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Funcionario;

public class Program {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario(null,"João Silva","João@hotmail.com");
		Funcionario f2 = new Funcionario(null,"Gabriel Souza","Gabriel@hotmail.com");
		Funcionario f3 = new Funcionario(null,"Thiago Santos","Thiago@hotmail.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); 
		em.persist(f1); 
		em.persist(f2); 
		em.persist(f3); 
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
		
	}
}
