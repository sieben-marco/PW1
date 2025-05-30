package testes;
import classes.inheritance.joined.*;
import dao.*;

public class TesteHeranca_Joined {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Fulano");
		a1.setMatricula(1234);
		AlunoDAO objDAO = new AlunoDAO();
		if(objDAO.salvar(a1))
			System.out.println("Aluno inserido com sucesso!");
		
		System.out.println("\nLISTAR TODOS");
		for (Aluno a : objDAO.buscarTodos())
			System.out.printf(a.toString());
	}
}
