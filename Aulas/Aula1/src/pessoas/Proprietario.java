package pessoas;

import java.util.ArrayList;
import java.util.List;

import contatos.Telefone;

public class Proprietario {
    private String nome;
    private List<Telefone> telefones;

    public Proprietario() {
    }

    public Proprietario(String nome, ArrayList<Telefone> telefones) {
        this.nome = nome;
        this.telefones = telefones;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return this.telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        String aux = "";

        if (this.telefones != null) {
            for (Telefone telefone : this.telefones) {
                if (telefone != null)
                    aux += telefone.toString() + "\n";
            }
        }

        return "Nome do proprietário -> " + this.nome + "\n" + aux;
    }
}
