package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class servicenow_loginnegative {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
	        driver.get("https://dev203807.service-now.com/");
	        String title = driver.getTitle();
	        System.out.println(title);
	        
	        Thread.sleep(5000);
	        driver.findElement(By.id("sysverb_login")).click();
	        WebElement error = driver.findElement(By.xpath("//div[@class='outputmsg_text'][text()='Invalid input in user name!']"));
	        if (error.getText().equals("Invalid input in user name!"))
	        {
	        	System.out.println("error is present");
	        }
	        driver.findElement(By.id("user_name")).sendKeys("admin");
	        
	        driver.findElement(By.id("sysverb_login")).click();
	        WebElement error2 = driver.findElement(By.xpath("//div[@class='outputmsg_text']"));
	        System.out.println(error2.getText());

	}

}
