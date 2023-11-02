package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest {

	
	@Test
	public void xpathExample() throws InterruptedException {
		
		driver.findElement(By.xpath("//li[@class='menu_user_login']")).click();
		
		//logical OR
		driver.findElement(By.xpath("//input[@id='log' or @name = 'log']")).sendKeys("TestUser");
		//logical AND
		driver.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("12345@67890");
		
		driver.findElement(By.xpath("//input[@class='submit_button']")).click();
		
		Thread.sleep(4000);
	}
	
	
	
}
