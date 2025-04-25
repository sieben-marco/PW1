import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExercicioTryComRecursos { // proprio java encerra os recursos
	public static void main(String[] args) {

		File arqE = new File("C:\\Users\\04513901055\\AulaExcecoes\\src\\Arquivo.txt");
		try (FileWriter fw = new FileWriter(arqE)) {
			fw.write('2');
			fw.write("2");
		} catch (IOException e) {
			System.out.println("Exceção na escrita!");
		}
	}
}