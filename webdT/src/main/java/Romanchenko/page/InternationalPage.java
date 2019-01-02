package Romanchenko.page;

import Romanchenko.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class InternationalPage {
    WebDriver driver;
    private WebDriverWait wait;

    public InternationalPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    public static void startInternation() {
        Driver.getDriver().get("https://www.ana.co.jp/en/jp/international/");
    }

    //  Internation
    @FindBy(name = "DepApoText")
    private WebElement fromCity;
    @FindBy(name = "ArrApoText")
    private WebElement toCity;
    @FindBy(xpath = "//*[@id=\"TABLE\"]/div[1]/div/dl[1]/dd[1]/div/a")
    private WebElement ClearFromCity;
    @FindBy(xpath = "//*[@id=\"TABLE\"]/div[1]/ul[2]/li[1]")
    private WebElement searchFly;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form/div[2]/div[2]/ul/li[1]/div")
    private WebElement searcbutFly;
    @FindBy(xpath = "//*[@id=\"calImg1\"]")
    private WebElement fromDate;
    @FindBy(xpath = "//*[@id=\"calImg2\"]")
    private WebElement toDate;
    @FindBy(xpath= "//*[@id=\"calendar-wrap\"]/div[1]/table/tbody/tr[2]/td[3]/a")
    private WebElement firstJanuary;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[5]/div/div/div[1]/table/tbody/tr[3]/td[5]/a")
    private WebElement tenJanuary;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[6]/div/div/div[1]/table/tbody/tr[2]/td[6]/a")
    private WebElement fourJanuary;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[6]/div/p[2]/a")
    private WebElement exitDate;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[5]/div/p[2]/a")
    private WebElement exiteDateMoscow;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form/div[1]/ul[1]/li[2]/label")
    private WebElement oneWay;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form/div[1]/dl[3]/dd/dl/dd/ul/li[3]")
    private WebElement clickAddAdult;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form/div[1]/dl[3]/dd/div[2]/dl[1]/dd/ul/li[3]")
    private WebElement clickChildren;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[3]/div/div/section[2]/div/div/div/div/div[2]/ul[1]/li[1]/a")
    private WebElement TheFlightStatusOfCodeshareFlightsOperatedByOtherAirlines;
    @FindBy(name = "departureAirPort_widget")
    private WebElement Dep;
    @FindBy(name = "arrivalAirPort_widget")
    private WebElement Arr;
    @FindBy(xpath = "//*[@id=\"routeEn_0\"]")
    private WebElement searchByOtherAir;

    public void inFromCity(String new_name) {
        ClearFromCity.click();
        fromCity.sendKeys(new_name);
    }
    public void inToCity(String new_name) {
        toCity.sendKeys(new_name);
    }
    public void inSearchFly() {
        searchFly.click();
    }
    public  void  inSearcbutFly(){
        searcbutFly.click();
    }

    public void inFromDate(){
        fromDate.click();
    }
    public void inToDate(){
        toDate.click();
    }
    public void inFirstJanuary(){
//        wait.until(ExpectedConditions.elementToBeClickable(firstJanuary)).click();
        firstJanuary.click();
    }

    public  void  inFromNDate(){
        tenJanuary.click();
    }
    public  void  inToNDate(){
        fourJanuary.click();
    }
    public  void  inExitDate(){
        exitDate.click();
    }
    public void inExiteDateMoscow(){
        exiteDateMoscow.click();
    }

    public void clickeOneWay(){
        oneWay.click();
    }

    public void inClickAddAdult(int i){
        for (int j=0; i>j;j++) {
            clickAddAdult.click();
        }
    }
    public void inClickAddChildren(int i){
        for (int j=0; i>j;j++) {
            clickChildren.click();
        }
    }

    public void butOperByOtherAir(){
        TheFlightStatusOfCodeshareFlightsOperatedByOtherAirlines.click();
    }
    public void inDep(String new_name) {
        Dep.sendKeys(new_name);
    }
    public void inArr(String new_name) {
        Arr.sendKeys(new_name);
    }
    public void butSearchByOtherAir(){
        searchByOtherAir.click();
    }


    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form/div[1]/div/dl[1]/dd[1]/div/div[2]/div/div/ul/li/a")
    private WebElement fromMoscow;
    public  void  fromMoscowDME(){
        fromMoscow.click();
    }
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/div/div/form/div[1]/div/dl[2]/dd[1]/div/div[2]/div/div/ul/li/a")
    private WebElement toMoscow;
    public  void  toMoscowDME(){
        toMoscow.click();
    }

}