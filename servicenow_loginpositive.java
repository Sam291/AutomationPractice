package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class servicenow_loginpositive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://dev203807.service-now.com/");
        String title = driver.getTitle();
        System.out.println(title);
        
        Thread.sleep(5000);
        WebElement user = driver.findElement(By.xpath("//label[@class='control-label'][text()='User name']"));
        
        if (user.getText().equals("User name"))
        {
        	System.out.println("User name is present");
        }
        
        driver.findElement(By.id("user_name")).sendKeys("admin");
        
        WebElement pass = driver.findElement(By.xpath("//label[@class='control-label'][text()='Password']"));
        
        if (pass.getText().equals("Password"))
        {
        	System.out.println("password is present");
        }
        
        driver.findElement(By.id("user_password")).sendKeys("xYknTGVg^$07");
        
        WebElement forgot = driver.findElement(By.partialLinkText("Forgot Password ?"));
        
        if (forgot.getText().equals("Forgot Password ?"))
        {
        	System.out.println("forgot password is present");
        }
        
        driver.findElement(By.id("sysverb_login")).click();
        String logintitle = driver.getTitle();
        
        System.out.println(logintitle);

	}

}
