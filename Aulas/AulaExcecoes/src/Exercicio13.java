import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Informe o número para a tabuada:\n");
		int n = entrada.nextInt();
		entrada.nextLine();
		System.out.printf("Informe a pasta:\n");
		String pasta = entrada.nextLine();
		try {
			PrintWriter gravarArq = new PrintWriter(new FileWriter(pasta + "\\tabuada.txt"));
			gravarArq.printf("+--Resultado--+%n");
			for (int i = 1; i <= 10; i++) {
				gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i * n));
			}
			gravarArq.printf("+-------------+%n");
			gravarArq.close();
			System.out.println("\nTabuada do " + n + " foi gravada na " + pasta + "\tabuada.txt\n");
		} catch (FileNotFoundException e) {
			System.out.println("arquivo não encontrado");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
			System.out.println("Sem acesso ao arquivo ou não consegue fechar o arquivo");
		} catch (Exception e) {
			System.out.println("exceção desconhecida");
		}
	}
}