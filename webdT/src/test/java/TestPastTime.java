import Romanchenko.driver.Driver;
import Romanchenko.page.InternationalPage;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPastTime {
    private InternationalPage page = new InternationalPage();

    @BeforeClass
    public static void start() {
        Driver.getDriver().get("https://www.ana.co.jp/en/jp/international/");
    }

    @Test
    public void PasteTime(){
        page.inFromDate();
        page.inFirstJanuary();
    }

    @AfterClass
    public static void tearDown() {
        Driver.closeDriver();
    }
}
