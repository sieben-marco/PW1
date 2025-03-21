package veiculos;

import pessoas.Proprietario;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto() {
    }

    public Moto(
            String marca, int ano, String modelo,
            String placa, Proprietario proprietario,
            int cilindradas) {
        super(marca, ano, modelo, placa, proprietario);
        this.cilindradas = cilindradas;
    }

    public int getcilindradas() {
        return this.cilindradas;
    }

    public void setcilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Tipo -> Moto\n" +
                super.toString() +
                "Cilindradas -> " + this.cilindradas;
    }
}
