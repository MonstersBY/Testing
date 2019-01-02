import Romanchenko.driver.Driver;
import Romanchenko.page.HomePage;
import Romanchenko.page.InternationalPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AllTest {
    private HomePage hPage = new HomePage();
    private InternationalPage iPage = new InternationalPage();

    @Test
    public void startSearch(){
        hPage.startHome();
        hPage.inputNormSearch("Moscow");
        hPage.inputNormalSearchButton();
        hPage.inputSearch404("loli");
    }

    @Test
    public void startSearchInfoAir(){
        hPage.startHome();
        hPage.inFliInfo();
        hPage.chouseFromAir("Osaka (Kobe)");
        hPage.chouseToAir("Okinawa (Naha)");
        hPage.inButSearchInfo();
    }

    @Test
    public void CrossDate(){
        iPage.startInternation();
        iPage.inFromDate();
        iPage.inFromNDate();
        iPage.inExitDate();
        iPage.inToDate();
        iPage.inToNDate();
        iPage.inToCity("Moscow(DME)[DME]");
        iPage.toMoscowDME();
        iPage.inSearcbutFly();
    }

    @Test
    public void OneSity(){
        iPage.startInternation();
        iPage.inToCity("Grodno");
        iPage.inSearchFly();
    }
    @Test
    public void TwoSity(){
        iPage.startInternation();
        iPage.inFromCity("Moscow(DME)[DME]");
        iPage.fromMoscowDME();
        iPage.inToCity("Moscow(DME)[DME]");
        iPage.toMoscowDME();
        iPage.inExiteDateMoscow();
        iPage.inSearcbutFly();
    }

    @Test
    public void PasteTime(){
        iPage.startInternation();
        iPage.inFromDate();
        iPage.inFirstJanuary();
    }


    @AfterClass
    public static void tearDown() {
        Driver.closeDriver();
    }

}
