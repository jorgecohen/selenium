package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        sleep(3000);
        WebElement english = driver.findElement(By.linkText("English (US)"));
        english.click();
        sleep(3000);
        WebElement createAccountBtn = driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
        createAccountBtn.click();
        sleep(3000);
        WebElement RFirstName = driver.findElement(By.name("firstname"));
        RFirstName.click();
        RFirstName.sendKeys("jorge");
        WebElement RLastName = driver.findElement(By.name("lastname"));
        RLastName.click();
        RLastName.sendKeys("cohen");
        WebElement ReMail = driver.findElement(By.name("reg_email__"));
        ReMail.click();
        ReMail.sendKeys("jorgecohen@walla.com");
        WebElement ReMail2 = driver.findElement(By.name("reg_email_confirmation__"));
        ReMail2.click();
        ReMail2.sendKeys("jorgecohen@walla.com");
        WebElement newPw = driver.findElement(By.name("reg_passwd__"));
        newPw.click();
        newPw.sendKeys("jorge2811");
       WebElement monthDropdown = driver.findElement(By.name("birthday_month"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText("Nov");
        WebElement dayDropDown = driver.findElement(By.name("birthday_day"));
        Select daySelect = new Select(dayDropDown);
        daySelect.selectByVisibleText("28");
        WebElement yearDropDown = driver.findElement(By.name("birthday_year"));
        Select yearSelect = new Select(yearDropDown);
        yearSelect.selectByVisibleText("1995");
        WebElement Gender = driver.findElement(By.name("sex"));
        Gender.click();
        sleep(300000000);
        driver.close();
    }
}
