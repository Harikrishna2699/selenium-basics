package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/buttons");
        WebElement btncolor = driver.findElement(By.id("color"));
        String color=   btncolor.getCssValue("background-color");
        System.out.println(color);

    }
}
