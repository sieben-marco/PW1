package _3;

public class TestePlaneta {

    public static void main(String[] args) {

        for (Planeta p : Planeta.values()) {
            System.out.println(p + ": " + p.calcularGravidade());
        }

    }

}
