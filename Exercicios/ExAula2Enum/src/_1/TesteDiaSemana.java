package _1;

public class TesteDiaSemana {
    public static void main(String[] args) {
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia.ordinal()+1 + " - " + dia);
        }
    }
}
