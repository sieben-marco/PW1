import java.util.HashSet;
import java.util.Set;

class Automovel {
    private String marca;
    private String modelo;
    private String placa;

    public Automovel() {}
    public Automovel(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s%nModelo: %s%nPlaca: %s",
                              this.marca, this.modelo, this.placa);
    }

}

public class _10_ListarConjunto {

    public static void main(String[] args) {

        Set<Automovel> automoveis = new HashSet<>(Set.of(
                new Automovel("Fiat", "Uno", "123abc"),
                new Automovel("Honda", "Civic", "456def"),
                new Automovel("Toyota", "Corolla", "789ghi")
        ));

        for (Automovel auto : automoveis) {
            System.out.println(auto + "\n-----------");
        }

    }

}
