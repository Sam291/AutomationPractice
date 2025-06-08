package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SauceDemo_ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println(title);
        //if (title.equals("Swag Labs"))
        //{
        //	System.out.println("Title Matched");
        //}
        
        //else
        //{
        	//System.out.println("Title not Matched");
        //}
        Assert.assertEquals(title,"Swag Labs","Title is misMatched");
        
        WebElement text = driver.findElement(By.xpath("//input[@value='Login']"));
        String button = text.getDomAttribute("value");
        System.out.println(button);
        String butt = button.toUpperCase();
        if (button.equals(butt))
        {
        	System.out.println("login button text is capitalized");
        }
        
        else 
        {
        	System.out.println("login button text is not capitalized");
        }
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
        
        //driver.switchTo().alert().accept();
        WebElement filter = driver.findElement(By.xpath("//span[@class='active_option'][text()='Name (A to Z)']"));
        //Assert.assertEquals("Verify default filter dropdown is A-Z","Name (A to Z)",filter.getText());
        
        if(filter.getText().equals("Name (A to Z)"))
        {
        	System.out.println("default filter dropdown is A-Z");
        }
        
        else
        {
        	System.out.println("default filter dropdown is not A-Z");
        }
        
        
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        
        WebElement Item =  driver.findElement(By.xpath("//span[@class='shopping_cart_badge'][text()='1']"));
        if(Item.getText().equals("1"))
        {
    	   System.out.println("Cart has 1 item");
        }
        
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        
        WebElement Items =  driver.findElement(By.xpath("//span[@class='shopping_cart_badge'][text()='1']"));
        if(Items.getText().equals("1"))
        {
    	   System.out.println("Cart has 1 item");
        }
        
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        
        driver.findElement(By.xpath("//div[@class='inventory_item_name']")).isDisplayed();
        
        driver.findElement(By.id("continue-shopping")).click();
        
        // List<WebElement> items = driver.findElements(By.cssSelector("select[class='product_sort_container']"));
        // WebElement price = items.get(2);
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
        driver.findElement(By.cssSelector("option[value='lohi']")).click();
        List<WebElement> pricelist = driver.findElements(By.cssSelector("div[class='inventory_item_price']"));
        
       // WebElement priceitems = pricelist.get(1);
        String[] arrprice = new String[pricelist.size()];
        
        for(int i=0; i<pricelist.size();i++)
        {
        	String fullcost = pricelist.get(i).getText().replace("$","");
        	arrprice[i]= fullcost;
        }
        
		for(int i=0; i<arrprice.length-1;i++)
		{
			double a = Double.parseDouble(arrprice[i]);
			double b = Double.parseDouble(arrprice[i+1]);
			if(a>b)
			{
				System.out.println("Price Items not Sorted");
				break;
			}
			else if(i==arrprice.length-2)
			{
				System.out.println("Price Items Sorted in ascending order");
				break;
			}
			else
				continue;
		}
		driver.quit(); 
	}
}
