package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class airindiawebsitepractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		
		// entering source and destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[text='Belagavi (IXG)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();
		Thread.sleep(1000);
		
		//Choosing dates
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[text()='9']")).click();
		
		//entering no. of people
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hrefIncAdt")).click();   // 2 adult
		driver.findElement(By.id("hrefIncChd")).click();   // 1 child
		driver.findElement(By.id("hrefIncChd")).click();   // 2 child
	    driver.findElement(By.id("hrefIncInf")).click();   // 1 infant
	    driver.findElement(By.id("btnclosepaxoption")).click();  //done
	    
	    //Choosing Currency 
	    driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
	    driver.findElement(By.cssSelector("option[value='INR']")).click();
	    
	    //Go
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
