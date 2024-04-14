package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class aaaa {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/guide/expectedconditions-in-selenium");
        driver.manage().window().maximize();
        Actions ac = new Actions(driver);
        WebElement e1 = driver.findElement(By.id("customFooterContactBtn"));
        ac.moveToElement(e1);
        ac.perform();
        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(60));
        waitt.until(ExpectedConditions.elementToBeClickable(By.id("customFooterContactBtn")));
        System.out.println("page title is " + driver.getTitle());
        ac.click().perform();
    }
}
