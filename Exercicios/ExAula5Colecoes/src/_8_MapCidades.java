import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _8_MapCidades {

    public static void main(String[] args) {

        Map<String, Double> populacaoMapa = new HashMap<>(
                Map.of(
                        "Porto Alegre", 1.333e6D,
                        "São Paulo", 11.45e6D,
                        "Rio de Janeiro", 6.211e6D,
                        "Curitiba", 1.774e6D
                )
        );
        populacaoMapa.put("Manaus", 2.064e6);

        Set<Map.Entry<String, Double>> populacaoConjunto = populacaoMapa.entrySet();

        Map.Entry<String, Double> maxPopulacao = populacaoConjunto.iterator().next();
        for (Map.Entry<String, Double> populacao : populacaoConjunto) {
            if (populacao.getValue() > maxPopulacao.getValue()) {
                maxPopulacao = populacao;
            }
        }

        System.out.println("A cidade de " + maxPopulacao.getKey() +
                " possui " + maxPopulacao.getValue() + " sendo a maior população.");
    }

}
