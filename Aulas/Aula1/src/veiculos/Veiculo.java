package veiculos;

import pessoas.Proprietario;

public class Veiculo {
    private String marca;
    private int ano;
    private String modelo;
    private String placa;
    private Proprietario proprietario;

    public Veiculo() {
    }

    public Veiculo(
            String marca, int ano,
            String modelo, String placa,
            Proprietario proprietario) {
        super();
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
        this.proprietario = proprietario;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Marca -> " + this.marca + "\n" +
                "Ano -> " + this.ano + "\n" +
                "Modelo -> " + this.modelo + "\n" +
                "Placa -> " + this.placa + "\n" +
                (this.proprietario != null
                        ? this.proprietario.toString()
                        : "Proprietário inválido");
    }
}
