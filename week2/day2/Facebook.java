package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Dashvanth");
		driver.findElement(By.name("lastname")).sendKeys("ss");
		driver.findElement(By.name("reg_email__")).sendKeys("7010361092");
		driver.findElement(By.id("password_step_input")).sendKeys("Nandhini12#");
		
		Select Date=new Select(driver.findElement(By.name("birthday_day")));
		Date.selectByIndex(12);
		
		Select Month=new Select(driver.findElement(By.id("month")));
		Month.selectByIndex(9);
		
		Select Year=new Select(driver.findElement(By.id("year")));
        Year.selectByValue("1988");
        
        //driver.findElement(By.xpath("//input[@name='sex']")).click();
        driver.findElement(By.xpath("//label[text()='Female']/following::input")).click();
        
		
		
		
		
	}

}
