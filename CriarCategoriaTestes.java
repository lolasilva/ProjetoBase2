package ProjetoBaseDois.tests;

import ProjetoBaseDois.bases.TestBase;
import ProjetoBaseDois.flows.LoginFlows;
import ProjetoBaseDois.pages.CriarCategoria;
import org.junit.Test;

public class CriarCategoriaTests extends TesteBase {

    CriarCategoria criarCategoria;
    LoginFlows loginFlows;


    @Test
    public void adicionarCategoria(){
        LoginFlows loginFlows = new LoginFlows(driver);
        CriarCategoria criarCategoria = new CriarCategoria(driver);

        String categoria = "Testes Automatizados";

        loginFlows.efetuarLoginFlows();
        criarCategoria.clicarEmGerenciar();
        criarCategoria.clicarEmGerenciarProjetos();
        criarCategoria.adicionarCategoria(categoria);
        criarCategoria.clicarEmAdicionarCategoria();

    }
}
