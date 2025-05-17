package testes;

import util.JPAUtil;
import java.util.*;
import classes.Usuario;
import javax.persistence.*;

public class Exemplo6 {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        TypedQuery<Usuario> query = 
           em.createQuery("SELECT obj FROM Usuario obj", Usuario.class);
        List<Usuario> usuarios= query.getResultList();
        for (Usuario usuario : usuarios) {
			System.out.println(usuario.toString());
		}
       	em.close();
       	JPAUtil.close();
    }
}
