package padraodao;
import java.util.*;

public class TesteDAO {

	public static void main(String[] args) {
		UsuarioDAO objDAO = new UsuarioDAO();

		// Cria uma nova instância de usuário e salva
		Set<String> emails = new HashSet<String>();
		emails.add("fulano1@mail.com");
		emails.add("fulano2@mail.com");
		Usuario user = new Usuario("fulano", "123456", emails);
		user.setPerfil(Perfil.ALUNO);
		user.setDataCadastro(new Date());
		if (objDAO.salvar(user))
			System.out.print("Usuário Fulano foi salvo!!!");

		System.out.println("\nLISTAR TODOS");
		for (Usuario p : objDAO.buscarTodos())
			System.out.printf(p.toString());

		// Recupera o usuário e atualiza com novo identificador
		user.setIdentificador("Beltrano");
		if (objDAO.atualizar(user))
			System.out.println("Usuário Atualizado!!");

		System.out.println("\nLISTAR TODOS");
		for (Usuario userAux : objDAO.buscarTodos())
			System.out.printf(userAux.toString());

		/*if (objDAO.remover(user.getIdUsuario()))
			System.out.printf("Usuário excluído: [ID=%d] = %s\n", user.getIdUsuario(),
					"Coleção vazia? " + (objDAO.buscarTodos().isEmpty()));*/
	}
}
