import java.util.HashSet;
import java.util.Set;

public class _5_SetValorRepetido {

    public static void main(String[] args) {

        HashSet<String> palavras = new HashSet<>(
                Set.of(
                        "Palavra1", "Palavra2", "Palavra3", "Palavra4"
                )
        );

        palavras.forEach(System.out::println);

        System.out.println("-------");

        palavras.add("Palavra1"); // ignora duplicata

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

    }

}
