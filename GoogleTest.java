package selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Sleeper;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class GoogleTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        WebElement search = driver.findElement(By.id("user-name"));
        search.click();
        search.sendKeys("cute panda");
        WebElement pw = driver.findElement(By.id("password"));
        pw.click();
        pw.sendKeys("big panda");
        WebElement Login = driver.findElement(By.id("login-button"));
        Login.click();
        sleep(5000);
        driver.close();
    }
}