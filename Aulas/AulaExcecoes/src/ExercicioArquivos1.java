import java.io.*;

public class ExercicioArquivos1 {

	public static void main(String[] args) {

		// escrita do arquivo
		try (BufferedWriter escrita = new BufferedWriter(
				new FileWriter(new File("C:\\Users\\04513901055\\AulaExcecoes\\src\\ArquivoTextoGrande.txt")))) {
			escrita.write("teste");
			escrita.newLine();
			escrita.write("teste2");
		} catch (NullPointerException e) {
			System.out.println("obj nulo");
		} catch (IOException e) {
			System.out.println("exceção de escrita no arquivo");
		}

		// leitura dos dados do arquivo
		try (BufferedReader leitura = new BufferedReader(
				new FileReader(new File("C:\\Users\\04513901055\\AulaExcecoes\\src\\ArquivoTextoGrande.txt")));) {
			String content;
			while ((content = leitura.readLine()) != null) {
				System.out.println(content);
			}
			leitura.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de leitura não encontrado");
		} catch (IOException e) {
			System.out.println("exceção de leitura no arquivo");
		}

	}

}
