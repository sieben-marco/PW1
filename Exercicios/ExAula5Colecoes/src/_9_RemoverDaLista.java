import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _9_RemoverDaLista {

    public static void main(String[] args) {

        // ADICIONA COLEÇÃO AO INSTANCIAR A LISTA
        List<String> palavras = new LinkedList<>(List.of(
                "ABACAXI", "AMÊNDOA", "MELÂNCIA"
        ));
        // ADICIONA ITENS APÓS CRIAR A LISTA
        palavras.add("AMORA");
        palavras.add("BANANA");

        palavras.forEach(System.out::println);

//        Iterator<String> iterator = palavras.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().startsWith("A")) {
//                iterator.remove();
//            }
//        }

//        for (int i = palavras.size() - 1; i >= 0; i--) {
//            if (palavras.get(i).startsWith("A")) {
//                palavras.remove(i);
//            }
//        }

//        for (int i = 0; i < palavras.size(); i++) {
//            if (palavras.get(i).equals("A")) {
//                palavras.remove(i);
//                i--;
//            }
//        }

//        palavras.removeIf(p -> p.startsWith("A"));

        for (Iterator<String> iterator = palavras.iterator(); iterator.hasNext();) {
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println("------------------");

        for (String p : palavras) {
            System.out.println(p);
        }

    }

}
