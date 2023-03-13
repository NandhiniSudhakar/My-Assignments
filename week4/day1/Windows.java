package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		
		
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Window\"]")).click();
		
		//String currentWindowRef=driver.getWindowHandle();
		//System.out.println(currentWindowRef);
		//driver.switchTo().window(WindowHandle);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()=\"Open\"]")).click();
		
		Set<String>set= driver.getWindowHandles();
		//System.out.println(set);
		//driver.switchTo().Window(WindowHandles);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		List<String> list= new ArrayList<String>(set);
		String windowHandle = list.get(2);
		//driver.switchTo().window(list.get(1));
		driver.switchTo().window(windowHandle);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	

		
		
		//driver.switchTo().window(currentWindowRef);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.switchTo().window(currentWindow);
	}
}
		
		


