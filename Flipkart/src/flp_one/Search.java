package flp_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement searchBox=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchBox.sendKeys("Yonex Rackets");
	    WebElement  searchButton=driver.findElement(By.xpath("//button[@type='submit']"));
	    searchButton.click();
	    
	}
}
