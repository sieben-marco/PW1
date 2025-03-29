package _2;

import java.util.Objects;

public enum OperacoesMatematica {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;

    public double calcular(double a, double b) {
        return switch (this) {
            case SOMA -> a + b;
            case SUBTRACAO -> a - b;
            case MULTIPLICACAO -> a * b;
            case DIVISAO -> a / b;
        };
    }

//    SOMA {
//        @Override
//        protected void calcular(double a, double b) {
//            System.out.println(a + b);
//        }
//    },
//    SUBTRACAO {
//        @Override
//        protected void calcular(double a, double b) {
//            System.out.println(a - b);
//        }
//    },
//    MULTIPLICACAO {
//        @Override
//        protected void calcular(double a, double b) {
//            System.out.println(a * b);
//        }
//    },
//    DIVISAO {
//        @Override
//        protected void calcular(double a, double b) {
//            System.out.println(a / b);
//        }
//    };
//
//    protected abstract void calcular(double a, double b);
//
//    public static void executarCalculos(double a, double b) {
//        for (var operacao : values()) {
//            operacao.calcular(a, b);
//        }
//    }
}
