package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();
        WebElement myFrame  = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
        driver.switchTo().frame(myFrame);
        driver.findElement(By.name("fname")).sendKeys("Harikrishna");
        driver.findElement(By.name("lname")).sendKeys("Raghu");
        WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
        driver.switchTo().frame(innerFrame);
        driver.findElement(By.name("email")).sendKeys("hariraghu999@gmail.com");
        driver.switchTo().parentFrame();
        driver.findElement(By.name("lname")).sendKeys("raghu");
        driver.switchTo().defaultContent();



    }
}
