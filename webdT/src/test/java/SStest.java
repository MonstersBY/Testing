import Romanchenko.driver.Driver;
import Romanchenko.page.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SStest {
    private HomePage page = new HomePage();

    @BeforeClass
    public static void start() {
        Driver.getDriver().get("https://www.ana.co.jp/en/jp/");
    }

    @Test
    public void startSearch(){
        page.inputNormSearch("Moscow");
        page.inputNormalSearchButton();
        page.inputSearch404("loli");
    }

    @AfterClass
    public static void tearDown() {
        Driver.closeDriver();
    }



//    private WebDriver driver;
//
//    @BeforeSuite
//    public void start() {
//        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
//        driver=new FirefoxDriver();
//    }
//
//
//    @Test
//    public void navigateToWeb(){
//        driver.get("https://www.ana.co.jp/en/jp/");
//        WebElement searchField=driver.findElement(By.cssSelector("#search"));
//        searchField.clear();
//        searchField.sendKeys("Moskow");
//        WebElement searchButton = driver.findElement(By.cssSelector("#btnG"));
//        searchButton.click();
//    }
//
//
//    @AfterSuite
//    public void finish(){
//        driver.close();
//    }
}
