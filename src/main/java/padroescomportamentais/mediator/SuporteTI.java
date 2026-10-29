package padroescomportamentais.mediator;

public class SuporteTI implements Setor {

    private static SuporteTI instancia = new SuporteTI();

    private SuporteTI() {}

    public static SuporteTI getInstancia() {
        return instancia;
    }

    public String receberChamado(String mensagem) {
        return "O Suporte de TI abriu o chamado: " + mensagem;
    }

    public String receberUrgencia(String mensagem) {
        return "O Suporte de TI vai atender com prioridade: " + mensagem;
    }
}
