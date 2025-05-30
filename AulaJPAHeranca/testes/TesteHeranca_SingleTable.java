package testes;
import classes.inheritance.singletable.*;
import dao.CursoGraducaoDAO;

public class TesteHeranca_SingleTable {
	public static void main(String[] args) {
		CursoGraduacao c1 = new CursoGraduacao();
		c1. setTotalAtividadesComplementares(67.44);
		c1.setCargaHorariaTotal(1000.0);
		c1.setNome("Curso YYY");
		CursoGraducaoDAO objDAO = new CursoGraducaoDAO();
		if(objDAO.salvar(c1))
			System.out.println("Curso graducação inserido com sucesso!");
	}
}
