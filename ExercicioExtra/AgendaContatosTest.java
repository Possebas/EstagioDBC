import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class AgendaContatosTest
{
    @Test
    public void adiciona3ContatosNaAgenda(){
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionar("Lucas", "78945612");
        agenda.adicionar("Maria","159753456");
        agenda.adicionar("Luiz","123456789");
        assertEquals(3, agenda.getQuantidade());
    }

    @Test
    public void buscaContatoNaAgendaPorTelefone(){
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionar("Lucas","78945612");
        agenda.adicionar("Maria","159753456");
        agenda.adicionar("Luiz","123456789");
        assertEquals("Lucas",agenda.pesquisarContatoPorTelefone("78945612"));
    }

    @Test
    public void buscaContatoNaAgendaPorNumero(){
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionar("Lucas","78945612");
        agenda.adicionar("Maria","159753456");
        agenda.adicionar("Luiz","123456789");
        assertEquals("123456789",agenda.obterPorNome("Luiz"));
    }

    @Test
    public void adicionarContatoEGerarCSV(){
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionar("Marcos","123123123");
        agenda.adicionar("DBC","555555");
        String separador = System.lineSeparator();
        String esperado = String.format("Marcos,123123123%sDBC,555555%s",separador,separador);
        assertEquals(esperado,agenda.csv());
    }
}
