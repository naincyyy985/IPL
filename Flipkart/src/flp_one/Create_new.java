package flp_one;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_new {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\New folder\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.flipkart.com/");
			WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));

			login.click();
			Thread.sleep(2500);
			WebElement phone = driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU']"));
			phone.sendKeys("9365785259");
			WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("*******");
			WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
			button.click();
		}
}
