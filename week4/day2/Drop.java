package week4.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drop {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Drag\"]")).click();
		
		
		driver.switchTo().frame(0);
		WebElement  draggableElement=driver.findElement(By.xpath("//div[@id='form:drag_content']/p"));
		WebElement  destination=driver.findElement(By.xpath("//p[text()='Drag to target']/parent::div"));
		Actions builder= new Actions(driver);
		builder.dragAndDrop(draggableElement,  destination).perform();
		
	}

}

