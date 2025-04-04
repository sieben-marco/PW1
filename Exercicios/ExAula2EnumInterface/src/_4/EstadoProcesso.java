package _4;

public enum EstadoProcesso {

    NOVO,
    EM_EXECUCAO,
    PAUSADO,
    FINALIZADO;

    public EstadoProcesso iniciar() {
        System.out.println("Processo em execução");
        return EM_EXECUCAO;
    }

    public EstadoProcesso pausar() {
        System.out.println("Processo pausado");
        return PAUSADO;
    }

    public EstadoProcesso retomar() {
        System.out.println("Processo retomado (em execução)");
        return EM_EXECUCAO;
    }

    public EstadoProcesso finalizar() {
        System.out.println("Processo finalizado");
        return FINALIZADO;
    }

}
