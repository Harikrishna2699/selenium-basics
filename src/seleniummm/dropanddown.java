package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropanddown {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/tooltip/default.html']")));
        WebElement ele = driver.findElement(By.linkText("Tooltips"));
        WebElement ele2 = driver.findElement(By.linkText("ThemeRoller"));
        WebElement ele1 = driver.findElement(By.id("age"));
        Actions ac = new Actions(driver);
        Thread.sleep(4000);

        ac.sendKeys(ele1, "24").moveToElement(ele).moveToElement(ele2);
        ac.perform();


//        ac.moveToElement(ele).sendKeys(ele1,"24").perform();

    }}
