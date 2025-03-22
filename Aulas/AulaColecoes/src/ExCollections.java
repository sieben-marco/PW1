import java.util.ArrayList;
import java.util.Collections;

public class ExCollections {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(45);
		numeros.add(22);
		numeros.add(33);
		numeros.add(80);
		
		Collections.sort(numeros);
		
		numeros.forEach(n -> System.out.println(n));
	}
}
