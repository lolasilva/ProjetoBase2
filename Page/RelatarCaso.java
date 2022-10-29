package ProjetoBaseDois.pages;

import ProjetoBaseDois.bases.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelatarCaso extends TestBase {

    By relatarCasoButton = By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[3]");
    By escolherProjetoCombobox = By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select/option[3]");
    By selecionarProjetoButton = By.xpath("/html/body/div[2]/form/table/tbody/tr[4]/td/input");
    By categoriaCombobox = By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/select/option[15]");
    By frequenciaCombobox = By.xpath("/html/body/div[3]/form/table/tbody/tr[5]");
    By gravidadeCombobox = By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td[2]/select/option[7]");
    By prioridadeCambobox = By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[2]/select/option[4]");
    By selecionarPerfilCombobox = By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td[2]/select/option[3]");
    By resumoField = By.name("summary");
    By descricaoField = By.name("description");
    By passoReproduzirField = By.name("steps_to_reproduce");
    By informacoesAdicionaisField = By.name("additional_info");
    By enviarRelatorioButton = By.xpath("/html/body/div[3]/form/table/tbody/tr[15]/td[2]/input");

    public RelatarCaso (WebDriver webDriver){
        this.driver = driver;
    }

    public void cliclarEmRelatarCaso(){
        driver.findElement(relatarCasoButton).click();
    }

    public void escolherProjeto(){
        driver.findElement(escolherProjetoCombobox).click();
    }


    public void clicarEmSelecionarProjeto(){
        driver.findElement(selecionarProjetoButton).click();
    }

    public void selecionarCategoria(){
        driver.findElement(categoriaCombobox).click();
    }

    public void selecionarFrequencia(){
        driver.findElement(frequenciaCombobox).click();
    }

    public void selecionarGravidade(){
        driver.findElement(gravidadeCombobox).click();
    }

    public void selecionarPrioridade(){
        driver.findElement(prioridadeCambobox).click();
    }

    public void selecionarPerfil(){
        driver.findElement(selecionarPerfilCombobox).click();
    }

    public void preencherResumo(String resumo){
        driver.findElement(resumoField).sendKeys(resumo);
    }

    public void preencherDescricao(String descricao){
        driver.findElement(descricaoField).sendKeys(descricao);
    }

    public void preenchePassosAReproduzir(String reproduzir){
        driver.findElement(passoReproduzirField).sendKeys(reproduzir);
    }

    public void preencherInformacoes(String informacoes){
        driver.findElement(informacoesAdicionaisField).sendKeys(informacoes);
    }



    public void ClicarEmEnviarRelatorio(){
        driver.findElement(enviarRelatorioButton).click();
    }
}
