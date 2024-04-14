 package seleniummm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class seleniumProgram {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
      //  driver.get("https://demo.guru99.com/test/simple_context_menu.html"); //double click and context click url
       driver.get("https://www.flipkart.com/"); // movetoelement url
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//      WebElement Samp = driver.findElement(By.xpath("//span[text()='right click me']")); // context click
//   WebElement doubcl = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")); //double click


        WebElement fas = driver.findElement(By.xpath("//span[text()='Fashion']"));
        Actions ac = new Actions(driver);   // action class
//         ac.doubleClick(doubcl).perform();  //double click

//         ac.contextClick(Samp).perform();  // context click
//         WebElement SAMP = driver.findElement(By.xpath("//span[text()='Edit']")); // double click
  //       SAMP.click();
         // move to element codes
        ac.moveToElement(fas).perform();
        WebElement mens = driver.findElement(By.linkText("Men's Top Wear"));
        ac.moveToElement(mens).perform();
        WebElement mensTshirt = driver.findElement(By.linkText("Men's T-Shirts"));
        ac.moveToElement(mensTshirt).perform();
        mensTshirt.click();


//        driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
//        driver.findElement(By.xpath("//span[text()='Electronics']")).click();
//
//
//
//        WebElement Samsung = driver.findElement(By.linkText("Samsung"));
//        Actions act=new Actions(driver);
//        act.moveToElement(Samsung).perform();
//        Samsung.click();
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebElement phone = driver.findElement(By.linkText("SAMSUNG Galaxy F15 5G (Jazzy Green, 128 GB)"));
//        act.moveToElement(phone).perform();
//        phone.click();


//         WebElement pincode = driver.findElement(By.id("pincodeInputId"));
//         act.moveToElement(pincode).perform();
//         pincode.click();
//         pincode.sendKeys("636003");
//         WebElement check = driver.findElement(By.xpath("//span[@class='_2P_LDn']"));
//         if (check.isEnabled()){
//             System.out.println("pincode checked");
//             check.click();
//         } else {
//             System.out.println("not checked");
//         }







    }
}
