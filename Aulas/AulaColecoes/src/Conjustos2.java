import java.util.LinkedHashSet;

public class Conjustos2 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> A = new LinkedHashSet<>();
		A.add(1);
		A.add(3);
		A.add(5);
		A.add(6);
		A.add(7);
		
		LinkedHashSet<Integer> B = new LinkedHashSet<>();
		B.add(2);
		B.add(4);
		B.add(6);
		B.add(8);
		
		LinkedHashSet<Integer> C = new LinkedHashSet<>();
		
		A.forEach(a -> System.out.println(a));
		System.out.println("----- A\n");
		
		B.forEach(b -> System.out.println(b));
		System.out.println("----- B\n");
		
		C.addAll(A);
		C.addAll(B);
		C.forEach(c -> System.out.println(c));
		System.out.println("----- União\n");
		
		C.addAll(A);
		C.removeAll(B);
		C.forEach(c -> System.out.println(c));
		System.out.println("----- Diferença\n");
		
		C.addAll(A);
		C.retainAll(B);
		C.forEach(c -> System.out.println(c));
		System.out.println("----- Intersecção\n");
	}
}
