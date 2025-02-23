//explicit wait only a web elements  after all element load its start its operation.
package automation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		// declare the elements
		WebElement nav_login, uname, pwd, loginbutton;
		nav_login = driver.findElement(By.id("login2"));
		nav_login.click();
// syntax for explicit wait
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		//particular which element to be waited
		uname =ww.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
		uname.sendKeys("testmorning");
		pwd = driver.findElement(By.id("loginpassword"));
		pwd.sendKeys("test123");
		loginbutton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginbutton.click();
	}

}
