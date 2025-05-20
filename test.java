package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver.findElement(By.cssSelector("span[class='caret']")).click();
		driver.findElement(By.cssSelector("a[href=\"https://naveenautomationlabs.com/opencart/index.php?route=account/register\"]")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("saket");
		driver.findElement(By.id("input-lastname")).sendKeys("parmar");
		driver.findElement(By.id("input-email")).sendKeys("saket.parmar222@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9712989789");
		driver.findElement(By.id("input-password")).sendKeys("abcde");
		driver.findElement(By.id("input-confirm")).sendKeys("abcde");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector("i[class='fa fa-home']")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[3]")).click();
		driver.findElement(By.cssSelector("i[class='fa fa-share']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-payment-firstname")).sendKeys("saket");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("parmar");
		driver.findElement(By.id("input-payment-address-1")).sendKeys("gorakhpur");
		driver.findElement(By.id("input-payment-city")).sendKeys("jabalpur");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("482001");
		driver.findElement(By.id("input-payment-zone")).click();
		driver.findElement(By.xpath("//option[@value='3513']")).click();
		driver.findElement(By.id("button-payment-address")).click();
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("abc");
		driver.findElement(By.id("//input[@type='checkbox']")).click();
		driver.findElement(By.id("button-payment-method")).click();
	}

}
