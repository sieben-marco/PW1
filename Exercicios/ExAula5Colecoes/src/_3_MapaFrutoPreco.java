import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _3_MapaFrutoPreco {

    public static void main(String[] args) {

        HashMap<String, Double> frutas = new HashMap<>(
                Map.of("Bergamota", 3.8,
                        "Melância", 19.9,
                        "Manga", 5.75
                )
        );

        Set<String> nomes = frutas.keySet();
        for (String nome : nomes) {
            System.out.println(nome + " = " + frutas.get(nome));
        }

//        frutas.forEach((nome, preco) -> System.out.println(nome + " = " + preco));

    }

}
