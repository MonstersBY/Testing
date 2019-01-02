import Romanchenko.driver.Driver;
import Romanchenko.page.HomePage;
import Romanchenko.page.InternationalPage;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
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

    @Test(expectedExceptions = ElementNotInteractableException.class)
    public void TwoSity(){
        iPage.startInternation();
        iPage.inFromCity("Moscow(DME)[DME]");
        iPage.fromMoscowDME();
        iPage.inToCity("Moscow(DME)[DME]");
        iPage.toMoscowDME();
        iPage.inExiteDateMoscow();
        iPage.inSearcbutFly();
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void PasteTime(){
        iPage.startInternation();
        iPage.inFromDate();
        iPage.inFirstJanuary();
    }

    @Test
    public void TestPeople(){
        hPage.startHome();
        hPage.AddAir();
        hPage.inClickAddAdult(2);
        hPage.inClickAddChildren(4);
        hPage.inButSearch();
    }



    @AfterClass
    public static void tearDown() {
        Driver.closeDriver();
    }

}
