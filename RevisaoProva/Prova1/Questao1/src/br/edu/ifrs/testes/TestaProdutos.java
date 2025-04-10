package br.edu.ifrs.testes;

import br.edu.ifrs.contatos.Endereco;
import br.edu.ifrs.pessoas.Fornecedor;
import br.edu.ifrs.produtos.Produto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaProdutos {

    public static void main(String[] args) {

        Endereco end = new Endereco("Rua Alguma", "Lugar nenhum");
        List<Fornecedor> forns = new LinkedList<>(List.of(
                new Fornecedor("3333.333.333-0001", "Empresa real", "Algum Funcinário", end)
        ));

        Produto p1 = new Produto(11111111, "Chocolate", 5.40, forns);
        Produto p2 = new Produto();

        List<Produto> prods = new ArrayList<>(List.of(p1, p2));

        for (Produto prod : prods) {
            System.out.println(prod.toString());
            System.out.println("----------------");
        }

    }

}

