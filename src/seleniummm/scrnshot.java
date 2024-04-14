package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class scrnshot {
    public static void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
      //  driver.get("https://letcode.in/test");
        driver.get("https://status.browserstack.com");
        driver.manage().window().maximize();
        //page screenshot
        File src =driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./snap/imgg.png");
        FileHandler.copy(src,dest);
       // element screenshot
//        WebElement ele = driver.findElement(By.linkText("Sign up"));
//        File elescr = ele.getScreenshotAs(OutputType.FILE);
//        File dest = new File("./snap/img1.png");
//        FileHandler.copy(elescr,dest);
          // section screenshot
//        WebElement sec = driver.findElement(By.xpath("//div[@data-component-id='vcx12wy4w2jm']"));
//        File src = sec.getScreenshotAs(OutputType.FILE);
//        File dest = new File("./snap/img4.png");
//        FileHandler.copy(src,dest);
//        driver.quit();
    }
}
