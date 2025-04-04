package _3;

public enum Planeta {

    MERCURUIO (3.3011e23, 2439.7),
    VENUS (4.8685e24, 6052),
    TERRA (5.9736e24, 6378),
    MARTE (6.4174e23, 3397),
    JUPTER (1.8986e27, 71492),
    SATURNO (5.6846e26, 60268),
    URANO (8.6810e25, 25559),
    NETUNO (1.0243e26, 24786);

    private final double massa;
    private final double raio;

    Planeta(double massa, double raio) {
        this.massa = massa;
        this.raio = raio;
    }

    public double calcularGravidade() {
        final double G = 6.67430e-11;
        return (G * this.massa) / (raio * raio);
    }

}
