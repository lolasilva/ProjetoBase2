package ProjetoBaseDois.tests;

import ProjetoBaseDois.bases.TestBase;
import ProjetoBaseDois.flows.LoginFlows;
import ProjetoBaseDois.pages.RelatarCaso;
import org.junit.Test;

public class RelatarCasoTests extends TestBase {

    RelatarCaso relatarCaso;
    LoginFlows loginFlows;

    @Test
    public void relatarCaso(){
        LoginFlows loginFlows = new LoginFlows(driver);
        RelatarCaso relatarCaso = new RelatarCaso(driver);

        String resumo = "Resumo de teste";
        String descricao = "Projeto Base 2 Testes Automatizados";
        String passos = "Projeto  Base 2";
        String informacoes = "Projeto realizado durante o BootCamp Base 2";

        loginFlows.efetuarLoginFlows();
        relatarCaso.cliclarEmRelatarCaso();
        relatarCaso.escolherProjeto();
        relatarCaso.clicarEmSelecionarProjeto();
        relatarCaso.selecionarCategoria();
        relatarCaso.selecionarFrequencia();
        relatarCaso.selecionarGravidade();
        relatarCaso.selecionarPrioridade();
        relatarCaso.selecionarPerfil();
        relatarCaso.preencherResumo(resumo);
        relatarCaso.preencherDescricao(descricao);
        relatarCaso.preenchePassosAReproduzir(passos);
        relatarCaso.preencherInformacoes(informacoes);
        relatarCaso.ClicarEmEnviarRelatorio();


    }
}
