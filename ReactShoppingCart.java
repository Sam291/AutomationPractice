package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReactShoppingCart {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        driver.findElement(By.cssSelector("a[class='github-button']")).isDisplayed();
        driver.findElement(By.cssSelector("a[class='github-button']")).click();
        System.out.println(driver.getTitle());
        if(driver.getTitle().contains("jefferson"));
        {
        	System.out.println("window Changed");
        }
        
        driver.findElement(By.xpath("//h2[@class='heading-element']//a[@href=\"https://react-shopping-cart-67954.firebaseapp.com/\"]")).click();
        String items  = (driver.findElement(By.cssSelector("main[class='sc-ebmerl-4 iliWeY']")).getText().split(" "))[0];
        int elements = Integer.parseInt(items);
        
        int count = driver.findElements(By.cssSelector("div[tabindex='1']")).size();
        if(count == elements )
        {
        	System.out.println("Elements matching");
        }
        
        else {
              	System.out.println("Elements not matching");
              
        }
        
        driver.findElement(By.xpath("//span[@class='checkmark' and text() = 'S']")).click();
        int count1 = driver.findElements(By.cssSelector("div[tabindex='1']")).size();
        
        String item  = (driver.findElement(By.cssSelector("main[class='sc-ebmerl-4 iliWeY']")).getText().split(" "))[0];
        int element = Integer.parseInt(item);
        
        if(count1 == element )
        {
        	System.out.println("Elements matching");
        }
        
        else {
              	System.out.println("Elements not matching");
              
        }
        Thread.sleep(2000);
        
        WebElement ele = driver.findElement(By.cssSelector("button[class='sc-124al1g-0 jCsgpZ']"));
        //System.out.println("Item color before hover is"+ ele.getCssValue("color"));
        String beforecolor = ele.getCssValue("background-color");
        System.out.println("Item color before hover is"+ beforecolor);
        
        Actions action = new Actions(driver);  //for hovering of element
        action.moveToElement(ele).perform();
        String color = ele.getCssValue("background-color");
        System.out.println("Item color after hover is"+ color);
        
        driver.findElement(By.cssSelector("button[class='sc-124al1g-0 jCsgpZ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='sc-1h98xa9-11 gnXVNU']")).click();
        driver.switchTo().alert().accept();
        driver.quit();
        
    }
}
