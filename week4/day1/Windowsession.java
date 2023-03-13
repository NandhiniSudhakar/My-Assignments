package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Windowsession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.findElement(By.xpath("//div[@class='card']//span")).click();
		Set<String> handle1 = driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(handle1);
		String parentWin = list1.get(0);
		String childWin = list1.get(1);
		
		driver.switchTo().window(childWin);
	
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("message")).sendKeys("Hello everyone nice to learn selenium");
		driver.close();
		driver.switchTo().window(parentWin);
		
		//2nd button
		
		driver.findElement(By.xpath("//span[contains(text(),'Open Multiple')]")).click();
		
		Set<String> handle2 = driver.getWindowHandles();
		List<String> list2=new ArrayList<String>(handle2);
		String parentWin1 = list2.get(0);
		
		for (String windows : list2) {
			
			if(!list2.isEmpty())
			{
				driver.switchTo().window(windows);
				String title = driver.getTitle();
				System.out.println(title);
				if(title.equalsIgnoreCase("Web table"))
				{
					driver.switchTo().window(windows);
					driver.manage().window().maximize();	
				}	
			}
		}
			driver.switchTo().window(parentWin1);
			String title1 = driver.getTitle();
			System.out.println(title1);	
			
			//driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]")).click();
			
			//3rd button
			 
			driver.findElement(By.xpath("//span[contains(text(),'delay')]")).click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.numberOfWindowsToBe(3));
			
			Set<String> handle3 = driver.getWindowHandles();
			List<String> list3=new ArrayList<String>(handle3);
			String parentWin2 = list3.get(0);
			
			for (String windows : list3) {
				
				if(!list3.isEmpty())
				{
					driver.switchTo().window(windows);
					String title = driver.getTitle();
					System.out.println(title);
					driver.close();
				}	
		}
	}
}

