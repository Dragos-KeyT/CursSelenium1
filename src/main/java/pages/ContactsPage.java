package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ContactsPage extends SeleniumWrappers{

	public ContactsPage(WebDriver driver) {
		super(driver);
	}
	
	
	public By zoomInButton =  By.cssSelector("button[title='Zoom in']");
	public By zoomOutButton =  By.cssSelector("button[title='Zoom out']");
	public By iframe =  By.tagName("iframe");
	
	public By nameField = By.cssSelector("input[name='your-name']");

	public void zoomMap(By locator) {
		driver.switchTo().frame(returnWebElement(iframe));
		click(locator);
	}

}
