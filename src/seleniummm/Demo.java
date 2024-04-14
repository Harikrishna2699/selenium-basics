package seleniummm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class
Demo {


        public static void main(String[] args) {

                                WebDriver driver = new ChromeDriver();
                                driver.get("https://www.browserstack.com/users/sign_in");
                                List<WebElement> linkElements = driver.findElements(By.tagName("a"));
                                System.out.println("Number of links: " + linkElements.size());
                                for (WebElement element : linkElements) {
                                        System.out.println(element.getText()); // Print the text of each link
                                }
                                driver.quit();
                        }
                }


