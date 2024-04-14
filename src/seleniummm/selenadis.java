package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenadis {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
        driver.manage().window().maximize();
        WebElement red = driver.findElement(By.xpath("//input[@name='color' and @value='red']"));
        if(red.isEnabled()) {
            System.out.println("Red checkbox is enabled. " +red.isEnabled());
            red.click();
            // Now check that it is selected or not.
            if(red.isSelected()) {
                System.out.println("Red checkbox is selected. Return: " +red.isSelected());
            }
            else {
                System.out.println("Red checkbox is not selected. Return: " +red.isSelected());
            }
        }
        else {
            System.out.println("Red checkbox is not enabled. Return: " +red.isEnabled());
        }
    }}
