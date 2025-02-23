package automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement simpleNav, button1, confirmNav, button2, textBoxNav, button3;
		
		simpleNav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		simpleNav.click();
		button1 = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		button1.click();
		Thread.sleep(5000);
		Alert art = driver.switchTo().alert();
		art.accept();
		
		
		confirmNav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		confirmNav.click();
		button2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		button2.click();
		Thread.sleep(5000);
		art.dismiss();
		
		
		textBoxNav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		textBoxNav.click();
		button3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button3.click();
		Thread.sleep(5000);
		art.sendKeys("qaclass");
		art.accept();

	}

}
