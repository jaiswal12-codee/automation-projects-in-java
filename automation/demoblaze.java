package automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoblaze {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoblaze.com");
    }

    @Test
    public void f() {
        try {
            WebElement nav_login = driver.findElement(By.id("login2"));
            nav_login.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));

            WebElement uname = driver.findElement(By.id("loginusername"));
            uname.sendKeys("testmorning");

            WebElement pwd = driver.findElement(By.id("loginpassword"));
            pwd.sendKeys("test123");

            WebElement loginbutton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            loginbutton.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

            String expected_result = "Welcome testmorning";  // Corrected expected text
            String actual_result = driver.findElement(By.id("nameofuser")).getText();

            Assert.assertEquals(actual_result, expected_result, "Login Test Failed");

        } catch (Exception e) {
            System.out.println("Test failed due to: " + e.getMessage());
            Assert.fail("Exception occurred: " + e.getMessage());
        }
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}

