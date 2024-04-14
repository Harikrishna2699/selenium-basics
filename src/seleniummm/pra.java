package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pra {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        driver.manage().window().maximize();
        WebElement mob = driver.findElement(By.xpath("//span[text()='Mobiles']"));
        Actions ac = new Actions(driver);
        ac.moveToElement(mob).click().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)","");

}}
