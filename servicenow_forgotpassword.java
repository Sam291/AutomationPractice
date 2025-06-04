package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class servicenow_forgotpassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://dev203807.service-now.com/");
        
        WebElement forgot = driver.findElement(By.partialLinkText("Forgot Password ?"));
        
        if (forgot.getText().equals("Forgot Password ?"))
        {
        	System.out.println("forgot password is present");
        }
        
        driver.findElement(By.xpath("//a[@class='btn btn-link']")).click();
        
        Thread.sleep(5000);
        
        WebElement Identify = driver.findElement(By.xpath("//li[@class='current'][text()='Identify']"));
        
        if (Identify.getText().equals("Identify"))
        {
        	System.out.println("Identify is present");
        }
        
        WebElement Verify = driver.findElement(By.xpath("//li[text()='Verify']"));
        
        if (Verify.getText().equals("Verify"))
        {
        	System.out.println("Verify is present");
        }
        
        WebElement Reset = driver.findElement(By.xpath("//li[text()='Reset']"));
        
        if (Reset.getText().equals("Reset"))
        {
        	System.out.println("Reset is present");
        }

        WebElement user = driver.findElement(By.xpath("//label[@class='control-label'][text()='User name']"));
        
        if (user.getText().equals("User name"))
        {
        	System.out.println("User name is present");
        }
        
        WebElement captcha = driver.findElement(By.xpath("//label[@class='control-label'][text()='CAPTCHA']"));
        
        if (captcha.getText().equals("CAPTCHA"))
        {
        	System.out.println("CAPTCHA is present");
        }
        
        WebElement Next = driver.findElement(By.xpath("//button[@class='btn btn-primary'][text()='Next']"));
        
        if (Next.getText().equals("Next"))
        {
        	System.out.println("Next is present");
        }
        
        driver.findElement(By.id("sysparm_user_id_0")).sendKeys("admin");
        driver.quit();


	}

}
