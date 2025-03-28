package _2;

import java.util.Objects;

public enum OperacoesMatematica {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;

    public static void calcular(double a, double b) {
        for (OperacoesMatematica operacao : OperacoesMatematica.values()) {
            switch (operacao) {
                case SOMA -> System.out.println(a + b);
                case SUBTRACAO -> System.out.println(a - b);
                case MULTIPLICACAO -> System.out.println(a * b);
                case DIVISAO -> System.out.println(a / b);
            }
        }
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
