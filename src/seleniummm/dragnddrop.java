package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragnddrop {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://letcode.in/dropable");
//        WebElement aa = driver.findElement(By.id("draggable"));
//        WebElement ab = driver.findElement(By.id("droppable"));
//        Actions a = new Actions(driver);
//        a.dragAndDrop(aa,ab).perform();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        // Switch to the frame containing the draggable elements
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/propagation.html']")));

        // Locate the draggable element
        WebElement draggable = driver.findElement(By.id("draggable"));

        // Locate the drop zone
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform drag and drop action
        actions.dragAndDrop(draggable, droppable)
                .build()  // Build the composite action
                .perform(); // Perform the action

        // Switch back to the default content
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}
