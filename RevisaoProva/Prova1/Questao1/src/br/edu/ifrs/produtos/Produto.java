package br.edu.ifrs.produtos;

import br.edu.ifrs.pessoas.Fornecedor;

import java.util.LinkedList;
import java.util.List;

public class Produto {

    private long codBarras;
    private String nome;
    private double valor;
    private List<Fornecedor> fornecedores = new LinkedList<>();

    public Produto() {}

    public Produto(long codBarras, String nome, double valor, List<Fornecedor> fornecedores) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.valor = valor;
        this.fornecedores = fornecedores;
    }

    public long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(long codBarras) {
        this.codBarras = codBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedor fornecedor) {
        if (fornecedor == null) return;
        this.fornecedores.add(fornecedor);
    }

    private String listar() {
        if (fornecedores.isEmpty()) {
            return "\nSem fornecedores.";
        }

        boolean flag = false;

        String aux = "";
        byte i = 1;
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor != null) {
                aux += "\nFornecedor " + i + ":\n" + fornecedor.toString();
                flag = true;
                i++;
            }
        }

        if (flag)
            return aux;
        else
            return  "\nFornecedores inválidos.";
    }

    @Override
    public String toString() {
        return "Código de Barras = " + codBarras +
                "\nNome = " + nome +
                "\nValor = " + valor +
                this.listar();
    }
}
