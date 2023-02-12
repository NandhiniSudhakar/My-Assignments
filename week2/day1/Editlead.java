package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement elementUserName=driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		WebElement elementpassword=driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		WebElement elementloginbutton=driver.findElement(By.className("decorativeSubmit"));
		 elementloginbutton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
			
			
			WebElement elementCompanyname=driver.findElement(By.id("createLeadForm_companyName"));
			elementCompanyname.sendKeys("infosys");
			
			WebElement elementFirstName=driver.findElement(By.id("createLeadForm_firstName"));
			elementFirstName.sendKeys("Nandhini");
			
			
			WebElement elementLastName=driver.findElement(By.id("createLeadForm_lastName"));
			elementLastName.sendKeys("sudhakaran");
			
			
			
			WebElement elementfirstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
			elementfirstNameLocal.sendKeys("nandhini ");
			
			
			WebElement elementDepartmentName=driver.findElement(By.name("departmentName"));
			elementDepartmentName.sendKeys("Finance ");
			
			
			
			WebElement elementDescription=driver.findElement(By.name("description"));
			elementDescription.sendKeys("Add the details ");
			
			
			
			WebElement elementEmailaddress=driver.findElement(By.id("createLeadForm_primaryEmail"));
			elementEmailaddress.sendKeys("oj.nandhini@gmail.com ");
			
			
			
			Select elementStateDropdown=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
			elementStateDropdown.selectByVisibleText("New York");
			
			driver.findElement(By.name("submitButton")).click();
			
			String title= driver.getTitle();
			System.out.println(title);
			
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.name("description")).clear();
			
			WebElement elementImportantNote=driver.findElement(By.name("importantNote"));
			elementImportantNote.sendKeys("Add the report details ");
			
			driver.findElement(By.name("submitButton")).click();
			String title1= driver.getTitle();
			System.out.println(title1);
			
			
		}

	

		
		

	}


