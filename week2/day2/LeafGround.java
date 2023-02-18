package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("j_idt88:name")).sendKeys("Nandhini");
		 driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[2]")).clear();
		driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield ui-inputtext')])[2]")).sendKeys("Mysore");
		
		 WebElement textbox = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[3]"));
		 System.out.println(textbox.isEnabled());
		 if(textbox.isEnabled())
		 {
			 System.out.println("The text box is Enabled");
		 }
		 else 
		 {
			 System.out.println("The text box is not Enabled to interact");
		 }

	
		 

	WebElement clearbox=driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
	String s=clearbox.getAttribute("value");
    System.out.println("Value before clear : " + s);
    clearbox.clear();
    String n= clearbox.getAttribute("value");
    System.out.println("Value after clear : " + n);
	
    String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
    System.out.println(text);
    
    driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("oj.nandhini@gmail.com",Keys.TAB);
    driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']/following::textarea")).sendKeys("I am Nandhini");
 
   
    driver.findElement(By.className("ql-italic")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class='ql-container ql-snow']/div")).sendKeys("Added the details");
    WebElement errormessageEle = driver.findElement(By.xpath("//h5[contains(text(),'confirm error message')]/following::input[2]"));
	 
    errormessageEle.sendKeys(Keys.ENTER);
	 
	 Thread.sleep(3000);
	
	 String errormessageEl=driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
	 System.out.println(errormessageEl);
	 driver.findElement(By.xpath("//h5[contains(text(),'Label Position')]/following::input[1]")).click();
	 WebElement optionele1=driver.findElement(By.xpath("//h5[contains(text(),'choose the third option')]/following::input[1]"));
	 optionele1.sendKeys("Nandhini");
	 driver.findElement(By.xpath("(//span[@role='listbox']//li)[3]")).click();
	 driver.findElement(By.xpath("//h5[contains(text(),'Confirm Keyboard')]/following::input")).click();
	 Thread.sleep(2000);
	 
	 WebElement customToolBar=driver.findElement(By.xpath("//h5[contains(text(),'Custom Toolbar')]/following::div[4]"));
	 customToolBar.click();
	 customToolBar.sendKeys("All the details updated");
	 
}
}
