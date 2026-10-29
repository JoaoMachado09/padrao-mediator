package padroescomportamentais.mediator;

public class Colaborador {

    private String nome;

    public Colaborador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String abrirChamado(String setor, String mensagem) {
        return CentralAtendimento.getInstancia().encaminharChamado(setor, mensagem);
    }

    public String abrirUrgencia(String setor, String mensagem) {
        return CentralAtendimento.getInstancia().encaminharUrgencia(setor, mensagem);
    }

}
