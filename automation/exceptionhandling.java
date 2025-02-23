package automation;
import org.openqa.selenium.By;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		// declare the elements
		WebElement nav_login, uname, pwd, loginbutton;
		try {
		
		nav_login = driver.findElement(By.id("login2"));
		nav_login.click();
		

		uname = driver.findElement(By.id("loginusername"));
		uname.sendKeys("testmorning");
		pwd = driver.findElement(By.id("loginpassword"));
		pwd.sendKeys("test123");
		loginbutton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginbutton.click();
		}
		catch(NoSuchElementException e) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			uname = driver.findElement(By.id("loginusername"));
			uname.sendKeys("testmorning");
			pwd = driver.findElement(By.id("loginpassword"));
			pwd.sendKeys("test123");
			loginbutton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
			loginbutton.click();
			System.out.print(e);
			
		}
		catch(ElementNotInteractableException e) {
			System.out.print(e);
			
		}
		
		
		
		
	}

}
