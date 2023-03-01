package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class CalculatorLinkTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.calculator.net/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        WebElement link = driver.findElement(By.partialLinkText("Mortgage"));
        link.click();
WebElement input = driver.findElement(By.partialLinkText("Down"));
String value = input.getText();
        System.out.println("Text found the value is "+value);

        sleep(3000);
        driver.close();
    }
}
