package padroescomportamentais.mediator;

public interface Setor {
    String receberChamado(String mensagem);
    String receberUrgencia(String mensagem);
}
