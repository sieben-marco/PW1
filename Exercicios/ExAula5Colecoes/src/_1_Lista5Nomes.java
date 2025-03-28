import java.util.ArrayList;
import java.util.Arrays;

public class _1_Lista5Nomes {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>(
                Arrays.asList("Nome1", "Nome2", "Nome3", "Nome4", "Nome5")
        );

//        nomes.forEach(nome -> System.out.println(nome));
//        nomes.forEach(System.out::println);

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
