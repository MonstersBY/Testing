import Romanchenko.driver.Driver;
import Romanchenko.page.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestJapanInfoFli {
    private HomePage page = new HomePage();

    @BeforeClass
    public static void start() {
        Driver.getDriver().get("https://www.ana.co.jp/en/jp/");
    }

    @Test
    public void startSearch(){
        page.inFliInfo();
        page.chouseFromAir("Osaka (Kobe)");
        page.chouseToAir("Okinawa (Naha)");
        page.inButSearchInfo();
    }

    @AfterClass
    public static void tearDown() {
        Driver.closeDriver();
    }
}
