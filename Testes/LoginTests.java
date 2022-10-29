package ProjetoBaseDois.tests;

import static org.junit.Assert.assertTrue;

import ProjetoBaseDois.bases.TestBase;
import ProjetoBaseDois.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class LoginTests extends TestBase
{
    LoginPage loginPage;


    @Test
    public void efetuarLoginComSucesso()
    {
        LoginPage loginPage = new LoginPage(driver);

        String usuario = "generico";
        String senha = "1312@1213";


        loginPage.acessarTelaLogin();
        loginPage.preencherUsuario(usuario);
        loginPage.preencherPassword(senha);
        loginPage.cliclarEmLogar();
        loginPage.validarLoginComSucesso(usuario);

    }
}
