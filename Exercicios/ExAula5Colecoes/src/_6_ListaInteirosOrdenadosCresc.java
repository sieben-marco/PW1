import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _6_ListaInteirosOrdenadosCresc {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(
                List.of(
                        4, 6, 2, 6, 53, 22, 0, 11, 77, 34, 4
                )
        );

        num.forEach(System.out::println);

        System.out.println("--------");

        Collections.sort(num);
        num.forEach(System.out::println);

    }

}
