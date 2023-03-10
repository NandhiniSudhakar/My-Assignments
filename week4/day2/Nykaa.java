package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--notifications-disabled");
		//options.addArguments("--headless");
		//options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.nykaa.com/");
		
		//Store the Parent Window Handle
		String parentWindowHandle = driver.getWindowHandle();
		
		//2) Mouseover on Brands and Search L'Oreal Paris
		Actions builder = new Actions(driver);
		
		WebElement brands = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		builder.moveToElement(brands).perform();
		WebElement popular = driver.findElement(By.xpath("//a[@class='brandHeadingbox current_active']"));
		builder.moveToElement(popular).perform();

		//3) Click L'Oreal Paris
		WebElement loreal = driver.findElement(By.xpath(""
				+ "//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']"));
		
		builder.moveToElement(loreal).click().perform();

		//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		
		if (driver.getTitle().contains("L'Oreal Paris"))
			System.out.println("Title Matches");
		else
			System.out.println("Title Doesnt Match");
		
		//5) Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		
		//6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		//driver.executeScript("arguments[0].click()",categoryArrow);
		Thread.sleep(2000);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Hair')])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Hair Care')])[2]")).click();
		Thread.sleep(1000);
		WebElement shampoo = driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]/following::div"));
		shampoo.click();
		Thread.sleep(1000);
		
		//7) Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(1000);
		
		//8) check whether the Filter is applied with Shampoo
		String filter = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		if (filter.contains("Shampoo"))
			System.out.println("Shampoo Filter is Selected");
		else
			System.out.println("Shampoo Filter is not Selected");
		
		//9) Click on L'Oreal Paris Colour Protect Shampoo
		WebElement findProduct = driver.findElement(By.xpath("//div[text()=\"L'Oreal Paris Colour Protect Shampoo\"]"));
		builder.moveToElement(findProduct).click().perform();
		
		//10) GO to the new window and select size as 180ml
		//Get Window Handle
		Set<String> windowsHandle = driver.getWindowHandles();
		
		//Convert Set to List
		List<String> windowsList = new ArrayList<String>(windowsHandle);
		
//		for (int i = 0; i < windowsList.size(); i++)
//			System.out.println(windowsList.get(i));
		
		//Switch to Window Tab opened
		driver.switchTo().window(windowsList.get(2));
		
		WebElement findSize = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select mlSize = new Select(findSize);
		
		mlSize.selectByValue("0"); //180ml
		
		//11) Print the MRP of the product
		String MRP = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
		System.out.println("MRP: " + MRP);
		
		//12) Click on ADD to BAG
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		//System.out.println("Click Add to Bag");
		
		//13) Go to Shopping Bag
		driver.findElement(By.xpath("(//div/button[@type='button'])[1]")).click();
		
		//14) Print the Grand Total amount
		
		//Switch to the frame
		driver.switchTo().frame(driver.findElement(By.className("css-acpm4k")));
		
		String GrandTotal = driver.findElement(
				By.xpath("//div[@data-test-id='footer']//span")).getText();
		System.out.println("Grand Total: " + GrandTotal);
		
		//15) Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		//16) Click on Continue as Guest
		driver.findElement(By.xpath("//button[contains(text(),'Continue as guest')]")).click();
		Thread.sleep(1000);
		
		//17) Check if this grand total is the same in step 14
		String fGrandTotal = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/span/img")).getText();
		if (GrandTotal.contains(fGrandTotal))
			System.out.println("Total Value Matches");
		else
			System.out.println("Total Value Doesnt Matches");
		
		//18) Close all windows
		driver.quit();
	}

}