import java.util.*;

public class _7_SetToListOrdenar {

    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>(
                Set.of(
                        "uva", "banana", "bergamota", "manga"
                )
        );

        System.out.println("Conjunto");
        conjunto.forEach(System.out::println);

        List<String> lista = new ArrayList<>(conjunto);

        System.out.println("------------");

        System.out.println("Lista");
        lista.forEach(l -> System.out.println(l));

        Collections.sort(lista);

        System.out.println("------------");

        System.out.println("Lista ordenada");
        for (String l : lista) {
            System.out.println(l);
        }

    }

}
