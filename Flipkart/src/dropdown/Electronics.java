package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Electronics {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
//		
// 		WebElement electronic=driver.findElement(By.xpath("//div[text()='Electronics']\r\n"));
// 		WebElement electronicsGSTStore=driver.findElement(By.xpath("//a[text()='Electronics GST Store']"));
//      WebElement gaming= driver.findElement(By.xpath("//a[text()='Gaming']"));
//      WebElement gamingkeyboard=driver.findElement(By.xpath("[text()='Gaming Keyboards']"));
//      Actions mouse=new Actions(driver);
//      mouse.moveToElement(electronic).moveToElement(gaming).moveToElement(gamingkeyboard).click().build().perform();
//  	mouse.moveToElement(electronicsGSTStore).perform();
		WebElement topStories = driver.findElement(By.xpath("//div[@class='LfkXVL']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", topStories);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
	}

}
