import java.util.TreeMap;

public class TesteOrdenacao1 {
	public static void main(String[] args) {
		TreeMap<String, Cpf> mapa = new TreeMap<>();
		mapa.put("1", new Cpf(1, 1));
		mapa.put("2", new Cpf(2, 2));
		mapa.put("3", new Cpf(3, 3));
		
		TreeMap<Cpf, String> mapa2 = new TreeMap<>();
		mapa2.put(new Cpf(1, 1), "1");
		mapa2.put(new Cpf(2, 2), "2");
		mapa2.put(new Cpf(3, 3), "3");
	}
}
