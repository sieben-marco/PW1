package util;

import javax.persistence.*;

public class JPAUtil {
	public static EntityManagerFactory emf;
	
	public static EntityManager getEntityManager() {
		if (emf == null)
			emf = Persistence.createEntityManagerFactory("Trabalho1");
		
		return emf.createEntityManager();
	}
	
	public static void close() { emf.close(); }
}
