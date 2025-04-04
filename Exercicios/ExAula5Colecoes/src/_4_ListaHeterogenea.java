import java.util.ArrayList;

public class _4_ListaHeterogenea {

    public static void main(String[] args) {

        ArrayList<Number> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2L);
        numeros.add(3.0);
        numeros.add(4.0F);

//        numeros.forEach(n -> System.out.println(n + " = " + n.getClass()));

        for (Number n : numeros) {
            System.out.println(n + " = " + n.getClass());
        }

    }

}
