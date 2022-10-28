package ProjetoBaseDois.pages;

import ProjetoBaseDois.bases.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends TestBase {


    String urlPaginaLogin = "https://projetobase2.com.br/";
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td/input");
    By validarLogin = By.xpath("/html/body/table[1]/tbody/tr/td[1]/span[1]");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage() {

    }

    public void acessarTelaLogin(){
        driver.get(urlPaginaLogin);
    }

    public void preencherUsuario(String usuario){

        driver.findElement(usernameField).sendKeys(usuario);
    }

    public void preencherPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void cliclarEmLogar(){
        driver.findElement(loginButton).click();
    }

    public void validarLoginComSucesso(String validar){
        String resultado_atual = driver.findElement(validarLogin).getText();
        Assert.assertEquals(validar, resultado_atual);


    }



}