import Romanchenko.driver.Driver;
import Romanchenko.page.InternationalPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTwoCity {
    private InternationalPage page = new InternationalPage();

    @BeforeClass
    public static void start() {
        Driver.getDriver().get("https://www.ana.co.jp/en/jp/international/");
    }

    @Test
    public void Sity(){
        page.inFromCity("Moscow(DME)[DME]");
        page.fromMoscowDME();
        page.inToCity("Moscow(DME)[DME]");
        page.toMoscowDME();
        page.inExiteDateMoscow();
        page.inSearcbutFly();
    }

    @AfterClass
    public static void tearDown() {
        Driver.closeDriver();
    }
}
