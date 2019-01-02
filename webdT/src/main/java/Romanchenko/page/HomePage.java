package Romanchenko.page;


import Romanchenko.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
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
}
