package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablessum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		WebElement table  = driver.findElement(By.id("shopping"));  // storing the table in webelement
		
		List<WebElement> column= table.findElements(By.cssSelector("tbody tr")); // storing the columns
		
		int sum=0;
		
	    for(int i=0;i<column.size();i++)  // loop to get the numbers
	    {
	    	List<WebElement> num= column.get(i).findElements(By.tagName("td")); //storing the numbers
	    	WebElement prices = num.get(1);
	    	String text = prices.getText();
	    	sum += Integer.parseInt(text);
	    }
		System.out.println("sum = "+ sum);
		if(sum==Integer.parseInt(driver.findElement(By.xpath("//b[text()='858']")).getText()))  //comparing the sum
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		
		driver.quit();
		
	}

}
