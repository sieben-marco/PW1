public class Endereco {
    private String logradouro;
    private String complemento;
    private int cep;

    public Endereco() { }

    public Endereco(String logradouro, String complemento, int cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCep() {
        return this.cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "---" +
                "\nEndereco:" +
                "\nlogradouro = " + this.logradouro +
                "\ncomplemento = " + this.complemento +
                "\ncep = " + this.cep;
    }
}
