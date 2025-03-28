import java.util.LinkedHashSet;
import java.util.Set;

public class _2_PresenteConjunto {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>(
                Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        System.out.println(numeros.contains(5));

    }

}
