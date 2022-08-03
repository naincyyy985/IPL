package flp_one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchByDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		Actions act = new Actions(driver);

		WebElement elx = driver.findElement(By.xpath("//span[text()='Login'][1]"));
		if (elx.isDisplayed()) {

		} else {
			WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
			wait.until(ExpectedConditions.elementToBeClickable(login));
			login.click();
		}
		WebElement phoneTextBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[2]")));
		phoneTextBox.sendKeys("9365785259");

		WebElement passTextBox = driver.findElement(By.xpath("//input[@type='password']"));
		passTextBox.sendKeys("Nurul786");

		WebElement loginButton = driver.findElement(By.xpath("(//span[text()='Login'])[2]/.."));
		loginButton.click();
        //      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("on it");
        Thread.sleep(20000);
        WebElement searchBox=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchBox.sendKeys("Yonex Rackets");
	    WebElement  searchButton=driver.findElement(By.xpath("//button[@type='submit']"));
	    searchButton.click();
	    
		WebElement electronics = driver.findElement(By.xpath("//div[@class='eFQ30H'][5]"));
		act.moveToElement(electronics).perform();
		
		WebElement laptopAndAccesories = driver.findElement(By.xpath("//a[text()='Laptop Accessories']"));
		act.moveToElement(laptopAndAccesories).perform();
	
		WebElement mouse=driver.findElement(By.xpath("//a[text()='Mouse']"));
		act.click(mouse).perform();
		

//        /////////////////////////////////
//        System.setProperty("webdriver.chrome.driver", "E:\\selinium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver ();
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://www.flipkart.com/");
//		
//		WebElement EnterEmailORMobileNo = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		EnterEmailORMobileNo.sendKeys("sdrote1994@gmail.com");
//		WebElement EnterPassword = driver.findElement(By.xpath("//input[@type='password']"));
//		EnterPassword.sendKeys("RANJITsingh1994@");
//		WebElement clickButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		   clickButton.click();
	}

}
