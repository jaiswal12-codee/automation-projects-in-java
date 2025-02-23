package automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class dayone {
// if you use thread then use throwable space+enter
	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		// open  the webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		// declare the elements
		WebElement nav_login, uname, pwd, loginbutton;
		nav_login = driver.findElement(By.id("login2"));
		nav_login.click();
		//live in the page for 5000ms
		Thread.sleep(5000);
		uname = driver.findElement(By.id("loginusername"));
		uname.sendKeys("testmorning");
		pwd = driver.findElement(By.id("loginpassword"));
		pwd.sendKeys("test123");
		loginbutton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginbutton.click();



	}

}
