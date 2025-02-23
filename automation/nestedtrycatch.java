package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class nestedtrycatch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Maximize browser and set implicit wait
        driver.manage().window().maximize();

        driver.get("https://demoblaze.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Try clicking the login button
            try {
                WebElement nav_login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
                nav_login.click();
            } catch (NoSuchElementException e) {
                System.out.println("Login button not found: " + e.getMessage());
                throw e;
            }

            // Try entering the username
            try {
                WebElement uname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
                uname.sendKeys("testmorning");
            } catch (NoSuchElementException e) {
                System.out.println("Username field not found: " + e.getMessage());
                throw e;
            }

            // Try entering the password
            try {
                WebElement pwd = driver.findElement(By.id("loginpassword"));
                pwd.sendKeys("test123");
            } catch (NoSuchElementException e) {
                System.out.println("Password field not found: " + e.getMessage());
                throw e;
            }

            // Try clicking the login button
            try {
                WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));
                loginbutton.click();
            } catch (NoSuchElementException e) {
                System.out.println("Login button inside modal not found: " + e.getMessage());
                throw e;
            }

        } catch (NoSuchElementException e) {
            System.out.println("An element was not found in the process: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.out.println("An element was not interactable: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            driver.quit();  // Ensure browser closes after execution
        }
    }
}