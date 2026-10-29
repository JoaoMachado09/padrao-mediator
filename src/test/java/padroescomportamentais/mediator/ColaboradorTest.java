package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorTest {

    private static final String CABECALHO = "A Central de Atendimento recebeu seu pedido.\n";

    @Test
    void deveAbrirChamadoSuporteTI() {
        Administrativo administrativo = new Administrativo("Ana");
        assertEquals(CABECALHO + "Encaminhado para: TI\n" +
                ">>O Suporte de TI abriu o chamado: Impressora sem conexão",
                administrativo.abrirChamado("TI", "Impressora sem conexão"));
    }

    @Test
    void deveAbrirUrgenciaSuporteTI() {
        Enfermeiro enfermeiro = new Enfermeiro("Bruno");
        assertEquals(CABECALHO + "Encaminhado para: TI\n" +
                ">>O Suporte de TI vai atender com prioridade: Sistema de prontuário fora do ar",
                enfermeiro.abrirUrgencia("TI", "Sistema de prontuário fora do ar"));
    }

    @Test
    void deveAbrirChamadoManutencao() {
        Administrativo administrativo = new Administrativo("Carla");
        assertEquals(CABECALHO + "Encaminhado para: Manutenção\n" +
                ">>A Manutenção agendou o serviço: Lâmpada queimada na sala 3",
                administrativo.abrirChamado("Manutenção", "Lâmpada queimada na sala 3"));
    }

    @Test
    void deveAbrirUrgenciaManutencao() {
        Enfermeiro enfermeiro = new Enfermeiro("Daniel");
        assertEquals(CABECALHO + "Encaminhado para: Manutenção\n" +
                ">>A Manutenção enviou um técnico imediatamente para: Vazamento no centro cirúrgico",
                enfermeiro.abrirUrgencia("Manutenção", "Vazamento no centro cirúrgico"));
    }

    @Test
    void deveAbrirChamadoRecursosHumanos() {
        Enfermeiro enfermeiro = new Enfermeiro("Eduarda");
        assertEquals(CABECALHO + "Encaminhado para: RH\n" +
                ">>O RH registrou a solicitação: Atualização de dados bancários",
                enfermeiro.abrirChamado("RH", "Atualização de dados bancários"));
    }

    @Test
    void naoDeveAbrirChamadoSetorInexistente() {
        try {
            Administrativo administrativo = new Administrativo("Fábio");
            administrativo.abrirChamado("Marketing", "Nova campanha");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Setor inexistente", e.getMessage());
        }
    }

}
