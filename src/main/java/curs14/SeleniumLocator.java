package curs14;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SeleniumLocator extends BaseTest {

	@Test(priority =1)
	public void tagNameExample() {
		//<em>Discover</em>
		
		WebElement discoverText = driver.findElement(By.tagName("em"));
		//metoda getText() ne aduce textul dintre tagurile html
		String text = discoverText.getText();
		assertEquals(text, "Discover");
		
	}
	
	@Test(priority =2)
	public void linkTextExample() {
		//<a href="https://keybooks.ro/shop/">Books</a>
		
		WebElement shopLink = driver.findElement(By.linkText("BOOKS"));
		shopLink.click();
		//getCurrentUrl() --> intoarce url la care se afla aplicatia acum
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	
	}
	@Test(priority =3)
	public void partialLinkTextExample() {
		//<a href="https://keybooks.ro/shop/cooking-with-love/">Cooking with love</a>
		WebElement cookingBookLink = driver.findElement(By.partialLinkText("love"));
		cookingBookLink.click();	
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
	
	}
	@Test(priority =4)
	public void classNameLocator() {
		
		WebElement price =  driver.findElement(By.className("price"));		
		System.out.println(price.getText());
		assertTrue(price.getText().contains("18.49"));

	}
	@Test(priority =5)
	public void idLocator() {
		WebElement reviewTab =  driver.findElement(By.id("tab-title-reviews"));
		reviewTab.click();
		
		WebElement reviewElement =  driver.findElement(By.className("woocommerce-Reviews-title"));
		//daca vreau sa verific ca elementul este vizibil
		assertTrue(reviewElement.isDisplayed());
		//daca vreau sa verific ca elementul contine un anumit text
		assertEquals(reviewElement.getText(), "Reviews");
	}
	@Test(priority =6)
	public void nameLocator() {	
		WebElement messageBox =  driver.findElement(By.name("comment"));
		//sendKeys --> simuleaza scriere de la tastatura
		messageBox.sendKeys("My message");
	}
	
	@Test(priority =7)
	public void cssSelector() {
		//<input id="author" name="author" type="text" value="" size="30" required="">
		WebElement nameTextBox =  driver.findElement(By.cssSelector("input[name=\"author\"]"));
		nameTextBox.sendKeys("My name");	
	}
	
	@Test(priority=8)
	public void xpathLocator() {
		WebElement emailTextBox =  driver.findElement(By.xpath("//input[@type='email']"));
		emailTextBox.sendKeys("test@test.com");	
	}
	
}
