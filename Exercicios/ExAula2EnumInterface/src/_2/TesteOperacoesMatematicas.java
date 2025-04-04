package _2;

public class TesteOperacoesMatematicas {
    public static void main(String[] args) {
        double[] n = { 7, 2 };

        for (OperacoesMatematica op : OperacoesMatematica.values()) {
            double resultado = op.calcular(n[0], n[1]);
            System.out.printf("%s: %.2f %c %.2f = %.2f%n",
                    op.name(), n[0], obterOp(op), n[1], resultado);
        }
    }

    private static char obterOp(OperacoesMatematica op) {
        return switch (op) {
            case SOMA -> '+';
            case SUBTRACAO -> '-';
            case MULTIPLICACAO -> '*';
            case DIVISAO -> '/';
        };
    }
}
