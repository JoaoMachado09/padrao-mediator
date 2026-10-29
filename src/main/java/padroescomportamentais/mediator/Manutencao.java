package padroescomportamentais.mediator;

public class Manutencao implements Setor {

    private static Manutencao instancia = new Manutencao();

    private Manutencao() {}

    public static Manutencao getInstancia() {
        return instancia;
    }

    public String receberChamado(String mensagem) {
        return "A Manutenção agendou o serviço: " + mensagem;
    }

    public String receberUrgencia(String mensagem) {
        return "A Manutenção enviou um técnico imediatamente para: " + mensagem;
    }
}
