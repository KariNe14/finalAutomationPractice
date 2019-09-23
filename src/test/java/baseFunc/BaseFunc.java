package baseFunc;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseFunc {
    private WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C://Users/karivalt/Desktop/CogniLearn/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void getPage(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "https://" + url;
        }
        driver.get(url);
    }

    public WebElement getElement(By locator) {
        Assertions.assertFalse(getAllElements(locator).isEmpty());
        return driver.findElement(locator);
    }

    public List<WebElement> getAllElements(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty());
        return driver.findElements(locator);
    }
}
