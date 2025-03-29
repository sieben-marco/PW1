package _5;

public enum Operacao implements OperacaoMatematica {

    SOMA {
        @Override
        public double calcular(double a, double b) {
            return a + b;
        }
    },
    SUBTRACAO {
        @Override
        public double calcular(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICACAO {
        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    },
    DIVISAO {
        @Override
        public double calcular(double a, double b) {
            return a / b;
        }
    };
}
