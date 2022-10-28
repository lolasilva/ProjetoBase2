package ProjetoBaseDois.flows;

import ProjetoBaseDois.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import static ProjetoBaseDois.bases.TestBase.driver;

public class LoginFlows  {


    LoginPage loginPage;


    public LoginFlows(WebDriver driver){
        loginPage = new LoginPage();
    }

    public void efetuarLoginFlows(){
        LoginPage loginPage = new LoginPage(driver);

        String usuario = "generico";
        String senha = "1312@1213";

        loginPage.acessarTelaLogin();
        loginPage.preencherUsuario(usuario);
        loginPage.preencherPassword(senha);
        loginPage.cliclarEmLogar();
    }
}
