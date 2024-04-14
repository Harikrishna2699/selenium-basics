package seleniummm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class alerts {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        //accept
//        driver.findElement(By.id("accept")).click();
          //Alert alert = driver.switchTo().alert();
//        String text = alert.getText();
//        System.out.println("look "+ text);
//        alert.accept();

        // dismiss

//        driver.findElement(By.id("confirm")).click();
//        Alert alert1=driver.switchTo().alert();
//        String texxt = alert1.getText();
//        System.out.println("dismissed "+ texxt);
//        alert1.dismiss();

        // prompt

        driver.findElement(By.id("prompt")).click();
        Alert a1 = driver.switchTo().alert();
        a1.sendKeys("harikrishna");
        String t1 = a1.getText();
        System.out.println("entered name is "+ t1);
        a1.accept();

        String parentwindow = driver.getWindowHandle();
        System.out.println(parentwindow);


    }
}
