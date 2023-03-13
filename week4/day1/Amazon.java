package week4.day1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		

		
int indexDescription = 0;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Store the Parent Window Handle
		String parentWindowHandle = driver.getWindowHandle();
		
		//Load Website
		driver.get("https://www.amazon.in");
		
		
		//Search for the specified String
		String strSearch = "oneplus 9 pro 5g morning mist";
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(strSearch, Keys.ENTER);
		
		Thread.sleep(2000);
		String totalCount = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText();
		
		List<WebElement> eleDescFind = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> elePriceFind = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<WebElement> eleRatings = driver.findElements(By.xpath("//span[contains(@class,'a-size-base')]"));
	
		if (eleDescFind.get(0).getText().contains("RESULTS"))
		{
			indexDescription = 1;
		} 
		else
		{	
			indexDescription = 0;
		}
		
		//Print Details of the first Item Selected
		System.out.println("Description    : " + eleDescFind.get(indexDescription).getText());
		System.out.println("Price          : " + elePriceFind.get(0).getText());
		System.out.println("Customer Rating: " + eleRatings.get(0).getText());
		
		//Store the phone Price
		String pricePhone = elePriceFind.get(0).getText();
		
		//Get the ScreenShot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./amazonScreenshot.png");
		FileUtils.copyFile(src, dest);
		
		//Open the first Item in new tab window
		eleDescFind.get(indexDescription).click();
		Thread.sleep(5000);
		
		//Get all the window Handles in to Set
		Set<String> windowHandles = driver.getWindowHandles();
		
		//Convert List to Set
		List<String> windowsList = new ArrayList<String>(windowHandles);
		
		System.out.println("WindowsList Size: " + windowsList.size());
		//Switched to the Tab using Index - Ordered Set
		driver.switchTo().window(windowsList.get(1));
		
		//Print the Title
		System.out.println("New Window Title: " + driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(windowsList.get(2));
		//driver.get("https://www.amazon.in/Renewed-OnePlus-Pro-5G-Morning/dp/B0BS73YRPR/ref=sr_1_1?keywords=oneplus+9+pro+5g+morning+mist&qid=1678389906&sr=8-1");
		
		//Click Add to Cart Button
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		
		WebElement cartValueele = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String cartValue = cartValueele.getText();
		System.out.println(cartValue);
		
		
		//String cartValue = driver.findElement(By.xpath("\"//span[@class='a-price-whole']")).getText();
		System.out.println("Cart Value = " + cartValue);
		System.out.println("Phone Value = " + pricePhone);
		
		if (cartValue.contains(pricePhone))
			System.out.println("Phone & Cart Value Matches");
		else
			System.out.println("Phone & Cart Value Doesnt Matches");
		
		driver.close(); //Close New Tab
		
		//Switch to Parent Window
		driver.switchTo().window(parentWindowHandle);
	}

}

