package ProjetoBaseDois.testes;

import ProjetoBaseDois.bases.TesteBase;
import ProjetoBaseDois.flows.LoginFlows;
import ProjetoBaseDois.pages.AtribuirUsuarioCategoria;
import ProjetoBaseDois.pages.CriarCategoria;
import org.junit.Test;

public class AtribuirUsuarioCategoriaTestes extends TesteBase {

    AtribuirCategoriaUsuario atribuirCategoriaUsuario;
    LoginFlows loginFlows;

    @Test
    public void atribuirUsuarioCategoria() {
        LoginFlows loginFlows = new LoginFlows(driver);
        AtribuirCategoriaUsuario atribuirCategoriaUsuario = new AtribuirCategoriaUsuario(driver);

        loginFlows.efetuarLoginFlows();
        AtribuirCategoriaUsuario.clicarEmGerenciar();
        atribuirCategoriaUsuario.clicarEmGerenciarProjetos();
        atribuirCategoriaUsuario.clicarEmAlterar();
        atribuirCategoriaUsuario.selecionarUsuario();
        atribuirCategoriaUsuario.atualizarCategoria();
    }
}
