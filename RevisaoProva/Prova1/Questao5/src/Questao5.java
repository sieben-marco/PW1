import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Questao5 {
    public static void main(String[] args) {
        FileReader in = null;
        BufferedReader buff = null;
        try {
            in = new FileReader("teste.txt"); // caminho do arquivo
            buff = new BufferedReader(in, 1024);
            StringBuilder builder = new StringBuilder();
            String s = null;
            while ((s = buff.readLine()) != null) {
                builder.append(s).append("\n");
            }
            System.out.println("Conteudo do arquivo:\n\n" + builder);
        } catch (FileNotFoundException e) {
            System.out.println("arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("erro ao ler arquivo");
        } catch (Exception e) {
            System.out.println("erro inesperado");
        } finally {
            if (in != null && buff != null) {
                try {
                    in.close();
                    buff.close();
                } catch (IOException e) {
                    System.out.println("erro ao fechar recursos");
                }
            }
        }
    }
}