import java.util.*;

public class Glossario {

	public static void main(String[] args) {
		
		TreeMap<String, String> mapa = new TreeMap<>();
		mapa.put("PALAVRA 1", "SIGNIFICADO 1");
		mapa.put("PALAVRA 3", "SIGNIFICADO 3");
		mapa.put("PALAVRA 2", "SIGNIFICADO 2");
		
		Set<String> chaves = mapa.keySet();
		chaves.forEach(chave -> System.out.println(chave));
		System.out.println("------- Chaves\n");
		
		Collection<String> valores = mapa.values();
		valores.forEach(valor -> System.out.println(valor));
		System.out.println("------- Valores\n");
		
		chaves.forEach(chave -> System.out.println(chave + ": " + mapa.get(chave)));
		System.out.println("------- Chaves - Valores\n");
		
	}

}
