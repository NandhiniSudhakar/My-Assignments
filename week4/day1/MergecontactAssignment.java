package week4.day1;import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergecontactAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		
       driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::img")).click();
		
		System.out.println(driver.getTitle());
		Set<String> handle1 = driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(handle1);
		String window0 = list1.get(1);
		String window1 = list1.get(2);
		System.out.println(list1.get(1));
		driver.switchTo().window(window1);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		driver.switchTo().window(window0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		Thread.sleep(2000);
		Set<String> handle2 = driver.getWindowHandles();
		List<String> list2=new ArrayList<String>(handle2);
		String window2 = list2.get(1);
		String window3 = list2.get(2);
		
		driver.switchTo().window(window3);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		driver.switchTo().window(window2);
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		
		if(title.contains("View Contact | opentaps CRM"))
		{
			System.out.println("Both contacts are merged");
		}
		else
		{
			System.out.println("Not merged");
		}
			
		}
		
		
		
		
		
	    

	
		
	}


