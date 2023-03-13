package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class Buythevaluelink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
	     ChromeDriver driver=new ChromeDriver(options);
	     
	     Shadow dom=new Shadow();
	     
	     driver.get("https://buythevalue.in/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	     
	     driver.findElement(By.xpath("//div[@class='searchbox']//input[2]")).sendKeys(" Hamdard Hing - 50GM",Keys.ENTER);
	     Thread.sleep(1000);
	     
	     driver.switchTo().frame("hubspot-conversations-iframe");
	     WebElement closeChatwidget = driver.findElement(By.xpath("//div[@class='initial-message-bubble']/following::button"));
	     
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(05));
	     wait.until(ExpectedConditions.elementToBeClickable(closeChatwidget));
	     closeChatwidget.click();
	     
	     driver.switchTo().defaultContent();
	     driver.findElement(By.xpath("//a[contains(text(),'Hamdard Hing - 50GM')]")).click();
	     
	     Set<String> windowHandles = driver.getWindowHandles();
	     List<String> list1=new ArrayList<String>(windowHandles);
	     String parent = list1.get(0);
	     String child = list1.get(2);
	     driver.switchTo().window(child);
	     	     
	     driver.findElement(By.xpath("//div[@class='wk_zipfinder_input']/input")).sendKeys("625017");
	     
	     WebElement check = driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']/input"));
	     JavascriptExecutor js =(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].click();", check);
	    
	     driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
	      
	     Thread.sleep(2000);
	     WebElement elecart = driver.findElement(By.xpath("//a[contains(text(),'View Cart')]"));
	     driver.executeScript("arguments[0].click();", elecart);
        driver.findElement(By.name("checkout")).click();
        driver.switchTo().alert().accept();
        
	    	}
	

}

