package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtabs {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/window");
        driver.findElement(By.id("home")).click();
        System.out.println(driver.getTitle()); //this shows after clicking on new tab also our instance is on the first page
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //waiting for the window to load
        
        Set<String> window = driver.getWindowHandles(); //storing the window handles in the set
        
        List<String> list = new ArrayList<String>(window); // converting it to the list
        
        driver.switchTo().window(list.get(1)); //switching to the next tab
        
        System.out.println(driver.getTitle());


	}

}
