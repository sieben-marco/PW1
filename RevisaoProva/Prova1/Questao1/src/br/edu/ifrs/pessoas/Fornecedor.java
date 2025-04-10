package br.edu.ifrs.pessoas;

import br.edu.ifrs.contatos.Endereco;

public class Fornecedor extends PessoaJuridica {

    private String nomeContato;
    private Endereco endereco;

    public Fornecedor() {}

    public Fornecedor(String cnpj, String razaoSocial, String nomeContato, Endereco endereco) {
        super(cnpj, razaoSocial);
        this.nomeContato = nomeContato;
        this.endereco = endereco;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome = " + nomeContato +
               "\n" + super.toString() +
                "\nEndereço:\n" + this.endereco.toString();
    }
}
