import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void ordenadaCsv(){
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionar("Lucas","789456123");
        agenda.adicionar("Maria","159753456");
        agenda.adicionar("Luiz","123456789");
        agenda.adicionar("Joao","015004520");
        agenda.adicionar("Ana","741221451");
        assertEquals("Ana:741221451	Joao:015004520	Lucas:789456123	Luiz:123456789	Maria:159753456	",agenda.csv());
    }
}
