package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;
import utils.SeleniumWrappers;

public class IsSelectedExample extends BaseTest{
 /*
  * metoda isSelected() se aplica doar pe elemente care au atributul :
  * type = "checkbox" sau type = "radio-button"
  * si verifica daca elementul este selectat sau nu
  * intoarce o valoare boolean
  * 
  */
		
	@Test
	public void isSelectedTest() {
		
		app.menu.navigateTo(app.menu.loginLink);
		app.returnWebElement(app.login.rememberMeCheckBox).click();
		assertTrue(app.returnWebElement(app.login.rememberMeCheckBox).isSelected());
		
		
		
	
	/*	MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		SeleniumWrappers seleniumWrapper =  new SeleniumWrappers();
		
		System.out.println(seleniumWrapper.returnWebElement(login.rememberMeCheckBox));
		seleniumWrapper.returnWebElement(login.rememberMeCheckBox).click();
		System.out.println(seleniumWrapper.returnWebElement(login.rememberMeCheckBox));
	
		/*WebElement rememberMe = driver.findElement(login.rememberMeCheckBox);	
		System.out.println(rememberMe.isSelected());	
		rememberMe.click();
		System.out.println(rememberMe.isSelected());*/

		
	}
	
	
}
