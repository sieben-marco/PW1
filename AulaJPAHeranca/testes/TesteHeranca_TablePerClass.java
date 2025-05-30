package testes;
import classes.inheritance.joined.Aluno;
import classes.inheritance.tableperclass.*;
import dao.*;

public class TesteHeranca_TablePerClass {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		c1.setNumero(123);
		c1.setSaldo(200.0);
		ContaCorrenteDAO objDAO = new ContaCorrenteDAO();
		if(objDAO.salvar(c1))
			System.out.println("Conta inserida com sucesso!");
		System.out.println("\nLISTAR TODOS");
		for (ContaCorrente c : objDAO.buscarTodos())
			System.out.printf(c.toString());
	
		
		ContaEspecial c2 = new ContaEspecial();
		c2.setNumero(123);
		c2.setSaldo(200.0);
		c2.setLimite(300.0);
		ContaEspecialDAO objDAO2 = new ContaEspecialDAO();
		if(objDAO2.salvar(c2))
			System.out.println("Conta inserida com sucesso!");
		System.out.println("\nLISTAR TODOS");
		for (ContaEspecial c : objDAO2.buscarTodos())
			System.out.printf(c.toString());
		
	}
}
