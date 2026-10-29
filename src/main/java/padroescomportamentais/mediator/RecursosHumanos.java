package padroescomportamentais.mediator;

public class RecursosHumanos implements Setor {

    private static RecursosHumanos instancia = new RecursosHumanos();

    private RecursosHumanos() {}

    public static RecursosHumanos getInstancia() {
        return instancia;
    }

    public String receberChamado(String mensagem) {
        return "O RH registrou a solicitação: " + mensagem;
    }

    public String receberUrgencia(String mensagem) {
        return "O RH vai tratar com prioridade: " + mensagem;
    }
}
