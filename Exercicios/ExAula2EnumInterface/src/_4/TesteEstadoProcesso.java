package _4;

public class TesteEstadoProcesso {

    public static void main(String[] args) {

        EstadoProcesso processo = EstadoProcesso.NOVO;
        System.out.println("Processo criado");

        processo.iniciar();
        processo.pausar();
        processo.retomar();
        processo.finalizar();

    }

}
