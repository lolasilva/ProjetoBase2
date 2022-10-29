package ProjetoFinalMantis.tests;

import ProjetoFinalMantis.bases.TestBase;
import ProjetoFinalMantis.flows.LoginFlows;
import ProjetoFinalMantis.pages.AtribuirUsuarioCategoria;
import ProjetoFinalMantis.pages.CriarPerfil;
import org.junit.Test;

public class CriarPerfilTest extends TestBase {

    CriarPerfil criarPerfil;
    LoginFlows loginFlows;

    @Test
    public void criarPerfil() {
        LoginFlows loginFlows = new LoginFlows(driver);
        CriarPerfil criarPerfil = new CriarPerfil(driver);

        String plataforma = "Testes Automatizados";
        String sistemaOperacional = "Windows 11 Testes Automatizados";
        String versao = "11 Testes Automatizados";
        String descricao = "Projeto Base 2 Testes Automatizados";

        loginFlows.efetuarLoginFlows();
        criarPerfil.clicarEmGerenciar();
        criarPerfil.clicarEmGerenciarPerfisGlobais();
        criarPerfil.preencherPlataforma(plataforma);
        criarPerfil.preencherSistemaOperacional(sistemaOperacional);
        criarPerfil.preencherVersaoOS(versao);
        criarPerfil.preencherDescricaoAdicional(descricao);
        criarPerfil.clicarEmAdicionarPerfil();
    }
}
