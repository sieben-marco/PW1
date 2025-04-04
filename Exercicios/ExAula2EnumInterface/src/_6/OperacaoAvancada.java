package _6;

public enum OperacaoAvancada implements Operacao {

    POTENCIA ("Potência") {
        @Override
        public double calcular(double a, Double b) {
            return Math.pow(a, b);
        }
    },
    RAIZ_QUADRADA ("Raiz Quadrada") {
        @Override
        public double calcular(double a, Double b) {
            return Math.sqrt(a);
        }
    };

    private final String nome;

    OperacaoAvancada(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}
