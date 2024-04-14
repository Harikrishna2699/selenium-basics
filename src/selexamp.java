import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selexamp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl(); //CURRENT URL
        System.out.println("current url: " + url);
        String title = driver.getTitle();  //GET TITLE
        System.out.println("title is " + title);
        driver.findElement(By.linkText("Sign up")).click(); // linktext
        driver.navigate().back(); //NAVIGATE BACK
        driver.navigate().forward(); // navigate forward
        driver.navigate().refresh(); // navigate refresh

//        String source = driver.getPageSource(); // getpagesrc
//        System.out.println("pagesource is " + source);
        //driver.findElement(By.xpath("//input[@id=\"user_email_login\"]")).sendKeys("hariraghu999@gmail.com"); //xpath
//        WebElement signIn =driver.findElement(By.id("user_submit"));
//        Boolean displayed = signIn.isDisplayed(); // verify if a certain element is present and displayed
//        System.out.println("signIn " + displayed );
//        System.out.println(signIn.isEnabled()); // findout whether an element is enabled on webpage or not.
       // driver.findElement(By.partialLinkText("Pric")).click(); // partiallinktext
        //driver.findElement(By.linkText("Sign up")).click(); // linktext
      //  driver.findElement(By.partialLinkText("up")).click(); // partiallinktext
      //  driver.findElement(By.id("user_email_login")).sendKeys("hariraghu999@gmail.com"); // id locator
//        driver.findElement(By.name("user[login]")).sendKeys("hariraghu999@gmail.com"); // name locator
     //   driver.findElement(By.className("input-lg text")).sendKeys("Hari@2699"); // class locator
//      driver.findElement(By.name("user[password]")).sendKeys("Hari@2699"); // name locator
       // driver.quit();


    }
}
