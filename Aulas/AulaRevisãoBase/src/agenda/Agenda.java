package agenda;

import java.util.TreeSet;

import pessoas.ComparatorNome;
import pessoas.Pessoa;

public class Agenda implements OperacoesAgenda<Pessoa> {
	
	private TreeSet<Pessoa> conjunto = new TreeSet<>(new ComparatorNome());
	
	@Override
	public boolean cadastrar(Pessoa p) {
		return this.conjunto.add(p);
	}

	@Override
	public String listaTodos() {
		String aux = "";
		for (Pessoa p : this.conjunto) {
			if (p != null) {
				aux += p.toString();
			}
		}
		return aux;
	}

	@Override
	public int totalizar() {
		return this.conjunto.size();
	}

	@Override
	public boolean pesquisar(Pessoa p) {
		return this.conjunto.contains(p);
	}

	@Override
	public boolean remover(Pessoa p) {
		return this.conjunto.remove(p);
	}

}
