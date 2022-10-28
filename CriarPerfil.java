package ProjetoBaseDois.pages;

import ProjetoBaseDois.bases.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarPerfil extends TestBase {

    By gerenciarButton = By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[7]");
    By gerenciarPerfilButton = By.xpath("/html/body/div[2]/p/span[3]/a");
    By plataformaField = By.name("platform");
    By sistemaOperacialField = By.name("os");
    By versaoOSField = By.name("os_build");
    By descricaoAdicionalField = By.name("description");
    By adcionarPerfilButton = By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td[2]/input");


    public CriarPerfil(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarEmGerenciar(){
        driver.findElement(gerenciarBtn).click();
    }

    public void clicarEmGerenciarPerfisGlobais(){
        driver.findElement(gerenciarPerfilButton).click();
    }

    public void preencherPlataforma( String plataforma){
        driver.findElement(plataformaField).sendKeys(plataforma);
    }

    public void preencherSistemaOperacional( String os){
        driver.findElement(sistemaOperacialField).sendKeys(os);
    }

    public void preencherVersaoOS( String versao){
        driver.findElement(versaoOSField).sendKeys(versao);
    }

    public void preencherDescricaoAdicional( String descricao){
        driver.findElement(descricaoAdicionalField).sendKeys(descricao);
    }

    public void clicarEmAdicionarPerfil(){
        driver.findElement(adcionarPerfilButton).click();
    }

}
