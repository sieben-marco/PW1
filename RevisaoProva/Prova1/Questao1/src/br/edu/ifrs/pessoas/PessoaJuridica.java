package br.edu.ifrs.pessoas;

public class PessoaJuridica {

    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica() {}

    public PessoaJuridica(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "CNPJ = " + cnpj +
                "\nRazão Social = " + razaoSocial;
    }
}
