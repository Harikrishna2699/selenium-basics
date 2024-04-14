package seleniummm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 import java.time.Duration;
 import java.util.List;
import java.util.concurrent.TimeUnit;

public class redbus {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        // Implicit wait to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to RedBus website
        driver.get("https://www.redbus.in/");

        // Enter 'From' location
        WebElement fromInput = driver.findElement(By.id("src"));
        fromInput.sendKeys("Chennai");

        // Wait for the suggestion list to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> fromSuggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")));

        // Select the desired location from the suggestion list
        for (WebElement suggestion : fromSuggestions) {
            if (suggestion.getText().equals("Chennai")) {
                suggestion.click();
                break;
            }
        }

        // Enter 'To' location
        WebElement toInput = driver.findElement(By.id("dest"));
        toInput.sendKeys("Salem");

        // Wait for the suggestion list to appear
        List<WebElement> toSuggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div")));


        for (WebElement suggestion : toSuggestions) {
            if (suggestion.getText().equals("Salem")) {
                suggestion.click();
                break;
            }
        }

       //  Enter date
        WebElement dateInput = driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']"));
        dateInput.click();
        WebElement searchbus = driver.findElement(By.xpath("//button[@id='search_button']"));
        searchbus.click();
//        WebElement desiredDate = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='wd day' and text()='Your Desired Date']"));
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(desiredDate).click().build().perform();
//        driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div")).click();
//        driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']")).click();
//        datePicker.sendKeys();
//        datePicker.click();

        // Continue with your automation script (e.g., handle search results, booking process)

        // Close the browser
        //driver.quit();
    }
}

