package seleniummm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class expli {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();


        driver.get("https://www.flipkart.com/");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();


       WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_1YokD2")));
      //  wait.until(ExpectedConditions.titleContains("expectedTitle"));


        System.out.println("Page title: " + driver.getTitle());

        driver.quit();
    }
}