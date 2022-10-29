package ProjetoBaseDois.bases;

import ProjetoBaseDois.pages.LoginPage;
import ProjetoBaseDois.tests.LoginTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTeste {

    public static WebDriver driver;


    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();

    }


    @AfterClass
    public static void stop(){
        //driver.quit();
    }
}
