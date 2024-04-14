package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


        public class practice {
        public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
//      driver.get("https://testkru.com/Interactions/DragAndDrop"); // click hold
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement frame = driver.findElement(By.xpath("//iframe[@src='/resources/demos/draggable/default.html']"));
        driver.switchTo().frame(frame);
        WebElement ab = driver.findElement(By.id("draggable"));
//      WebElement box1 = driver.findElement(By.id("box1"));
        Actions ac = new Actions(driver); // common action class
        int a = ab.getLocation().getX();
        int b = ab.getLocation().getY();
        ac.dragAndDropBy(ab,a+70,b+80).perform();
           // click and hold codes
//       // ac.clickAndHold(box1).build().perform();
//        WebElement drp = driver.findElement(By.id("dropZone1"));
//
//        ac.clickAndHold(box1).moveToElement(drp).release().perform();


    }


}
