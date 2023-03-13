package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
		driver.findElement(By.xpath("//span[text()='Window']/..")).click();
		
		String currentWindowRef = driver.getWindowHandle();
		System.out.println(currentWindowRef);
		// CDwindow-A3BDAAED456F92E3FF0C277CA66FC84C
		// CDwindow-1FE138AA824E28AE221F03127D7797BC

		driver.findElement(By.xpath("//span[text()='Open']/..")).click();
		
		Set<String> set = driver.getWindowHandles();
		System.out.println(set);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		List<String> list = new ArrayList<String>(set);
//		list.addAll(set);
		String windowHandle = list.get(1);
		
		driver.switchTo().window(windowHandle);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(currentWindowRef);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
	}

}
