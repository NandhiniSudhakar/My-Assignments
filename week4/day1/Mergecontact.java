package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Mergecontact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter UserName and Password Using Id Locator
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		
		WebElement elementPassWord = driver.findElement(By.id("password"));
		elementPassWord.sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		//Click on CRM/SFA Link
		WebElement elementLink = driver.findElement(By.linkText("CRM/SFA"));
		elementLink.click();
		
		//Click on contacts Button
		WebElement elementContacts = driver.findElement(By.xpath("//a[text()='Contacts']"));
		elementContacts.click();
		
		//Click on Merge Contacts using Xpath Locator
		WebElement mergeContacts = driver.findElement(By.xpath("//a[text()='Merge Contacts']"));
		mergeContacts.click();
		
		String parentwindow= driver.getWindowHandle();
		
		// Click on Widget of From Contact	
		WebElement FromContact = driver.findElement(By.xpath("//span[text()='From Contact']/following::img"));
		FromContact.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windowHandlesList.get(2));
		//Click on First Resulting Contact
		WebElement elementFrom = driver.findElement(By.xpath("//div[text()='Contact ID']/following::a[text()[normalize-space()='10690']]"));
		elementFrom.click();
		
		driver.switchTo().window(parentwindow);
		//Click on Widget of To Contact
		WebElement ToContact = driver.findElement(By.xpath("(//span[text()='To Contact']/following::img"));
		Thread.sleep(2000);
		ToContact.click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowHandlesList2 = new ArrayList<String>(windowHandles2);
		
		driver.switchTo().window(windowHandlesList2.get(2));
		
		//Click on Second Resulting Contact
		WebElement elementTo = driver.findElement(By.xpath("(//a[text()[normalize-space()='10690']]/following::a[text()[normalize-space()='10692']]"));
		Thread.sleep(2000);
		elementTo.click();
		
		driver.switchTo().window(parentwindow);
		
		//Click on Merge button using Xpath Locator
		WebElement Merge = driver.findElement(By.xpath("//a[@class='buttonDangerous']"));
		Merge.click();
		
		// Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		// Verify the title of the page
		String title="Merge Contacts | opentaps CRM";
		String title2 = driver.getTitle();
		if(title2.equals(title2))
		{
			System.out.println("Title of the Page "+title+" is verified");
		}
		
		
		}
	}


