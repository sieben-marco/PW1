package veiculos;

import pessoas.Proprietario;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro() {
    }

    public Carro(
            String marca, int ano, String modelo,
            String placa, Proprietario proprietario,
            int numPortas) {
        super(marca, ano, modelo, placa, proprietario);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return this.numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return "Tipo -> Carro\n" +
                super.toString() +
                "Número de portas -> " + this.numPortas;
    }
}
