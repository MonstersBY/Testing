package Romanchenko.page;

import Romanchenko.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternationalPage {
    WebDriver driver;

    public InternationalPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
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