package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbasicstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("Finding the element for username");
		WebElement elementUserName=driver.findElement(By.id("username"));
		System.out.println("Entering the username as Demosalesmanager");
		 elementUserName.sendKeys("Demosalesmanager");
		 
		 System.out.println("Finding the element for password");
		 WebElement elementpassword=driver.findElement(By.id("password"));
		 System.out.println("Entering the password as crmsfa");
		elementpassword.sendKeys("crmsfa");
		
		System.out.println("Finding the element for loginbutton");
		 WebElement elementloginbutton=driver.findElement(By.className("decorativeSubmit"));
		 elementloginbutton.click();
		
	}

}
