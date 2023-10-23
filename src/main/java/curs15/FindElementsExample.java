package curs15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FindElementsExample extends BaseTest{
		//findElement --> returneaza un WebElement
		//findElements --> returneaza o Lista de WebElemente
	
	
	@Test
	public void findElementsExample() {
		
		List<WebElement> books =  driver.findElements(By.cssSelector("a[href*='the']"));
		System.out.println(books.size());
		
		books.get(2).click();
		
	}
	
	
}
