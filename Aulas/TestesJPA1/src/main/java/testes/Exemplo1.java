package testes;

import javax.persistence.*;
import classes.Usuario;

public class Exemplo1 {
	public static void main(String[] args) {
		// usando a class persistence cria uma fabrica de conexão com o bd com a unidade de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testeJPA");
		// cria um gerenciador de objetos
        EntityManager em = emf.createEntityManager();
        Usuario user = new Usuario("sbertagnolli1", "123456");
        em.getTransaction().begin(); // inicia transação
        em.persist(user); // salva
        System.out.println("Usu�rio salvo com sucesso! " );
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}



