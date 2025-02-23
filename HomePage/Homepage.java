package HomePage;
import org.openqa.selenium.*;


public class Homepage {
	WebDriver driver;
	//same name as class name
	public Homepage(WebDriver driver) {
		// we are making homepage as a object of class.
		this.driver=driver;
	}
public void maximize() {
	driver.manage().window().maximize();
	
}
By navlogin=By.id("login2");
public void clickNavLogin() {
	driver.findElement(navlogin).click();
}
}
