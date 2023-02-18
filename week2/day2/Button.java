package week2.day2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String titleOfCurrent = driver.getTitle();
		
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		String titleOfClickedPage = driver.getTitle();
		
		if(titleOfClickedPage!=titleOfCurrent)
		{
			System.out.println("The Page Title is not same");
			
		}
		driver.navigate().back();
		
		
		boolean statusOfButton = driver.findElement(By.xpath("//h5[contains(text(),'button is disabled')]/following::button[1]")).isEnabled();
        System.out.println(statusOfButton);
        Thread.sleep(2000);
        
        
        Point location = driver.findElement(By.xpath("//h5[contains(text(),'Submit')]/following::span[2]")).getLocation();
        System.out.println( location);
        
       
        
        
	



	}

}
