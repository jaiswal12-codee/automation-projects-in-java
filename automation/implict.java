package automation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//implict wait is alternative of thread sleep as thread sleep exactly wait for a time but
//implict wait waits loading all elements it not have importance of time.
//implict wait all  web elements  after all element load its start its operation.
public class implict {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		// declare the elements
		WebElement nav_login, uname, pwd, loginbutton;
		nav_login = driver.findElement(By.id("login2"));
		nav_login.click();
		//live in the page for 5000ms
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		uname = driver.findElement(By.id("loginusername"));
		uname.sendKeys("testmorning");
		pwd = driver.findElement(By.id("loginpassword"));
		pwd.sendKeys("test123");
		loginbutton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginbutton.click();

	}

}
