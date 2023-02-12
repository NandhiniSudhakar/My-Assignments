package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginsalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		System.out.println("Finding the element for username");
		WebElement elementUserName=driver.findElement(By.id("username"));
		System.out.println("Entering the username as hari.radhakrishnan@qeagle.com ");
		 elementUserName.sendKeys("hari.radhakrishnan@qeagle.com");
		 
		 System.out.println("Finding the element for password");
		 WebElement elementpassword=driver.findElement(By.id("password"));
		 System.out.println("Entering the password as Leaf@123");
		elementpassword.sendKeys("Leaf@123");
		
		System.out.println("Finding the element for loginbutton");
		 //WebElement elementloginbutton=driver.findElement(By.className("button r4 wide primary"));
		driver.findElement(By.id("Login")).click();
		
		
		
		
	}

}
