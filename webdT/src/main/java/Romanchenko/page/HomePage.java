package Romanchenko.page;


import Romanchenko.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    public static void startHome() {
        Driver.getDriver().get("https://www.ana.co.jp/en/jp/");
    }

//    HomePage
    @FindBy(id = "search")
    private WebElement normalSearch;
    @FindBy(id = "btnG")
    private WebElement normalSearchButton;
    @FindBy(id = "id_query")
    private WebElement search404;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[3]/div/div/section[2]/div/div/div/div/ul/li/a")
    private WebElement fliInfo;
//    FlightStatus
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/input")
    private WebElement butSearchInfo;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form[1]/div[1]/div[1]/dl[2]/dd/div/span")
    private WebElement toAirop;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[4]/div/div/div[2]/ul/li[3]")
    private WebElement choseOsaka;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[5]/div/p[2]/a")
    private WebElement closeDate;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form[1]/div[1]/div[2]/dl[3]/dd/dl/dd/ul/li[3]")
    private WebElement clickAddAdult;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form[1]/div[1]/div[2]/dl[3]/dd/div[1]/div/span")
    private WebElement addChildren;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form[1]/div[1]/div[2]/dl[3]/dd/div[2]/dl[1]/dd/ul/li[3]")
    private WebElement clickChildren;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form[1]/div[2]/div[2]/ul/li/div")
    private WebElement butSearch;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[3]/div/div/section[1]/div[1]/div/div/div[1]/ul/li[1]/a")
    private WebElement ManageReservationsPurchase;
    @FindBy(xpath = "//*[@id=\"reserveEmbarkationDay\"]")
    private WebElement DepartureDate;
    @FindBy(xpath = "/html/body/div[8]/div/div/div/div/div[2]/table/tbody/tr[3]/td[5]")
    private WebElement shichijinanaDate;
    @FindBy(xpath = "//*[@id=\"reserveFlightNumber\"]")
    private WebElement FlightNumber;
    @FindBy(xpath = "//*[@id=\"reserveNumber\"]")
    private WebElement ReservationNumber;
    @FindBy(xpath = "//*[@id=\"reserveLastName\"]")
    private WebElement LastName;
    @FindBy(xpath = "//*[@id=\"reserveFirstName\"]")
    private WebElement Name;
    @FindBy(xpath = "/html/body/div[5]/div/div[2]/form/div[2]/div/div/p[1]/input")
    private WebElement SearchManageReservationsPurchase;



    //        HomePageAction
    public void inputNormSearch(String new_name) {
        normalSearch.clear();
        normalSearch.sendKeys(new_name);
    }
    public void inputNormalSearchButton() {
        normalSearchButton.click();
    }
    public void inputSearch404(String new_name) {
        search404.clear();
        search404.sendKeys(new_name);
    }
    public void inFliInfo(){
        fliInfo.click();
    }
    public void chouseFromAir(String new_name){
        Select oSelect = new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div/div/div[2]/div/div/dl/dd[1]/p/select")));
        oSelect.selectByVisibleText(new_name);
    }
    public void chouseToAir(String new_name){
        Select oSelect = new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div/div/div[2]/div/div/dl/dd[3]/p/select")));
        oSelect.selectByVisibleText(new_name);
    }
    public void inButSearchInfo(){
        butSearchInfo.click();
    }

    public void AddAir(){
        toAirop.click();
        choseOsaka.click();
        closeDate.click();
    }

    public void inClickAddAdult(int i){
        for (int j=0; i>j;j++) {
            clickAddAdult.click();
        }
    }
    public void inClickAddChildren(int i){
        addChildren.click();
        for (int j=0; i>j;j++) {
            clickChildren.click();
        }
    }
    public void inButSearch(){
        butSearch.click();
    }

    public void butManageReservationsPurchase(){
        ManageReservationsPurchase.click();
    }
    public void addDepartureDate(){
        DepartureDate.click();
        shichijinanaDate.click();
    }
    public void addFlightNumber(String new_name){
        FlightNumber.sendKeys(new_name);
    }
    public void addReservationNumber(String new_name){
        ReservationNumber.sendKeys(new_name);
    }
    public void addLastName(String new_name){
        LastName.sendKeys(new_name);
    }
    public void addName(String new_name){
        Name.sendKeys(new_name);
    }
    public void addSearchManageReservationsPurchase(){
        SearchManageReservationsPurchase.click();
    }
}
