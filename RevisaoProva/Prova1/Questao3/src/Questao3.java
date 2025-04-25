import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Questao3 {
    public static void main(String[] args) throws IOException {
        // 3.1
        Path arquivo = FileSystems.getDefault().getPath("C:", "Diretorio", "Teste").resolve("Teste.txt");
        // 3.2
        new BufferedOutputStream(new FileOutputStream(new File("Q1.txt"))).write("questao1P_prova".getBytes());
        // 3.3
        BufferedReader leitura = new BufferedReader(new FileReader(new File("Q1.txt")));
    }
}
