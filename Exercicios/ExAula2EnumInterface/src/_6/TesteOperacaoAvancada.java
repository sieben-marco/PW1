package _6;

public class TesteOperacaoAvancada {

    public static void main(String[] args) {

        double[] n = { 16, 2 };

        for (OperacaoAvancada op : OperacaoAvancada.values()) {
            switch (op) {
                case POTENCIA ->  {
                    double resultado = op.calcular(n[0], n[1]);
                    System.out.printf("%s: %.2f %s %.2f = %.2f%n",
                            op.getNome(), n[0], getOp(op), n[1], resultado);
                }
                case RAIZ_QUADRADA -> {
                    double resultado = op.calcular(n[0], null);
                    System.out.printf("%s: %s%.2f = %.2f%n",
                            op.getNome(), getOp(op), n[0], resultado);
                }
            }
        }

    }

    private static String getOp(OperacaoAvancada op) {

        return switch (op) {
            case POTENCIA -> "^";
            case RAIZ_QUADRADA -> "V¨¨";
        };

    }

}
