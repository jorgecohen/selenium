package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class YouTube {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.youtube.com/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        WebElement search = driver.findElement(By.name("search_query"));
        search.click();
        sleep(2000);
        search.sendKeys("static");
        WebElement searchbtn = driver.findElement(By.id("search-icon-legacy"));
        searchbtn.click();
        sleep(3000);
        WebElement firstVideo = driver.findElement(By.xpath("//ytd-video-renderer[1]"));
        firstVideo.click();
        Duration duration = Duration.ofSeconds(6);
// Wait for the "Skip Ad" button to become clickable
        WebDriverWait wait = new WebDriverWait(driver, duration);
        WebElement skipButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("ytp-ad-skip-button-icon")));
// Click on the "Skip Ad" button
        skipButton.click();
        WebElement description = driver.findElement(By.id("expand"));
        description.click();
        WebElement fullscreen = driver.findElement(cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-fullscreen-button.ytp-button"));
        sleep(1000);
        fullscreen.click();
        sleep(10000);
        fullscreen.click();
        sleep(10000);
        driver.close();
    }
}
