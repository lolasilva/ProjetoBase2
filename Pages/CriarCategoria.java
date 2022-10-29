package ProjetoBaseDois.pages;

import ProjetoBaseDois.bases.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarCategoria extends TestBase {

    By gerenciarButton = By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[7]");
    By gerenciarProjetoButton = By.xpath("/html/body/div[2]/p/span[1]/a");
    By adicinarCategoriaField = By.name("name");
    By adicinarCategoriaButton = By.xpath("/html/body/a/div/table/tbody/tr[46]/td/form/input[4]");


    public CriarCategoria(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarEmGerenciar(){
        driver.findElement(gerenciarBtn).click();
    }

    public void clicarEmGerenciarProjetos(){
        driver.findElement(gerenciarProjetoBtn).click();
    }

    public void adicionarCategoria(String categoria){
        driver.findElement(adicinarCategoriaField).sendKeys(categoria);
    }

    public void clicarEmAdicionarCategoria(){
        driver.findElement(adicinarCategoriaBtn).click();
    }

}
