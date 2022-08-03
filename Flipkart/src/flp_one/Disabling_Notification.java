package flp_one;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;



public  class Disabling_Notification {
	
//	static void screenshot(WebDriver driver) {
//		
//		
//		
//		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//		}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New folder\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.navigate().to("https://www.w3schools.com/jsref/met_win_alert.asp");
		
		WebElement try1=driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjsref_alert']"));
		JavascriptExecutor exe=(JavascriptExecutor)driver;
//		exe.executeScript("window.scrollBy(0,200)");
		exe.executeScript("arguments[0].scrollIntoView(true);",try1);
		exe.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(1000);
		Actions mouse=new Actions(driver);
		mouse.click(try1).perform();
		SimpleDateFormat dt=new SimpleDateFormat("dd-MM-yy hh-mm-ss");
		Date dd=new Date();
		String date=dt.format(dd);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst=	new File("C:\\Users\\USER\\Desktop\\New folder\\image"+ date+".jpeg");
		FileHandler.copy(src, dst);
		System.out.println("screenshot done");
		Set<String> set=driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		WebElement tryIt=driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		tryIt.click();
	Alert alt=	driver.switchTo().alert();
		alt.accept();
		System.out.println("accepted");
		driver.switchTo().parentFrame();
        Thread.sleep(1000);
		System.out.println("switched to parent");
		driver.switchTo().defaultContent();
		System.out.println("switched to default");


	}
}
