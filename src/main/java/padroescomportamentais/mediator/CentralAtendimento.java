package padroescomportamentais.mediator;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    private String encaminhar(String nomeSetor, String resposta) {
        return "A Central de Atendimento recebeu seu pedido.\n" +
                "Encaminhado para: " + nomeSetor + "\n" +
                ">>" + resposta;
    }

    public String encaminharChamado(String nomeSetor, String mensagem) {
        Setor setor = buscarSetor(nomeSetor);
        return encaminhar(nomeSetor, setor.receberChamado(mensagem));
    }

    public String encaminharUrgencia(String nomeSetor, String mensagem) {
        Setor setor = buscarSetor(nomeSetor);
        return encaminhar(nomeSetor, setor.receberUrgencia(mensagem));
    }

    private Setor buscarSetor(String nomeSetor) {
        switch (nomeSetor) {
            case "TI":
                return SuporteTI.getInstancia();
            case "Manutenção":
                return Manutencao.getInstancia();
            case "RH":
                return RecursosHumanos.getInstancia();
            default:
                throw new IllegalArgumentException("Setor inexistente");
        }
    }

}
