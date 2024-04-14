package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windowsHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");
        searchBox.sendKeys(Keys.RETURN);

        WebElement lap = driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[1]"));
        lap.click();

        // Set <String> windowHandles = driver.getWindowHandles();
        // List <String> title = new ArrayList<String>(windowHandles);
        Object[] ob = driver.getWindowHandles().toArray();
        System.out.println(ob.length);
        driver.switchTo().window((String) ob[1]);
        System.out.println(driver.getTitle());

         for (Object windowHandle : ob) {
          driver.switchTo().window((String) windowHandle);

    }

        driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")).click();

        // driver.switchTo().window((String)ob[0]);
        System.out.println(driver.getTitle());
        WebElement e1=   driver.findElement(By.id("twotabsearchtextbox"));
        e1.clear();
        e1.sendKeys("iphone 12");
        e1.sendKeys(Keys.RETURN);
        WebElement mob = driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4']//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 12 (256GB) - (Product) RED']"));
        mob.click();
        driver.close();
        driver.switchTo().window((String)ob[2]);


}}