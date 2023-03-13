package week4.day2;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Erailtrainsort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement fromElestation = driver.findElement(By.id("txtStationFrom"));
		fromElestation.clear();
		fromElestation.sendKeys("MAS",Keys.ENTER);
		
		WebElement toElestation = driver.findElement(By.id("txtStationTo"));
		toElestation.clear();
		toElestation.sendKeys("SBC",Keys.ENTER);
		WebElement sortOnDate = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		sortOnDate.click();
		Thread.sleep(2000);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		int size = row.size();
		List<String> trainList = new ArrayList<String>();
		
		
		for (int i = 2; i <= size+1; i++) 
		{	
			//System.out.println(i);
			String traintext = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
			
			System.out.println(traintext);
			
			trainList.add(traintext);	
		}
		       
        
        driver.findElement(By.xpath("//a[text()='Train Name']")).click();
		
        List<WebElement> rowSort = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		int sizeSort = rowSort.size();
        List<String> trainListSort = new ArrayList<String>();
		
		for (int i = 2; i <= sizeSort+1; i++)
		{	
			String trainName = driver.findElement(By.xpath("//table[contains(@class, 'TrainListHeader stickyTrainListHeader')]//tr["+i+"]//td[2]")).getText();
			
			System.out.println(trainName);
			
			trainListSort.add(trainName);	
		}
					
		if (trainList.size()==trainListSort.size()) 
		{
			System.out.println("Both Size are same");
			
		}
		else {
			
			System.out.println("Both Size Not Same");
		}
	}


	}
	
	
		


        


		


	


