package selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class Guru99 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://demo.guru99.com/test/newtours/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        WebElement search = driver.findElement(By.name("userName"));
        search.click();
        search.sendKeys("tutorial");
        WebElement pw = driver.findElement(By.name("password"));
        pw.click();
        pw.sendKeys("tutorial");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        sleep(5000);
        driver.close();
    }
}